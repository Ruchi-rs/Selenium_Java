
          // Write a program which will pick the values from Array and Store them List.


package assignment3;

import java.util.*;

public class ArrayToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object[] arr1 = {10,'a',"Ruchi",20,'b',"Sharma"};
		
		List<Object> obj1 = new ArrayList<Object>();
		
		for(Object i: arr1)
		{
			obj1.add(i);
		}
		
		System.out.println(obj1);
	}

}
