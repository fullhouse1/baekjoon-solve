package sg5;

import java.util.*;

public class No1152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        StringTokenizer wordtoken = new StringTokenizer(word, " ");
        System.out.println(wordtoken.countTokens());
    }
}