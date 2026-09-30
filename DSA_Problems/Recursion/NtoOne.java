package DSA_Problems.Recursion;

public class NtoOne {

    public static void println(int n) {

        if(n==0){
            return;
        }
        System.out.println(n);
        println(n-1);

    }
    public static void main(String[] args) {
        int n =5;
        println(n);
    }
    
}
