package level3;

import java.util.Scanner;

public class No8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = 0;
        for (int i = 1; i <= x; i++) {
            y += i;
        }
        System.out.println(y);
    }
}