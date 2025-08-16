public class Main {
    public static void main(String[] args) {
        PalindromeNumbers palindromeNumbers = new PalindromeNumbers();
        TwoSum twoSum = new TwoSum();


        System.out.println("palindromeNumbers.isPalindrome(12121) = " + palindromeNumbers.isPalindrome(12121));


        int[] nums = new int[]{3,3};
        int target = 6;
        int[]sum = twoSum.twoSum(nums, target);
        for (int j : sum) {
            System.out.println(j);
        }
    }
}