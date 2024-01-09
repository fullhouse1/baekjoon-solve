package level6;

import java.util.Scanner;

public class No10988 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String alphabet = scanner.nextLine();
        char[] alphabetarray = alphabet.toCharArray();

        for (int i = 0, j = alphabet.length() - 1; i < alphabet.length(); i++) {
            if (alphabetarray[i] == alphabetarray[j]) {
                j--;
            } else {
                System.out.print("0");
                break;
            }
            if (j - i <= 1) {
                System.out.print("1");
                break;
            }
        }
    }
}