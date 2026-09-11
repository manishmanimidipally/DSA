package DSA_Problems.TwoPointers;

public class FindTheParisOFSum {

    public static  void pairsOfTheSum(int arr[],int target){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int sum = arr[left]+arr[right];
            if(sum == target){
                System.out.println("The paris are : "+arr[left]+" "+arr[right]);
                left++;
                right--;
            }
            else if(sum>target){
                right--;
            }
            else{
                left++;
            }
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int target = 6;
        FindTheParisOFSum.pairsOfTheSum(arr,target);

        
    }
    
}
