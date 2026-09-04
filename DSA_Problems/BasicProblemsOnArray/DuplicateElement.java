public class DuplicateElement {
    public static void main(String args[]){
        int arr[] = {10,20,30,40,50};
        int found = -1;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    
                    found = i;
                    break;
                }
            }
            
        }
        System.out.println(found);
    }
}
