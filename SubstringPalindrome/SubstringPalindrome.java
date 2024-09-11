public class SubstringPalindrome {

    
    public static boolean isPalindrome(String input) {
        int i = 0;
        int j = input.length() - 1;
        while (i < j) {
            if (input.charAt(i) != input.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


    public static String longestPalindromicSubstring(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        
        String longestPalindrome = "";
        
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String substring = str.substring(i, j + 1);
                if (isPalindrome(substring) && substring.length() > longestPalindrome.length()) {
                    longestPalindrome = substring;
                }
            }
        }
        
        return longestPalindrome;
    }

    public static void main(String[] args) {
        String input = "babad";
        System.out.println("Longest palindromic substring of '" + input + "' is: " + longestPalindromicSubstring(input));
    }
}
