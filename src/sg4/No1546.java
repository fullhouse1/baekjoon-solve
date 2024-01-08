package sg4;

import java.util.Scanner;

public class No1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y[] = new int[x];
        double max = 0;
        double sum = 0;

        for (int i = 0; i < x; i++) {
            y[i] = sc.nextInt();
            if (y[i] >= max) {
                max = y[i];
            }
        }
        for (int j = 0; j < x; j++) {
            sum += y[j] / max * 100;
        }
        System.out.println(sum / x);
    }
}