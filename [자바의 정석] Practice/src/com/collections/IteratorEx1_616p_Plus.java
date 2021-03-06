package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IteratorEx1_616p_Plus {
	public static void main(String[] args) {
		List<Per> list = new ArrayList<Per>();
		list.add(new Per("aaa", 11));
		list.add(new Per("kkk", 33));
		list.add(new Per("bbb", 99));
		list.add(new Per("ccc", 22));
		list.add(new Per("xxx", 88));
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
			Collections.sort(list);
			System.out.println();
			it = list.iterator();
			
			while(it.hasNext()) {
				Object obj = it.next(); 
				System.out.println(obj);
			
		}
	}
}

class Per implements Comparable {
	String name;
	int age;
	
	public Per(String name, int age) {
		super();
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return "Per [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Per p = (Per) o;
		return name.compareTo(p.name);
	}
	
}
	