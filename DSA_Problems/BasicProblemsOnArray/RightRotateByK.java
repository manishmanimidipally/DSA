import java.util.Scanner;
class RightRotateByK{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {10,20,30,40,50};
        System.out.println("Enter the size of the K ");
        int k = sc.nextInt();
        while(k>0){

            int temp = arr[arr.length-1];

            for(int i=arr.length-1;i>0;i--){
                arr[i] = arr[i-1];
            }
            arr[0] = temp;

            k--;
        }
        for(int x : arr){
            System.out.print(x+" ");
        }

        sc.close();
    }
}