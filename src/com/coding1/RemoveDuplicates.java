package com.coding1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int[] arr = {5,5,4,4,1};
		int previous=arr[0];
		int[] result = new int[arr.length];
		result[0]=previous;
		for(int i=1;i<arr.length;i++){
			if(arr[i]!=previous){
				result[i]=arr[i];
			}
			previous=arr[i];
		}
		for(int x : result)
			System.out.print(x+" ");
	}
}
