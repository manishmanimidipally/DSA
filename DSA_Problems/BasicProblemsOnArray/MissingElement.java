package com.sunny.Arrays.problems;

public class MissingElement {
	public static void main(String[] args) {
		
		int arr[] = {0,1,2,4};
		int sum =0;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		
		int n =arr.length;
		
		int result = n*((n+1)/2) - sum;
		System.out.println(result);
		
	}
}
