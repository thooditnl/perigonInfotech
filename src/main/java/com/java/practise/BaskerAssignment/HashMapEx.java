package com.java.practise.BaskerAssignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx {
	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(1, "abc");
		m.put(2, " 123");
		m.put(3, "1+2+3");
		m.put(1, "Dup value replaced");
		m.put(4, "abc");
		Iterator<Map.Entry<Integer, String>> itr=m.entrySet().iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}

}
