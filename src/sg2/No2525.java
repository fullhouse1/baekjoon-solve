package sg2;

import java.util.Scanner;

public class No2525 {
    public static void main(String[] args) {
        int a, b, c = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        a = a + (c / 60);
        b = b + (c % 60);
        if (b >= 60) {
            a = (a % 24) + 1;
            b = b % 60;
        }
        if (a >= 24) {
            a = a % 24;
        }
        System.out.printf("%d %d", a, b);
    }
}