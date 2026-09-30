package DSA_Problems.Recursion;

public class OnetoN {

    public static void println(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        println(n+1);
    }
    public static void main(String[] args) {
        int n = 1;
        println(n);

    }
}
