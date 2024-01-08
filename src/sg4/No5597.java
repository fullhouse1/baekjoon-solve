package sg4;

import java.util.Scanner;

public class No5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[30];

        for (int i = 0; i < 28; i++) {
            int y = sc.nextInt();
            x[y - 1] = y;
        }
        for (int j = 1; j <= 30; j++) {
            if (x[j - 1] == 0) {
                System.out.println(j);
            }
        }
    }
}