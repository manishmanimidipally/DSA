public class DuplicateElement {
    public static void main(String args[]){
        int arr[] = {10,20,30,40,50};
        boolean found = true;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("The Duplicate Element found "+arr[i]);
                    found = true;
                    break;
                }
            }
            if(found){
                break;
            }
            
        }
        if(!found){
            System.out.println("The Dupliacte not found");
        }
    }
}
