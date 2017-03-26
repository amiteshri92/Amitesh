package com.coding1;

public class ArmStrong {

	public static void main(String[] args) {
		System.out.println("Is 371 armstrong or not? : "+IsArmStrong(371) );
		System.out.println("Is 371 armstrong or not? : "+IsArmStrong(153) );
	}

	private static boolean IsArmStrong(int temp) {
		int i= temp;
		int size = String.valueOf(i).length();
		System.out.println(size);
		int sum=0;
		while(i>0){
			int div = i%10;
			int mul=1;
			for(int j=0;j<size;j++){
				mul*=div;}
			sum+=mul;
			i/=10;
		}
		System.out.println(sum+" : "+temp);
		if(temp==sum){
			return true;
		}
		else{
			return false;
		}
	}
}
