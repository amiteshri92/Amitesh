package com.coding1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DuplicateNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    int N = s.nextInt();
	    int[] arr=new int[N];
	    for (int i = 0; i < N; i++) {
	        arr[i]=s.nextInt();
	    }
	    
	    LargestNumber(arr);
	    System.out.println("Hello World!");
	}
	


public static void LargestNumber(int[] arr){
    System.out.println("abc");
    String[] str = new String[arr.length];
    for(int i=0;i<arr.length;i++){
        str[i]=String.valueOf(arr[i]);
    }
    String finalNumber=str[0];
    System.out.println("str : "+str.toString());
    for(int i= 0 ;i<str.length-1;i++){
       finalNumber= compare(finalNumber,str[i+1]);
       System.out.println("finalNumber : "+finalNumber);
    }
    System.out.println("Result : "+finalNumber);
} 

public static String compare(String s1,String s2){
    String s1_2 = s1+s2;
    System.out.println(s1_2);
    String s2_1 = s2+s1;
    System.out.println(s2_1);
    String s1_2_temp = s1_2;
    String s2_1_remp = s2_1;
    long x2 = Long.valueOf(s2_1_remp);
    System.out.println("x2 : "+x2);
    long x1 = Long.valueOf(s1_2_temp);
    System.out.println("x1 : "+x1);
   
    
    if(x1>x2){
        System.out.println("printing1");
        return s1_2;
       
    }
    else{
        System.out.println("printing2");
        return s2_1;
    }
}

}
