package level3;

import java.util.Scanner;

public class No25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i % 4 == 0) {
                System.out.print("long ");
            }
        }
        System.out.print("int");
    }
}