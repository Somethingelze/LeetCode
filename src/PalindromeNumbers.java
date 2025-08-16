public class PalindromeNumbers {

    public boolean isPalindrome(int x) {
        boolean isPalindrome = true;

        String string = Integer.toString(x);

        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

}
