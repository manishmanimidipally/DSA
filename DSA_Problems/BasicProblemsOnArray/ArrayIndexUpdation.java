package com.sunny.Arrays.problems;

public class ArrayIndexUpdation {
	public static void main(String[] args) {
		int arr[] = {10,3,4,7,9};
		
		int pos = 2;
		int value = 20;
		
		arr[pos] = value;
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
