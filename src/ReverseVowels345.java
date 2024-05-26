import java.util.Stack;

public class ReverseVowels345 {
    public String reverseVowels(String s) {
        Stack<Character> vowels = new Stack<>();
        StringBuilder reversed = new StringBuilder();
        int sLength = s.length();

        for (int i = 0; i < sLength; i++) {
            char currentLetter = s.charAt(i);
            if(isVowel(currentLetter)) vowels.push(currentLetter);
        }

        for (int i = 0; i < sLength; i++) {
            char currentLetter = s.charAt(i);
            if(isVowel(currentLetter)) {
                reversed.append(vowels.pop());
            } else {
                reversed.append(currentLetter);
            }
        }
        return reversed.toString();
    }

    public static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}
