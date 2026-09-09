package DSA_Problems.Searching.BinarySearch;

public class FindInsertionPosition {

    public static void main(String[] args) {
        
        int arr[] = {1,1,3,4,5,7,8};
        int low =0;
        int high =arr.length-1;
        int target = 6;
        
        while(low<=high){
            int mid = low+(high-low)/2;
           
            if(arr[mid]>target){
                high = mid-1;
            }
            else{
                low=mid+1;
            }
            
        }

        System.out.println(low);


    }
    
}
