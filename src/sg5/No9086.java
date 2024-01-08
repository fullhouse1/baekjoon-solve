package sg5;

import java.util.Scanner;

public class No9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            String word = sc.next();
            System.out.print(word.charAt(0));
            System.out.println(word.charAt(word.length() - 1));
        }
    }
}