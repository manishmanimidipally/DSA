package com.sunny.Arrays.problems;

public class MaxElement {
	public static void main(String[] args) {
		int arr[] = {1,4,2,3,6,7,0};
		
		int maxelement =0;
		for(int i=0;i<arr.length;i++) {
			maxelement = Math.max(maxelement, arr[i]);
		}
		
		System.out.println(maxelement);
	}
}
