package Task_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_4_Repeated_words {

    public static void main(String[] args) {
        int count = 0;
        Map<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sentence:");
        String sentence = scanner.nextLine();
        System.out.println("Enter word:");
        String word = scanner.nextLine();
        String[] array = sentence.split(" ");
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else map.put(array[i], 1);
        }
        for (Map.Entry pair : map.entrySet()) {
            if (pair.getKey().equals(word)) {
                System.out.println("The word \"" + word + "\" occurs " + pair.getValue() + " times.");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Sorry, the word \"" + word + "\" is out. ");
        }
    }
}


