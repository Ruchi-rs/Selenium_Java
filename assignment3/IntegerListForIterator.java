
                      //Write a program which can store List of Integer values and print all the values using for iterator


package assignment3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IntegerListForIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        List<Integer> list3 = Arrays.asList(15,26,55,200,500,1000,2000);
        
        Iterator<Integer> itr1 = list3.iterator();
		
		while(itr1.hasNext())
		{
			int result = itr1.next();
			System.out.println("Value is"+" "+result);
		}
	}

}
