public class NumberPalindrome {
    public static boolean isPalindrome(int n) {
        int temp = n, rev = 0;
        while (temp > 0) {
            rev = rev * 10 + (temp % 10);
            temp /= 10;
        }
        return n == rev;
    }
    public static void main(String[] args) {
        int num = 121;
        System.out.println(num + " is palindrome? " + isPalindrome(num));
    }
}