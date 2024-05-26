

public class StringCommonDivisor1071 {
    public String gcdOfStrings(String str1, String str2) {
        if(str1.contains(str2) || str2.contains(str1)) {
            int gcd = findGCD(str1.length(), str2.length());
            String sub = str1.substring(0, gcd);
            if (canBeDivided(str1, sub) && canBeDivided(str2, sub) ) return sub;
            return "";
        }
        return "";
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static boolean canBeDivided(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        // If the length of the first string is not a multiple of the length of the second string, return false
        if (len1 % len2 != 0) {
            return false;
        }

        // Calculate the number of parts the first string can be divided into
        int parts = len1 / len2;

        // Construct the expected string using the second string
        StringBuilder expected = new StringBuilder();
        for (int i = 0; i < parts; i++) {
            expected.append(str2);
        }

        // Check if the constructed string is equal to the first string
        return expected.toString().equals(str1);
    }
}
