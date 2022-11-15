package assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<Integer> list6 = new ArrayList<Integer>(Arrays.asList(33,44,55,66,77,88));
		 
		 list6.remove(1);                                   //Removing second element from the list using index
		 System.out.println(list6);
		
		 list6.remove(Integer.valueOf(55));                 //Removing second element from the list using value
		 System.out.println(list6);
		 
		 list6.add(3, 90);                                  // Add 90 at index 3
		 System.out.println(list6);
		 
		 System.out.println(list6.size());                  // Get the length of list
		 
		 System.out.println(list6);                         // Print all values from list 
		 
		 Object[] obj=list6.toArray();                      // Convert List into array
		 for(Object i: obj)
		 {
		 System.out.println(i);
	     }

}
}

