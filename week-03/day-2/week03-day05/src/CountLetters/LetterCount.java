import java.util.HashMap;
import java.util.Map;

public class LetterCount {
    public static Map<Character, Integer> countLetters(String input) {
        Map<Character, Integer> letterCountMap = new HashMap<>();

        // Convert the input string to lowercase (if case-insensitive counting is desired)
        input = input.toLowerCase();

        // Loop through each character in the input string
        for (char c : input.toCharArray()) {
            // Check if the character is a letter
            if (Character.isLetter(c)) {
                // Increment the count for this letter in the map
                letterCountMap.put(c, letterCountMap.getOrDefault(c, 0) + 1);
            }
        }

        return letterCountMap;
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        Map<Character, Integer> result = countLetters(input);

        // Print the letter count map
        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
