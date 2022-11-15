
                         // Write a program which can store List of Integer values and print all the values using for each loop

package assignment3;

import java.util.ArrayList;
import java.util.List;

public class IntegerListForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(33);
		list2.add(65);
		list2.add(90);
		list2.add(100);
		list2.add(115);
		list2.add(136);
		list2.add(250);
		
		for(int i:list2)
		{
		 System.out.println("Element at index"+ " "+list2.indexOf(i)+ " " +"is"+" " +i);
		}
	}

}
