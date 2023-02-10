public class Counting_number_of_zeroes {

    public static void main(String[] args) {
        int number = count_zeroes(100);
        System.out.println(number);

    }

    static int count_zeroes(int n){
        return helper(n, 0);
    }

//    Special pattern, how to return the same value to above function calls

    private static int helper(int n, int count){
        if(n == 0){
            return count;
        }

        int remainder = n % 10;
        if(remainder == 0){
            return helper(n / 10, count + 1);
        }
        return helper(n / 10, count);
    }
}
