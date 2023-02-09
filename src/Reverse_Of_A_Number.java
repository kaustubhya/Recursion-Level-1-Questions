public class Reverse_Of_A_Number {
    public static void main(String[] args) {
        reverse_1(543278941);
        System.out.println(sum);
        
    }

    static int sum = 0;
    static void reverse_1(int n){
        if(n == 0){
            return;
        }
        int remainder = n % 10;

        sum = sum * 10 + remainder;
        reverse_1(n / 10);
    }
}
