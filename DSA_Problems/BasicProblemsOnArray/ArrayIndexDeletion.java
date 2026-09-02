package com.sunny.Arrays.problems;

public class ArrayIndexDeletion {
	public static void main(String[] args) {
		
		int arr[] = {12,13,15,14,16};
		int delpos = 2;
		
		
		int newarr[] = new int[arr.length-1];
		
		for(int i=0;i<delpos;i++) {
			newarr[i] = arr[i];
			
		}
		
		
		for(int i=delpos;i<newarr.length;i++) {
			newarr[i] = arr[i+1];
			
		}
		
		for(int i=0;i<newarr.length;i++) {
			System.out.println(newarr[i]);
		}
	}
}
