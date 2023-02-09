public class One_to_n_print_nos {
    public static void main(String[] args) {
        forward_call(5);

    }

    static void forward_call(int n){
        if (n == 0){
            return;
        }

        forward_call(n - 1);

        System.out.print(n + " ");
    }
}
