package com.sunny.Arrays.problems;

public class ArrayInsertionElementAtIndex {
	public static void main(String[] args) {
		int arr[] = {12,14,16,15};
		int pos = 2;
		int value = 15;
		
		int newarr[] = new int[arr.length+1];
		
		for(int i=0;i<pos;i++) {
			newarr[i] = arr[i];
			
		}
		
		newarr[2] = value;
		
		for(int i=pos;i<arr.length;i++) {
			newarr[i+1] = arr[i];
			
		}
		
		
		
		for(int i=0;i<newarr.length;i++) {
			System.out.println(newarr[i]);
			
		}
	}

}
