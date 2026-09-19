package DSA_Problems.TwoPointers;

public class FindTheMaxWater{
    public static void main(String args[]){

        int arr[] = {1,2,4,3,5,6,5,2,3,1};

        int maxWater = 0;
        int left = 0;
        int right = arr.length-1;

        while(left<right){

            int width = right -left;
            int waterLevel = Math.min(arr[left],arr[right])*width;

            maxWater = Math.max(waterLevel,maxWater);

            if(arr[left]>=arr[right]){
                right--;
            }
            else{
                left++;
            }
        }
        System.out.println(maxWater);

    }
}