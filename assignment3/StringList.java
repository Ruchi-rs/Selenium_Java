package assignment3;

import java.util.Arrays;
import java.util.List;

public class StringList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list6 = Arrays.asList("Web Automation", "API Automation", "Mobile Automation");
		
		for(int i=0; i<list6.size(); i++)
			
		{
			if (list6.get(i).contains("Mobile"))
			{
				System.out.println("True");
			}
			
		}
		
		
	}

}
