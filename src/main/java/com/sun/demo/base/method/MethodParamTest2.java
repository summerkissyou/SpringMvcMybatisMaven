package com.sun.demo.base.method;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MethodParamTest2 {
	
	String a="123";
	String[] b= {"123","456"};
	public void change(String a,String[] b) {
		this.a="456";
		this.b[0]="789";
	}
	public static void main(String[] args) {
		MethodParamTest2 o=new MethodParamTest2();
		System.out.println(o.a);
		System.out.println(o.b);
		System.out.println(Arrays.toString(o.b));
		o.change(o.a, o.b);
		System.out.println(o.a);
		System.out.println(o.b);
		System.out.println(Arrays.toString(o.b));
	}

}
