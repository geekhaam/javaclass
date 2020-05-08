package com.java.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		System.out.println(hm.size());
		
		//add key & value
		hm.put(new Integer(100), "¸ÚÀïÀÌ");
		hm.put(new Integer(200), "»çÀÚ");
		hm.put(new Integer(300), "Ã³·³");
		
		//get value using key
		System.out.println(hm.get(100)+" "+hm.get(200)+hm.get(300));
		
		//delete
		hm.remove(100);
		if(hm.size()>0)
			System.out.println(hm.size());
		
		//get values with Collection
		Collection<String> v = hm.values();
		System.out.println(v);
		
		//get keys with Set
		Set<Integer> s = hm.keySet();
		System.out.println(s);
		
		//print key with value
		// 1) using keySet
		for(Integer i : s) {
			System.out.println(i + "\t" + hm.get(i));
		}
		// 2) using Entry
		Set <Map.Entry<Integer, String>> set = hm.entrySet();
		for(Map.Entry <Integer, String> k : set) {
			System.out.println(k.getKey() + "\t" + k.getValue());
		}
	}

}
