package DSA_Problems.Searching.LinearSearch;


import java.util.Arrays;
import java.util.List;


public class FindTheNameForArrayList {

    public static void main(String[] args) {

        
        List<String> li = Arrays.asList("pen","paper","book","pencil");
        String target = "book";
        boolean found = false;

        for(String name : li){
            if(name.equals(target)){
                found = true;
                System.out.println("The Target value is found");
                return;
            }
        }

        if(!found){
            System.out.println("The Target Value id not found");
        }

    }
    
}
