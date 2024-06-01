import java.util.Stack;

public class ReverseWordString {
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        var builder = new StringBuilder();
        String[] words = s.split(" ");
        for (String word : words) {
            if (!word.trim().isEmpty()) {
                stack.push(word);
            }
        }
        while(!stack.empty()) builder.append(stack.pop() + " ");

        return builder.toString().trim();
    }
}
