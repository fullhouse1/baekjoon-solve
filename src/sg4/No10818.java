package sg4;

import java.util.Scanner;

public class No10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] b = new int[x];
        int max = -1000000;
        int min = 1000000;

        for (int i = 0; i < x; i++) {
            b[i] = sc.nextInt();
            if (b[i] >= max) {
                max = b[i];
            }
            if (b[i] <= min) {
                min = b[i];
            }
        }
        System.out.print(min + " " + max);
    }
}