package SG5;

import java.util.Scanner;

public class No11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String s = sc.next();
        int sum = 0;

        for (int i = 0; i < num; i++) {
            sum += Character.getNumericValue(s.charAt(i));
        }
        System.out.println(sum);
    }
}