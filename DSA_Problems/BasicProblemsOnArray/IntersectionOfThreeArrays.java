class IntersectionOfThreeArrays{
    public static void main(String args[]){

        int arr1[] = {1,2,2,3,4,5,5,5,6};
        int arr2[] = {3,3,4,5,6};
        int arr3[] = {4,4,6,8,5,1};

        for(int i=0;i<arr1.length;i++){

            //finding duplicate 
            boolean alreadyVisited = false;
            for(int k=0;k<i;k++){
                if(arr1[k] == arr1[i]){
                    alreadyVisited = true;
                    break;
                }
            }

            if(alreadyVisited){
                continue;
            }

            for(int j=0;j<arr2.length;j++){

                if(arr1[i] == arr2[j]){
                    for(int h=0;h<arr3.length;h++){
                        if(arr1[i]==arr3[h]){
                            System.out.print(arr1[i]+" ");
                            break;
                        }
                    }
                    break;
                   
                }
            }
        }

    }
}