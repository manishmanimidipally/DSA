package DSA_Problems.HashMap;
import java.util.Map;
import java.util.HashMap;
public class DifferentOfNumber {
    public static void main(String args[]){

        int arr[] = {1,2,3,4,5,6};
        int k = 2;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){

            int val = arr[i];

            //check with addition of the value and k 
            if(map.containsKey(val+k)){
                System.out.println("The Pair is found ");
                System.out.println("The indexes of the pairs is "+map.get(val+k)+" and "+i);
                System.out.println("The Values of the pairs is "+(val-k)+" and "+(val+k));
                return;
            }

            if(map.containsKey(val-k)){
                System.out.println("The pairs are found ");
                System.out.println("The indexes are "+map.get(val-k)+" and "+i);
                System.out.println("The Values of the pairs is "+(val+k)+" and "+(val-k));
                return;
            }
            else{
                map.put(arr[i],i);
            }

        }

        System.out.println("The Pair is not found ");

    }
}
