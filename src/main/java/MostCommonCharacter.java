import java.util.HashMap;
import java.util.Map;


public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {

        Map<Character, Integer> chars = new HashMap<>();

        for (char c : str.toCharArray()) {
            chars.put(c, chars.getOrDefault(c, 0) + 1);
        }

        char mostRecurringChar = ' ';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : chars.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostRecurringChar = entry.getKey();
            }
        }

        return mostRecurringChar;
    }
}
