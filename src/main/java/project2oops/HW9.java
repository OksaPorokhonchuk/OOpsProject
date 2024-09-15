package project2oops;

import java.util.LinkedHashMap;
import java.util.Map;

public class HW9 {
    public static Character nonRepeating(String s) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();
        for (char ch : s.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();

            }
        }
        return null;

    }

    public static void main(String[] args) {
        String input = "abracadabra";
        Character firstNonRepeating = nonRepeating(input);

        if (firstNonRepeating != null) {
            System.out.println("The first non-repeating character is: " + firstNonRepeating); // Expected output: c
        } else {
            System.out.println("There are no non-repeating characters.");
        }
    }
}
