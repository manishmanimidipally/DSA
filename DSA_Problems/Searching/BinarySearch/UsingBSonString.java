package DSA_Problems.Searching.BinarySearch;

public class UsingBSonString {
    public static void main(String[] args) {
        
        String names[] = {"apple","banana","cat","dog","eagel"};
        String target ="cat";

        int low =0;
        int high = names.length-1;
     

        while(low<=high){
            int mid = low+(high-low)/2;

            int result = names[mid].compareTo(target);

            if(result == 0){
                System.out.println("Target value index found "+mid);
                return;
            }
            else if(result < 0){
                low = mid+1;
            }
            else{
                high = mid-1;
            }


        }

        System.out.println("Not found ");
        


    }
}
