package DSA_Problems.Recursion;

public class RecusiveDigitSum {

    public static int digitSum(int n){
        if(n<10){
            return n;
        }
        int sum =0;
        while(n>0){
            sum= sum+n%10;
            n=n/10;
        }
        return digitSum(sum);
    }

    public static void main(String[] args) {
        System.out.println(digitSum(4541));
    }
    
}
