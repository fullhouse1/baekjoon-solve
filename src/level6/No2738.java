package level6;

import java.util.Scanner;

public class No2738 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrixnum1 = scanner.nextInt();
        int matrixnum2 = scanner.nextInt();
        int[][] numberArray1 = new int[matrixnum1][matrixnum2];
        int[][] numberArray2 = new int[matrixnum1][matrixnum2];

        for (int i = 0; i < matrixnum1; i++) {
            for (int j = 0; j < matrixnum2; j++) {
                numberArray1[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < matrixnum1; i++) {
            for (int j = 0; j < matrixnum2; j++) {
                numberArray2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < matrixnum1; i++) {
            for (int j = 0; j < matrixnum2; j++) {
                numberArray2[i][j] = numberArray1[i][j] + numberArray2[i][j];
                System.out.print(numberArray2[i][j] + " ");
            }
            System.out.println();
        }
    }
}