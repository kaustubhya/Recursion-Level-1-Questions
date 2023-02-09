public class Factorial_of_a_number {
    public static void main(String[] args) {
        long ans = factorial(45);
        System.out.println(ans);

    }

    static long factorial(int n){
//        we can use either long or int
        if(n <= 1){
            return 1;
//            Here we are only taking in whole nos. ( 0 to n )
//            Factorial of 0 and 1 is 1 only, hence we are returning 1
        }

        return n * factorial(n-1);
    }
}
