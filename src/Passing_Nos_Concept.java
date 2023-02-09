public class Passing_Nos_Concept {
    public static void main(String[] args) {
        passing_nos(5);

    }

    static void passing_nos(int n){
        if(n == 0){
            return;
        }

        System.out.println(n);
        passing_nos(--n);
//        use n-- and --n here and see the difference
//        --n first subtracts, then prints via recursion
        // in contrast, n-- first prints via recursion and then subtracts. This gives us
//        infinite recursion
    }
}
