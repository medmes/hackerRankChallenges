package hackerrank.backtracking;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CrosswordPuzzle {

    private static final int SIZE = 10;
    private static final int[] R_OFFSETS = { 0, 1 };
    private static final int[] C_OFFSETS = { 1, 0 };

    public static void main(String[] args) {
        //Sample:
        String[] crossWords = new String[] {
                "+-++++++++",
                "+-++++++++",
                "+-------++",
                "+-++++++++",
                "+-++++++++",
                "+------+++",
                "+-+++-++++",
                "+++++-++++",
                "+++++-++++",
                "++++++++++"
        };
        String words = "AGRA;NORWAY;ENGLAND;GWALIOR";


        String[] solution = crosswordPuzzle(crossWords, words);

        for (String line :
                solution) {
            System.out.println(line);

        }
    }

    // Complete the crosswordPuzzle function below.
    static String[] crosswordPuzzle(String[] crossword, String words) {
        char[][] grid = WordsToCharGrid(crossword);
        char[][] solution = solve(grid, words.split(";"));
        return charGridToArrayWords(solution);
    }

    public static char[][] solve(char[][] grid, String[] words) {
        return searchConfiguration(grid, Arrays.stream(words).collect(Collectors.toSet()), 0, 0, 0);
    }

    private static char[][] searchConfiguration(char[][] grid, Set<String> remainWords, int r, int c, int direction) {
        if (r == SIZE) {
            return grid;
        }
        if (c == SIZE) {
            return searchConfiguration(grid, remainWords, r + 1, 0, 0);
        }
        if (direction == R_OFFSETS.length) {
            return searchConfiguration(grid, remainWords, r, c + 1, 0);
        }

        int insertLength = countInsertLength(grid, r, c, direction);
        if (insertLength > 1) {
            for (String remainWord : new ArrayList<>(remainWords)) {
                if (canInsert(grid, r, c, direction, insertLength, remainWord)) {
                    List<Integer> insertOffsets = new ArrayList<>();

                    for (int insertOffset = 0; insertOffset < insertLength; insertOffset++) {
                        int insertR = r + R_OFFSETS[direction] * insertOffset;
                        int insertC = c + C_OFFSETS[direction] * insertOffset;

                        if (grid[insertR][insertC] == '-') {
                            grid[insertR][insertC] = remainWord.charAt(insertOffset);

                            insertOffsets.add(insertOffset);
                        }
                    }
                    remainWords.remove(remainWord);

                    char[][] subResult = searchConfiguration(grid, remainWords, r, c, direction + 1);
                    if (subResult != null) {
                        return subResult;
                    }

                    remainWords.add(remainWord);
                    for (int insertOffset : insertOffsets) {
                        int insertR = r + R_OFFSETS[direction] * insertOffset;
                        int insertC = c + C_OFFSETS[direction] * insertOffset;

                        grid[insertR][insertC] = '-';
                    }
                }
            }
            return null;
        } else {
            return searchConfiguration(grid, remainWords, r, c, direction + 1);
        }
    }

    private static int countInsertLength(char[][] grid, int r, int c, int direction) {
        int prevR = r - R_OFFSETS[direction];
        int prevC = c - C_OFFSETS[direction];
        if (prevR >= 0 && prevR < SIZE && prevC >= 0 && prevC < SIZE && grid[prevR][prevC] != '+') {
            return 0;
        }

        int insertLength = 0;
        while (r >= 0 && r < SIZE && c >= 0 && c < SIZE && grid[r][c] != '+') {
            insertLength++;

            r += R_OFFSETS[direction];
            c += C_OFFSETS[direction];
        }
        return insertLength;
    }

    private static boolean canInsert(char[][] grid, int r, int c, int direction, int insertLength, String word) {
        return word.length() == insertLength && IntStream.range(0, word.length()).allMatch(insertOffset -> {
            int insertR = r + R_OFFSETS[direction] * insertOffset;
            int insertC = c + C_OFFSETS[direction] * insertOffset;

            return grid[insertR][insertC] == '-' || grid[insertR][insertC] == word.charAt(insertOffset);
        });
    }

    static char[][] WordsToCharGrid(String[] crossword) {
        char[][] grid = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {

            for (int j = 0; j < SIZE; j++) {
                grid[i][j] = crossword[i].charAt(j);
            }
        }
        return grid;
    }

    static String[] charGridToArrayWords(char[][] grid) {
        StringBuilder stringBuilder = new StringBuilder();
        String lineSeparator = System.lineSeparator(); // Based On where JVM is Running
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                stringBuilder.append(grid[i][j]);
            }
            stringBuilder.append(lineSeparator);
        }
        return stringBuilder.toString().split(lineSeparator);
    }

}
