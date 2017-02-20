package com.java.practise.BaskerAssignment;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDup2 {
	public static void main(String[] args) {
		ArrayList<Integer> arls = new ArrayList<Integer>();
		arls.add(4);
		arls.add(1);
		arls.add(9);
		arls.add(0);
		arls.add(1);
		arls.add(4);
		for (int i = 0; i< arls.size(); i++) {
			for (int j = i+1; j < arls.size(); j++) {
				if (arls.get(i).equals(arls.get(j))) {
					arls.remove(j);
				}
			}
		}

		Iterator<Integer> itr = arls.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
