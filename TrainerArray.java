package assignment2;

import java.util.ArrayList;

public class TrainerArray {

	String name;
	String department;
	String email;
	int id;
	
	public TrainerArray(String name, String department, String email, int id)
	{
		this.name = name;
		this.department = department;
		this.email = email;
		this.id = id;
		
	}
	
	public static void main(String[] args) {
		Trainer T1 = new Trainer("Mukesh","Testing","mukesh@gmail.com",1);
		Trainer T2 = new Trainer("Hitesh", "Dev", "hitesh@gmail.com", 2);
		Trainer T3 = new Trainer("Saksham","DevOps","saksham@gmail.com",3);
		
		ArrayList<Trainer> list1 = new ArrayList<>();
		
		list1.add(T1);
		list1.add(T2);
		list1.add(T3);
		
		for(int i=0; i<list1.size(); i++)
		{
			System.out.print(list1.get(i).name+" ");
			System.out.print(list1.get(i).department+" ");
			System.out.print(list1.get(i).email+" ");
			System.out.print(list1.get(i).id+" ");
			System.out.println();
		}

	}

}
