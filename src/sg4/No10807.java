package sg4;

import java.util.Scanner;

public class No10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int x = sc.nextInt();
        int[] b = new int[x];

        for (int i = 0; i < x; i++) {
            b[i] = sc.nextInt();
        }

        int y = sc.nextInt();

        for (int j = 0; j < x; j++) {
            if (y == b[j]) {
                count++;
            }
        }
        System.out.println(count);
    }
}