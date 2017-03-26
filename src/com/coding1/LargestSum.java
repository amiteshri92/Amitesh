package com.coding1;

public class LargestSum {

	public static void main(String[] args) {
		
		int[] arr = {-2,-3,4,-1,-2,1,5,3};
		largestSubarray(arr);
	}

	private static void largestSubarray(int[] arr) {
		
		int i=0;
		int sum=0;
		int max=0;
		
		while(i<arr.length){
			sum=0;
			for(int j=i;j<arr.length;j++){
				sum+=arr[j];
			}
			
			System.out.println("Sum : "+sum);
			
			for(int k = arr.length-1;k>=i;k--){
				
				if(max<=sum-arr[k]){
					max=sum-arr[k];
					System.out.println("max internal : "+max);
				}
			}
			System.out.println("current max on : "+i+ " is : "+max);
			i++;
		}
		System.out.println("Final length is : "+max);
	}
}
