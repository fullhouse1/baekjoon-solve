package sg4;

import java.util.Scanner;

public class No2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] b = new int[9];
        int max = 0;
        int maxindex = 0;

        for (int i = 0; i < 9; i++) {
            b[i] = sc.nextInt();
            if (b[i] >= max) {
                max = b[i];
                maxindex = i;
            }
        }
        System.out.println(max);
        System.out.println(maxindex + 1);
    }
}