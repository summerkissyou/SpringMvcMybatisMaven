package com.sun.demo.base.data;

import java.util.HashMap;
import java.util.Map;

public class DataCopyTest {
	
	public static void t1() {
		int a=1;
		int b=a;
		b=2;
		System.out.println(a);
		System.out.println(b);
	}
	public static void t2() {
		Integer a=1;
		Integer b=a;
		b=2;
		System.out.println(a);
		System.out.println(b);
	}
	public static void t3() {
		String a="1";
		String b=a;
		b="2";
		System.out.println(a);
		System.out.println(b);
	}
	public static void t4() {
		Map<String,String> a=new HashMap<>();
		Map<String, String> b=a;
		b.put("1", "1");
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		t1();
		t2();
		t3();
		t4();
	}
	
	

}
