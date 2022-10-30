package assignment2;

import java.util.Scanner;

public class Students {
	
	public static void main(String[] args) {
	String[] NameArr=new String[30];
	String[] EmailArr=new String[30];
	Long[] PhoneArr=new Long[30];
	String[] AddressArr=new String[30];
	String[] StatusArr=new String[30];
	
		
       Scanner sc = new Scanner(System.in);
		
	   System.out.println("Please enter number of Students");
	   
	   int count = sc.nextInt();
	   
	   for(int i=1; i<=count; i++)
	   {
		   System.out.println("Please enter name");
		   NameArr[i] = sc.next();
          		  
		   System.out.println("Please enter email");
		   EmailArr[i] = sc.next();
		   
		   System.out.println("Please enter phone");
		   PhoneArr[i] = sc.nextLong();
		   
		   System.out.println("Please enter address");
		   AddressArr[i] = sc.next();
		   
		   System.out.println("Please enter status");
		   StatusArr[i] = sc.next();
	   }
	   
       System.out.println("Please Enter Which Student you are looking for");
	   
	   int num = sc.nextInt();
	   
	   System.out.println(NameArr[num]);
	   System.out.println(EmailArr[num]);
	   System.out.println(PhoneArr[num]);
	   System.out.println(AddressArr[num]);
	   System.out.println(StatusArr[num]);
	   
		sc.close();
	}

}
