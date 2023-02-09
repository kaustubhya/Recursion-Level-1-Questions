public class N_to_1_and_1_to_N_results {
    public static void main(String[] args) {
        both_call(5);

    }

    static void both_call(int n){
        if (n == 0){
            return;
        }

        System.out.print(n + " ");


        both_call(n - 1);

        System.out.print(n + " ");
    }
}

