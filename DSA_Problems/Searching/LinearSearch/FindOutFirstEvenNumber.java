package DSA_Problems.Searching.LinearSearch;

public class FindOutFirstEvenNumber{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7};
        int index = -1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                index = i;
                break;
            }
        }

        System.out.println(index!=-1?"The First Even number is "+arr[index]:"No Even number is present");
    }
}
