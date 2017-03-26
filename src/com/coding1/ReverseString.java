package com.coding1;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "amitesh is the candidate";
		char[] ch = str.toCharArray();
		System.out.println(reverseString(str));

	}
	
	private static String reverseString(String str) {
		String finalString = "";
		if(str.length()<2){
			return str;
		}
		else{
			finalString=str.charAt(str.length()-1)+reverseString(str.substring(0, str.length()-1));
			//return finalString;
			return str;
		}
	}
}
