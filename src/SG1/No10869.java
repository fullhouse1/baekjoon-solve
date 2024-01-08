package SG1;

import java.util.Scanner;

public class No10869 {
    public static void main(String[] args) {
        int a, b = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        int result1 = a + b;
        int result2 = a - b;
        int result3 = a * b;
        int result4 = a / b;
        int result5 = a % b;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }
}
