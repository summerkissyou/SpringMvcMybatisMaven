package com.sun.demo.base.data;

public class DataCompareTest {
	public static void main(String[] args) {
		Integer a = 100;
		Integer b = 100;
		System.out.println(a == b); //true
		Integer c = 128;
		Integer d = 128;
		System.out.println(c == d); //false
	}
}
