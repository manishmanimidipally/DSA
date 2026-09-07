package DSA_Problems.Searching;

public class FindTheString {
    public static void main(String args[]){

        String arr[] = {"ram","nilesh","ganesh","manish","sunny"};
        String target = "manish";
        int index = -1;

        for(int i=0;i<arr.length;i++){
          

            if(arr[i].equals(target)){
                index=i;
                break;
            }
        }
        System.out.println(index!=-1?"The String is Found "+index:"Not Found");
    }
    
}
