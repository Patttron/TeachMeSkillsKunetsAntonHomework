package Unit5;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Unit5_Alphabet {

    public static void main(String[] args) {
        createAlphabet();
        countLetters(createAlphabet(), inputString());
    }

    private static String inputString() {
        System.out.println("Enter your sentence: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        return input.toUpperCase(Locale.ROOT);
    }

    private static HashMap<Character, Integer> createAlphabet() {
        HashMap<Character, Integer> alphabet = new HashMap<>();
        for (char i = 'A'; i <= 'Z'; i++) {
            alphabet.put(i, 0);
        }
        return alphabet;
    }

    private static void countLetters(HashMap<Character, Integer> alphabet, String input) {
        char[] array = input.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (alphabet.containsKey(array[i])) {
                alphabet.put(array[i], alphabet.get(array[i]) + 1);
            }
        }
        for (HashMap.Entry<Character, Integer> entry : alphabet.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
