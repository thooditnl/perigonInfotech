package com.java.practise.BaskerAssignment;


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> arls = new ArrayList<String>();
		arls.add("hiii");
		arls.add("hell0");
		arls.add("byeee");
		arls.add("hiii");
		arls.add("hiii");
		Iterator<String> itr = arls.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-------------------------");

		for (String c : arls) {
			System.out.println(c);

		}
		System.out.println("-------------------------");
		for (int i = 0; i < arls.size(); i++) {
			System.out.println(arls.get(i));
		}

	}

}
