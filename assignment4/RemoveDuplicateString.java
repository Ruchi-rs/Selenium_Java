
               /* Write a program that will remove duplicate values from List
                  Input – Java, TestNG, Maven, Java, 
                  Output – Java, TestNG, Maven  */

package assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list1 = new ArrayList<String>(Arrays.asList("Java", "TestNG", "Maven", "Java"));
		
		Set<String> set = new LinkedHashSet<String>();
		
		set.addAll(list1);
		
		System.out.println(set);
	}

}
