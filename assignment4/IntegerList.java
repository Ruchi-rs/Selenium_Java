           /* Create a list of values and print the second element, second last element.
              Input – 10,45, 90,45, 23, 90, 44
              Output – 45,90 */

package assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class IntegerList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(10,45,90,45,23,90,44));
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(list1.get(1));
		list2.add(list1.get(list1.size()-2));
		System.out.println(list2);
	}

}
