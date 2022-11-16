package assignment4;

import java.util.ArrayList;

public class ListAsElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(11);
		l1.add(22);
		l1.add(33);
		
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		l2.add(9);
		l2.add(19);
		l2.add(29);
		
		ArrayList<Integer> l3 = new ArrayList<Integer>();
		l3.add(7);
		l3.add(17);
		l3.add(27);
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		list.add(l1);
		list.add(l2);
		list.add(l3);
        System.out.println(list);
		
	}

}
