
                         // Write a program which can store List of Integer values and print all the values using for loop.

package assignment3;

import java.util.ArrayList;
import java.util.List;

public class IntegerListForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> l1 = new ArrayList<Integer>();
		
		l1.add(25);
		l1.add(30);
		l1.add(60);
		l1.add(80);
		l1.add(93);
		l1.add(126);
		l1.add(200);
		
		for(int i=0; i<l1.size(); i++)
		{
		 System.out.println("Element at"+" "+i+" "+"is"+" "+l1.get(i));
		}
	}

}
