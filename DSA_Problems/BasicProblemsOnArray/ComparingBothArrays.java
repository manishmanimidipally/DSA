package com.sunny.Arrays.problems;

public class ComparingBothArrays {
	public static void main(String[] args) {
		int arr1[] = {1,2,3,3};
		int arr2[] = {1,2,3,3};
		boolean equal = true;
		
		if(arr1.length != arr2.length){
			equal=false;
		}
		else{
			
			boolean visited[] = new boolean[arr2.length];
			for(int i=0;i<arr1.length;i++){
				
				boolean found = false;

				for(int j=0;j<arr2.length;j++){

					if(arr1[i] == arr2[j] && !visited[j]){
						found = true;
						visited[j] = true;
						break;
					}
				}   

				if (!found) {
                equal = false;
                break;
                }

			}

		}
        if (equal) {
            System.out.println("Both arrays contain the same elements");
        } else {
            System.out.println("Arrays are different");
        }
	}

}
