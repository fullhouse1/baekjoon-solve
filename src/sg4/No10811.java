package sg4;

import java.util.Scanner;

public class No10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z[] = new int[x];

        for (int i = 0; i < x; i++) {
            z[i] = i + 1;
        }
        for (int j = 0; j < y; j++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;

            for (int q = a, w = b; q < w; q++, w--) {
                int c = z[q];
                z[q] = z[w];
                z[w] = c;
            }
        }
        for (int k = 0; k < x; k++) {
            System.out.print(z[k] + " ");
        }
    }
}