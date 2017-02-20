package com.java.practise.BaskerAssignment;

import java.util.ArrayList;

public class SrtArrayLstEx {
	public static void main(String[] args) {
		ArrayList<String> arls = new ArrayList<String>();
		arls.add("hiii");
		arls.add("hell0");
		arls.add("byeee");
		arls.add("byeee");
		arls.add("hiii");
		arls.add("hiii");
		
		String[] s=new String[arls.size()];
		s=arls.toArray(s);
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}

	}

}
