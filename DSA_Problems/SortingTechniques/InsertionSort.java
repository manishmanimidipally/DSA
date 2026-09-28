package DSA_Problems.SortingTechniques;
import java.util.Arrays;
public class InsertionSort {

    public static void insertionSort(int arr[]){
        int n = arr.length;
        for(int i=1;i<n;i++){

            int key =arr[i];
            int j =i-1; //all elements should compare

            //move the elements
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,5,4,7,5,6,8};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
