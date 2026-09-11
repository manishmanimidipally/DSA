package DSA_Problems.TwoPointers;

public class MergeTwoSortedArrays {
    
    public static int[] mergeArrays(int arr1[],int arr2[]){

        int i =0;
        int j = 0;
        int k=0;
        int newArray[] = new int[arr1.length+arr2.length];

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                newArray[k]=arr1[i];
                i++;
            }
            else if(arr1[i]>arr2[j]){
                newArray[k]=arr2[i];
                j++;
            }
            k++;
        }

        while(i<arr1.length){
            newArray[k] = arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            newArray[k]=arr2[j];
            j++;
            k++;
        }

        return newArray;


    }

    public static void main(String[] args) {
        int arr1[] = {1,3,4,6,8};
        int arr2[] = {2,3,5,6,7,9,10};

        int newarr[] = mergeArrays(arr1,arr2);
        for(int a : newarr){
            System.out.print(a+" ");
        }

    }
}
