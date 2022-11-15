
                 //Write a program which will print sum of all numbers which is stored in list.

package assignment3;

import java.util.Arrays;
import java.util.List;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   
		int sum=0;
	   
	    List<Integer> list4 = Arrays.asList(10,25,45,60,75,100,200);
		
        for(int i=0; i<list4.size(); i++)
        {
        	sum = sum +list4.get(i);
        	
        }
        System.out.println("Sum of all values in the list is"+" "+sum);
	}

}
