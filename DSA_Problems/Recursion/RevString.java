package DSA_Problems.Recursion;

public class RevString {

    public static String revString(String str){
        if(str.length()<=1){
            return str;
        }
        return revString(str.substring(1))+str.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(revString("hello"));
    }
    
}
