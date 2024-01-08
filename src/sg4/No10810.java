package sg4;

import java.util.Scanner;

public class No10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] z = new int[x];
        int a, b, c;

        for (int i = 0; i < y; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            for (int j = a; j <= b; j++) {
                z[j-1] = c;
            }
        }
        for (int k = 0; k < x; k++) {
            System.out.print(z[k] + " ");
        }
    }
}