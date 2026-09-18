package DSA_Problems.HashMap;
import java.util.Map;
import java.util.HashMap;

public class FirstNonRepeatingElement {
    public static void main(String args[]){

        int arr[] = {1,2,3,2,1,4};
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==1){
                System.out.println("The Element is "+arr[i]);
                return;
            }
        }

        System.out.println("No Elemnt is found");

    }
}
