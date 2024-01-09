package level7;

import java.util.Scanner;

public class No2566 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] numberArray = new int[3][3];
        int max = -1;
        int row = 0;
        int column = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                numberArray[i][j] = scanner.nextInt();
                if (max < numberArray[i][j]) {
                    max = numberArray[i][j];
                    row = i+1;
                    column = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(row+" "+column);
    }
}