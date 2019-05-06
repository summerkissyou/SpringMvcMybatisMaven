package com.sun.demo.base.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections.CollectionUtils;

public class ColletionCopyTest2 {
	
	public static void t1() {
		 List<Integer> list = new ArrayList<>();
	        for (int i = 0; i < 10; i++) {
	            list.add(i);
	        }

        //list深度拷贝
        List<Integer> newList = new ArrayList<>();
        newList.addAll(list);    
        newList.set(0, 10);       
        System.out.println("原list值：" + list);
        System.out.println("新list值：" + newList);
	}
	
	public static void t2() {
		 Set<Integer> list = new HashSet<>();
	        for (int i = 0; i < 10; i++) {
	            list.add(i);
	        }

       //list深度拷贝
	   Set<Integer> newList = new HashSet<>();
       newList.addAll(list);    
       newList.add(11);       
       System.out.println("原list值：" + list);
       System.out.println("新list值：" + newList);
	}
	
	public static void t3() {
		 List<Map<Integer,Integer>> list = new ArrayList<>();
	        for (int i = 0; i < 10; i++) {
	        	Map<Integer, Integer> map=new HashMap<Integer,Integer>();
	        	map.put(i, i);
	            list.add(map);
	        }

       //list深度拷贝
	   List<Map<Integer,Integer>>   newList= new ArrayList<>();
       newList.addAll(list);  
       Map<Integer, Integer> map=new HashMap<Integer,Integer>();
   	   map.put(11, 11);
       newList.set(0,map);       
       System.out.println("原list值：" + list);
       System.out.println("新list值：" + newList);
	}
	
	
	
	public static void main(String[] args) {
		t1();
		t2();
		t3();
	}
	
	

}
