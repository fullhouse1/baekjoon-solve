package SG5;

import java.util.Scanner;

public class No2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        String p = "";

        for (int i = 0; i < t; i++) {
            int r = sc.nextInt();
            String s = sc.next();

            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < r; k++) {
                    p += Character.toString(s.charAt(j));
                }
            }
            System.out.println(p);
            p = "";
        }
    }
}