package Assignment15;

public class NQueen {
    public static void main(String[] args) {
        int n = 4;
        int [][] arr = new int[n][n];
        check(0 , arr);
    }

    static boolean isSafe(int row, int col, int[][] arr) {
        int N = arr.length;


        for (int i = 0; i < row; i++) {
            if (arr[i][col] == 1) {
                return false;
            }
        }


        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (arr[i][j] == 1) {
                return false;
            }
        }


        for (int i = row, j = col; i >= 0 && j < N; i--, j++) {
            if (arr[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    static void check(int row, int[][] arr) {
        int N = arr.length;
        if (row == N) {
            printBoard(arr);
            return;
        }

        for (int col = 0; col < N; col++) {
            if (isSafe(row, col, arr)) {
                arr[row][col] = 1;
                check(row + 1, arr);
                arr[row][col] = 0;
            }
        }
    }


    static void printBoard(int[][] arr) {
        for (int[] row : arr) {
            for (int cell : row) {
                System.out.print((cell == 1 ? "Q " : ". "));
            }
            System.out.println();
        }
        System.out.println();
    }

}
