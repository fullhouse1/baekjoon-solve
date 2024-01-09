package level4;

import java.util.Scanner;

public class No10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] b = new int[x];

        for (int i = 0; i < x; i++) {
            b[i] = sc.nextInt();
            if (y > b[i]) {
                System.out.print(b[i] + " ");
            }
        }
    }
}