package SG4;

import java.util.Arrays;
import java.util.Scanner;

public class No3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];

        for (int i = 1; i <= 10; i++) {
            int x = sc.nextInt();
            a[i - 1] = x % 42;
        }
        a = Arrays.stream(a).distinct().toArray();
        System.out.println(a.length);
    }
}