package com.sunny.Arrays.problems;

public class MajorityElement {
	public static void main(String[] args) {
		
		int arr[] = {1,2,1,3,2,2,2,2,1};
		int max_length = arr.length/2;
		int majorityElement = -1;
		
		for(int i=0;i<arr.length;i++) {
			int count =0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>max_length) {
				majorityElement = arr[i];
				break;
			}
		}
		System.out.println(majorityElement);
	}
}
