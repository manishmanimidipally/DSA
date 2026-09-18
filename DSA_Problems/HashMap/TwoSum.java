package DSA_Problems.HashMap;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String args[]){

        int arr[] = {1,2,3,4,5,6};
        int target = 9;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){

            if(map.containsKey(target-arr[i])){
                System.out.println("The indexes are "+map.get(target-arr[i])+" "+i);
                return;
            }
            else{
                map.put(arr[i],i);
            }

        }

        System.out.println("No Pair is Found ");


    }
}
