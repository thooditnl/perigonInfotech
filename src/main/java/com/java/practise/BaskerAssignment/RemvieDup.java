package com.java.practise.BaskerAssignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemvieDup  {
	public static void main(String[] args) {
		ArrayList<String> arls = new ArrayList<String>();
		arls.add("hiii");
		arls.add("hell0");
		arls.add("byeee");
		arls.add("byeee");
		arls.add("hiii");
		arls.add("hiii");
		Set<String> s=new HashSet<String>();
		s.addAll(arls);
		Iterator<String> itr = s.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
