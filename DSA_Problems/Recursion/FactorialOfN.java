package DSA_Problems.Recursion;

public class FactorialOfN {

    public static int factN(int n){
        if(n==0){
            return 1;
        }
        return n*factN(n-1);
    }
    public static void main(String[] args) {
        int n =5;
        System.out.println(factN(n));
    }
}
