package DSA_Problems.HashMap;

import java.util.Map;
import java.util.HashMap;

public class MajorityElement {
    public static void main(String args[]){
        int arr[] = {1,2,3,3,3,3,2};
        int majority =  arr.length/2;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(int keys : map.keySet()){
            if(map.get(keys)>majority){
                System.out.println(keys);
                return;
            }
        }
    }
}
