package level6;

import java.util.Scanner;

public class No10798 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] charArray = new char[5][15];

        for (int i = 0; i < 5; i++) {
            String input = scanner.next();
            for (int j = 0; j < input.length(); j++) {
                charArray[i][j] = input.charAt(j);
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (charArray[j][i] == ' ' || charArray[j][i] == '\0') {
                    continue;
                }
                System.out.print(charArray[j][i]);
            }
        }

    }
}