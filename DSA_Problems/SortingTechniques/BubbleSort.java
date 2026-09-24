package DSA_Problems.SortingTechniques;

public class BubbleSort {
    public static void main(String args[]){
        int arr[] = {1,2,4,5,6,3};

        boolean swapped = false;
        for(int i=0;i<arr.length-1;i++){
            
            for(int j=0;j<arr.length-1;j++){
            

                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped = true;
                }
            }

            if(!swapped){
                System.out.println("Already Sorted order");
                break;
            }
        }

        for(int num : arr){
            System.out.print(num +" ");
        }
    }
}
