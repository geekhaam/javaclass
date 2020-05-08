package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Moya {
	private int id;
	private String name;
	public Moya(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getIntegerId() {
		return new Integer(id);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class ArrayListClass2 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		//Ascending Sort
		ArrayList arr = new ArrayList();
		arr.add(new Integer(700));
		arr.add(new Integer(500));
		arr.add(new Integer(300));
		arr.add(new Integer(200));
		arr.add(new Integer(800));
		
		//toArray() : convert ArrayList to Array and sort the array / asList()
		/*Object[] ob = arr.toArray();
		Arrays.sort(ob);
		
		ArrayList arr2 = new ArrayList();
		for(Object o : ob) {
			arr2.add(o);
		}
		for(int i=0; i<ob.length; i++) {
			arr2.add(ob[i]);
		}
		for(int j=0; j<arr2.size(); j++) {
			System.out.println(arr2.get(j));
		}*/
		
		//Collections.sort()
		Collections.sort(arr);
		
		//Descending Sort (After sort, Collections.reverse())
		Collections.reverse(arr);
		
		//Collections.shuffle()
		Collections.shuffle(arr);
		
		for(Object o : arr) {
			System.out.println(o);
		}
		
		ArrayList<Moya> arr2 = new ArrayList<Moya>();
		arr2.add(new Moya(100, "hong"));
		arr2.add(new Moya(20, "choi"));
		arr2.add(new Moya(70, "kim"));
		
		Collections.sort(arr2, new Comparator<Moya>() {
			@Override
			public int compare(Moya m1, Moya m2) {
				return m1.getIntegerId().compareTo(m2.getId());
			}
			
		});
		
		for(Moya m : arr2) {
			System.out.println(m.getId() + " : " + m.getName());
		}
	}

}
