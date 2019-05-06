package com.sun.demo.base.collcetion;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
public static void main(String[] args) {
	Map<String,String> map=new HashMap<>();
	map.put("1", "a");
	map.put("1", "b");
	System.out.println(map.toString());
	
	
}
}
