package DSA_Problems.TwoPointers;

public class MoveZeroestoEnd {
    public static void moveZeroes(int arr[]){
        //0,1,0,2,3
        int i = 0;
        
        for(int j=0;j<arr.length;j++){

            if(arr[j]!=0){
                
                int temp =arr[i];
                arr[i] =arr[j];
                arr[j] = temp;
                i++;
                
            }
            

        }


    }

    public static void main(String[] args) {
        int arr[]={0,1,0,2,3};
        moveZeroes(arr);
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
    
}
