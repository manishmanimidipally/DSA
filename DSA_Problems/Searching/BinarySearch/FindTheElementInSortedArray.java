package DSA_Problems.Searching.BinarySearch;

public class FindTheElementInSortedArray {

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80};
        int target = 20;
        int low =0;
        int high = arr.length-1;
        boolean found = false;
     

        while(low<=high){
            int mid = low+(high-low)/2;

            if(arr[mid]==target){
                System.out.println("The Element is Found At index "+mid);
                found = true;
                break;
            }
            else if(arr[mid]>target){
                high = mid-1;
            }
            else{
                low=mid+1;
            }
            
        }

        if(!found){
            System.out.println("Element Not Found");
        }
    }
    
}
