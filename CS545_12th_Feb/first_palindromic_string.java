class first_palindrome_string {
    public String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            if (isPalindrome(words[i])) {
                return words[i];
            }
        }
        return "";
    }
    public static boolean isPalindrome(String word) {
        if (word.length() <= 1) {
            return true;
        }else if (word.charAt(0) != word.charAt(word.length() - 1)) {
            return false;
        }
        return isPalindrome(word.substring(1, word.length() - 1));
    }
}