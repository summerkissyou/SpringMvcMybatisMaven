package com.sun.demo.base.collcetion;

import java.util.HashMap;
import java.util.Map;

public class HashMapKeyHashCodeTest {
public static void main(String[] args) {
	Map<String,String> map=new HashMap<>();
	String key="1";
	
	int hash = key.hashCode();

	map.put(key, "a");
	map.put(key, "b");
	System.out.println(map.keySet().hashCode());
	
	
}
}
