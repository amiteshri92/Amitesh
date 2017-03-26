package com.coding1;

import java.io.IOException;
import java.lang.annotation.Annotation;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@MyTestNGAnnotation(os="Android",version=6)
public class Annotations {
	String model;
	int size;
	
	

	
//	public static void main(String[] args) {
//		
//		Annotations an = new Annotations("Fire",5);
//		Class c = an.getClass();
//		
//		Annotation mtan = c.getAnnotation(MyTestNGAnnotation.class);
//
//		MyTestNGAnnotation man=(MyTestNGAnnotation)mtan;
//		System.out.println(man.os()+" : "+man.version());
//	}
//
//	public Annotations(String model, int size) {
//		
//		this.model = model;
//		this.size = size;
//	}
	
	@TesAnnotation(os2="sample2")
	@Test
	public void test(){
		System.out.println("test");
		Annotations an = new Annotations();
		Class c = an.getClass();
		
		Annotation mtan = c.getAnnotation(TesAnnotation.class);
		TesAnnotation tn = (TesAnnotation)mtan;
		System.out.println(tn.os2());
	}
	
}
