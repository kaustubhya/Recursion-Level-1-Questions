public class Product_of_digits {
    public static void main(String[] args) {
        int ans = product_of_digits(14058);
        System.out.println(ans);

    }

    static int product_of_digits(int n){
        if(n%10 == n){
            return n;
        }

        return (n%10) * product_of_digits(n/10);
    }
}
