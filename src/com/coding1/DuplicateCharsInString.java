package com.coding1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharsInString {

	
public static void main(String args[] ) throws Exception {
        
		Scanner s=new Scanner(System.in);
		long sum=0;
		int n=s.nextInt();
		StringBuilder sb=new StringBuilder();
		for(int k=0;k<n;k++)
		{	sum=0;
			int t=s.nextInt();
			for(int i=0;i<t/2;i++)
			{
				for(int j=0;j<t;j++)
				{
				sum=sum+2*Math.abs(i-j);
				}
			}
			if(t%2!=0)
				for(int i=t/2,j=0;j<t;j++)
					sum=sum+Math.abs(i-j);
		
			sb.append(sum+"\n");
		}
		System.out.println(sb);
	}

       // System.out.println("Hello World!");
    }