
class FrequencyOfElement{
    public static void main(String args[]){

        int arr[] = {1,2,2,3,1,1,3,4,6,2,5};
        boolean visited[] = new boolean[arr.length];
        for(int i=0;i<arr.length;i++){

            if(visited[i]){
                continue;
            }
            else if(visited[i]!=true)
            {
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j] && visited[j]!=true)
                {
                    
                    count++;
                    visited[j]=true;
                }

            }

            System.out.println(arr[i]+" The Count is "+count);
        }
        }

    }
}