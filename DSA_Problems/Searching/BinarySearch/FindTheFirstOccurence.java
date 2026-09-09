package DSA_Problems.Searching.BinarySearch;

public class FindTheFirstOccurence {

    public static void main(String[] args) {
        int arr[] = {1,2,2,2,2,2,2,2,2,3,4};

        int index = -1;
        int low =0;
        int target = 2;
        int high = arr.length-1;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(arr[mid]==target){
                index = mid;
                high=mid-1;
            }
            else if(arr[mid]>target){
                high = mid-1;
            }
            else{
                low=mid+1;
            }
        }

        System.out.println(index);


    }
    
}
