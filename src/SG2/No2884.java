package SG2;

import java.util.Scanner;

public class No2884 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        if (a > 0 && b < 45) {
            System.out.printf("%d %d", a - 1, b + 60 - 45);
        } else if (a > 0 && b >= 45) {
            System.out.printf("%d %d", a, b - 45);
        } else if (a == 0 && b < 45) {
            System.out.printf("%d %d", 23, b + 60 - 45);
        } else {
            System.out.printf("%d %d", a, b - 45);
        }
    }
}