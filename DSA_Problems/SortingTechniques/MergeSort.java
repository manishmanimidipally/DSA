package DSA_Problems.SortingTechniques;
import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int arr[],int nOfEle){
        
        if(nOfEle<2){
            return;
        }

        int mid = nOfEle/2;
        int leftArr[] = new int[mid];
        int rightArr[] = new int[nOfEle-mid];

        for(int i=0;i<mid;i++){
            leftArr[i]=arr[i];
        }

        for(int i=mid;i<nOfEle;i++){
            rightArr[i-mid] = arr[i];
        }

        mergeSort(leftArr,mid);
        mergeSort(rightArr,nOfEle-mid);

        merge(arr,leftArr,rightArr,mid,nOfEle-mid);

    }

    public static void merge(int arr[],int[] leftArr,int[] rightArr,int left,int right){
        int i=0,j=0,k=0;
        while(i<left && j<right){
            if(leftArr[i]<rightArr[j]){
                arr[k++]=leftArr[i++];
            }
            else{
                arr[k++]=rightArr[j++];
            }
        }

        while(i<left){
            arr[k++] = leftArr[i++];
        }
        while(j<right){
            arr[k++] = rightArr[j++];
        }
    }
    public static void main(String args[]){
        int arr[] = {1,3,2,4,5,6,9,6,5};
        mergeSort(arr,9);
        System.out.println(Arrays.toString(arr));
    }
}
