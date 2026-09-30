package DSA_Problems.Recursion;

public class PowOfN {

    public static int powerOfN(int n){

        if(n==0){
            return 1;
        }

        return 2*powerOfN(n-1);
    }

    public static void main(String[] args) {
        
        int n = 5;
        System.out.println(powerOfN(n));
    }
    
}
