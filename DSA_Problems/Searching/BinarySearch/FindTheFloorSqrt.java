package DSA_Problems.Searching.BinarySearch;

public class FindTheFloorSqrt {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};

        //find the floor sqrt for this
        int target = 20;
        int floortarget = (int) Math.floor(Math.sqrt(20));
        boolean found = false;
        
        int low =0;
        int high = arr.length-1;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(arr[mid]== floortarget){
                found = true;
                System.out.println("The target index is found at "+mid);
                return;
            }
            else if(arr[mid]< floortarget){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        if(!found){
            System.out.println("The Element is not found ");
        }
    }
    
}
