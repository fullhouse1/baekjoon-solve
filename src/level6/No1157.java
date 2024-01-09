package level6;

import java.util.Scanner;

public class No1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().toUpperCase();
        int[] wordvalue = new int[26];
        int maxValue = 0;
        char maxChar = 0;

        for (int i = 0; i < word.length(); i++) {
            wordvalue[word.charAt(i)-'A']++;
        }
        for (int i = 0; i < wordvalue.length; i++) {
            int number = wordvalue[i] - maxValue;
            if (number > 0) {
                maxValue = wordvalue[i];
                maxChar = (char)('A'+i);
            }else if (number == 0) maxChar ='?';
        }
        System.out.println(maxChar);
    }
}