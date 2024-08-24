package backtracking;

public class sudokuSolver {

    public static boolean safe(int[][] suduko, int row, int col, int digit) {

        for (int i = 0; i <= 8; i++) {
            if (suduko[i][col] == digit) {
                return false;
            }
        }

        for (int i = 0; i <= 8; i++) {
            if (suduko[row][i] == digit) {
                return false;
            }
        }

        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (suduko[i][j] == digit) {
                    return false;
                }

            }
        }

        return true;

    }

    public static boolean sudokuSolve(int[][] sudoku, int row, int col) {
        if (row == 9) {
            return true;
        }

        int nextRow = row;
        int nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }
        if (sudoku[row][col] != 0) {
            return sudokuSolve(sudoku, nextRow, nextCol);

        }

        for (int i = 1; i <= 9; i++) {
            if (safe(sudoku, row, col, i)) {
                sudoku[row][col] = i;
                if (sudokuSolve(sudoku, nextRow, nextCol)) {
                    return true;
                }
                sudoku[row][col] = 0;

            }
        }

        return false;
    }

    public static void print(int sudoku[][]) {
        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j <= 8; j++) {
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void main(String[] args) {

        int sudoku[][] = {
                { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 } };

        if (sudokuSolve(sudoku, 0, 0)) {
            print(sudoku);
        } else {
            System.out.println("no solution");
        }

    }
}
