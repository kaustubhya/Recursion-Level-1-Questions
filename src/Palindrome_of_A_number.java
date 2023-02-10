public class Palindrome_of_A_number {

    static int reversal(int n){
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);

    }

    private static int helper(int n, int digits){
        if(n % 10 == n){
            return n;
        }

        int remainder = n % 10;

        return (remainder * (int) (Math.pow(10, digits - 1)) + helper (n / 10, digits - 1));
    }

    static boolean isPalindrome(int n){
        return n == reversal(n);
    }

    public static void main(String[] args) {
        boolean ans = isPalindrome(78969875);
        System.out.println(ans);
    }


}
