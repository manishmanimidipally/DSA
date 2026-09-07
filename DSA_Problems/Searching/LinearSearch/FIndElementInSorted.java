package DSA_Problems.Searching;

public class FIndElementInSorted {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,7,8};
        int target = 6;

        boolean found = true;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                found = true;
            }
            if(arr[i]>target){
                break;
            }
        }
        System.out.println(found?"The Element found":"not Found");

    }
}
