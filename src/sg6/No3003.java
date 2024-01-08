package sg6;

import java.util.Scanner;

public class No3003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] blackchess = new int[]{1, 1, 2, 2, 2, 8};
        int[] whitechess = new int[blackchess.length];

        for (int i = 0; i < blackchess.length; i++) {
            whitechess[i] = scanner.nextInt();
            if (whitechess[i] > blackchess[i]) {
                whitechess[i] = -(whitechess[i] - blackchess[i]);
            } else {
                whitechess[i] = blackchess[i] - whitechess[i];
            }
            System.out.print(whitechess[i] + " ");
        }
    }
}