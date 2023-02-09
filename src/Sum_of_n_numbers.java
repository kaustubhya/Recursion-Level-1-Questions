public class Sum_of_n_numbers {
    public static void main(String[] args) {
        int ans = sum(2);
        System.out.println(ans);

    }

    static int sum(int n){
        if(n == 1){
            return 1;
        }
        else if(n == 0){
            return 0;
        }

        return n + sum(n-1);
    }
}
