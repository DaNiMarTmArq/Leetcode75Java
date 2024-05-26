public class MergeString1768 {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder stringBuilder = new StringBuilder();

        int len1 = word1.length();
        int len2 = word2.length();
        int largestLength = Math.max(len1, len2);

        for (int i = 0; i < largestLength; i++) {
            if (i + 1 <= len1) {
                stringBuilder.append(word1.charAt(i));
            }
            if (i + 1 <= len2) {
                stringBuilder.append(word2.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
