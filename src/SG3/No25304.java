package SG3;

import java.util.Scanner;

public class No25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int y = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            y += a * b;
        }
        if (y == x) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}