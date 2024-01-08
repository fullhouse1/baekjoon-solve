package SG2;

import java.util.Scanner;

public class No1330 {
    public static void main(String[] args) {
        int a, b = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        if (a > b) {
            System.out.println(">");
        } else if (a == b) {
            System.out.println("==");
        } else {
            System.out.println("<");
        }
    }
}