public class N_to_1_print_nos {
    public static void main(String[] args) {
        reversal_call(5);

    }

    static void reversal_call(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        reversal_call(n-1);
    }
}
