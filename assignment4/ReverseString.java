
                     /* Create a list of String and print the values in reverse order
                        Input – Java, Selenium, TestNG, Git, Github
	                    Output- Github, Git, TestNG, Selenium, Java */

package assignment4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list1 = new ArrayList<>(Arrays.asList("Java", "Selenium", "TestNG", "Git", "Github"));

		System.out.println("Reverse order of list is -");
		
		for(int i=0, j=list1.size()-1; i<j; i++)
		{
			list1.add(i, list1.remove(j));
		}
		
		System.out.println(list1);
	}

}
