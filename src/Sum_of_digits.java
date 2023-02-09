public class Sum_of_digits {
    public static void main(String[] args) {
        int ans = sum_of_digits(1234567890);
        System.out.println(ans);

    }

    static int sum_of_digits(int n){
        if(n == 0){
            return 0;
        }

        return (n % 10) + sum_of_digits(n / 10);
    }
}
