
/* Write a program which will accept List of String and produce another List of string of which will have only values which starts with git
Input – Git, Github, GitLab,GitBash, Selenium, Java, Maven
Output- Git, Github, Gitlab, GitBash */

package assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringValueGit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l1 = new ArrayList<>(Arrays.asList("Git", "Github", "GitLab", "GitBash", "Selenium", "Java", "Maven"));
		
		List<String> l2 = new ArrayList<String>();
         
		for(String str: l1)
		{
			if (str.contains("Git"))
			{
				l2.add(str);
			}			
		}
		
		System.out.println(l2);
	}

}
