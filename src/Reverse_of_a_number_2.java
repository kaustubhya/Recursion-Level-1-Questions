public class Reverse_of_a_number_2 {

    static int reverse_2(int n){
        // sometimes you might need some additional variables in the arguments,
        // in that case, make another function
        int digits = (int)(Math.log10(n) + 1);
//        returns the no. of digits of a given number n
        // type out the line below to verify
//        return digits;
        return helper(n, digits);
    }

    private static int helper(int n, int digits){
        if(n % 10 == n){
            return n;
        }
        int rem = n % 10;
        return rem * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);

    }

    public static void main(String[] args) {
        System.out.println(reverse_2(4501));
    }
}
