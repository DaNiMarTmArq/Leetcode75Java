public class Main {
    public static void main(String[] args) {
        var reverse = new ReverseWordString();
        System.out.println(reverse.reverseWords("the sky is blue"));
        System.out.println(reverse.reverseWords("  hello world  "));
        System.out.println(reverse.reverseWords("a good   example"));
    }
}