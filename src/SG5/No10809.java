package SG5;

import java.util.Scanner;

public class No10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(s.indexOf(ch) + " ");
        }
    }
}