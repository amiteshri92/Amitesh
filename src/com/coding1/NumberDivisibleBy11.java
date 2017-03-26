package com.coding1;

public class NumberDivisibleBy11 {

	public static void main(String[] args) {
		
		int num = 14641;
		divisibleBy11(num);

	}

	private static void divisibleBy11(int num) {
		int temp = num;
		long y = 2728;	
		String str = String.valueOf(temp);
		int len = str.length();
		int[] digits = new int[len];
		int i=0;
		while(num>0){
			digits[i]=num%10;
			num/=10;
			i++;
		}
		int sumodd=0,sumeven=0;
		
		for(int j=0;j<len;j=j+2){
			sumodd+=digits[j];
			
		}
		
		for(int k=1;k<len;k=k+2){
			sumeven+=digits[k];
		}
		if((sumodd-sumeven)%11==0)
			System.out.println("Divisible : "+temp);
		else{
			System.out.println("Not divisible");
		}
	}

}
