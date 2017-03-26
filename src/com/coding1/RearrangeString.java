package com.coding1;

import java.util.HashMap;
import java.util.Map;

public class RearrangeString {

	public static void main(String[] args) {
		
		String str ="aaabc";
		String str2 = "aaabb";
		rearrange(str);
		rearrange(str2);
	}

	private static void rearrange(String str) {
		
		Map<Character,Integer> mp = new HashMap<Character,Integer>();
		char[] ch = str.toCharArray();
		for(char c : ch){
			if(!mp.containsKey(c)){
				mp.put(c, 1);
				
			}
			else{
				mp.put(c, mp.get(c)+1);
			}
		}
		System.out.println(mp);
		int size = mp.keySet().size();
		if(size>=str.length()/2)
			System.out.println("possibel");
		else{
			System.out.println("not possible");
		}
	}
	
}
