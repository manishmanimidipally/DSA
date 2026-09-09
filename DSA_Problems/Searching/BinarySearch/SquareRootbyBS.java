package DSA_Problems.Searching.BinarySearch;

public class SquareRootbyBS {

    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5,6,7};
        int index =-1;
        int low=0;
        int high = arr.length-1;
        int target = (int) Math.sqrt(25);
        
        while(low<=high){
            int mid = low+(high-low)/2;

            if(arr[mid]==target){
                index = mid;
                System.out.println("The index of the sqt is "+mid);
                return;
            }
            else if(arr[mid]>target){
                high = mid-1;
            }
            else{
                low = mid +1;
            }

        }
        if(index == -1){
            System.out.println("Not Found");
        }

    }
    
}
