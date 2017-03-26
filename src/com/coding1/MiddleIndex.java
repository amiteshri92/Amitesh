package com.coding1;

public class MiddleIndex {

	public static void main(String[] args) {
		
		int[] arr = {4,2,1,1,8};
		int[] arr2 = {3,2,3,1,4,3};
		middleIndex(arr);
		middleIndex(arr2);
	}

	private static void middleIndex(int[] arr) {
		int sum=0;
		int index=0;
		for(int i : arr)
			sum+=i;
		System.out.println(sum);
		int half = sum/2;
		int total=0;
		for(int i=0;i<arr.length;i++){
			total+=arr[i];
			//System.out.println(total);
			if(total==half){
				System.out.println(i);
				break;}
			}
		
		
	}
}
