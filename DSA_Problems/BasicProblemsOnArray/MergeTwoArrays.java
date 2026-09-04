public class MergeTwoArrays{
    public static void main(String args[]){
        int arr1[] = {1,4,5};
        int arr2[] = {2,3,6};

        int newarr[] = new int[arr1.length + arr2.length];

        int i=0;
        int j=0;
        int k =0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                newarr[k] = arr1[i];
                i++;

            }
            else if(arr1[i]>arr2[j]){
                newarr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i<arr1.length){
            newarr[k] = arr1[i];
            i++;
            k++;
        }

        while(j<arr2.length){
            newarr[k] = arr2[j];
            j++;
            k++;
        }

        for(int p=0;p<newarr.length;p++){
            System.out.print(newarr[p]+" ");
        }

    }
}