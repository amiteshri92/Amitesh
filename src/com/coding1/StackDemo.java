package com.coding1;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo {

	   static void showpush(Stack st, String a) {
	      st.push(a);
	      System.out.println("push(" + a + ")");
	      System.out.println("stack: " + st);
	   }

	   static String showpop(Stack st) {
	      System.out.print("pop -> ");
	      String a =  (String) st.pop();
	      System.out.println(a+" stack: " + st);
	      return a;
	      
	      //System.out.println("stack: " + st);
	   }

	   public static void main(String args[]) {
	      Stack st = new Stack();
	      System.out.println("stack: " + st);
	      String str = "this is a test";
	      String[] arrstr = str.split("\\s");
	      for(String s : arrstr){
	    	  showpush(st,s);
	      }
	      System.out.println(st.size()+" : "+arrstr.length);
	     // String[] arrstr2 = new String[arrstr.length];
	      for(int i=0;i<arrstr.length;i++){
		      arrstr[i]=showpop(st);
		      
	      }
	     for(String s : arrstr)
	    	 System.out.print(s+" ");
	     
	   }
	}
