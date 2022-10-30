package assignment2;

public class Trainer {

	String name;
	String department;
	String email;
	int id;
	
	public Trainer(String name, String department, String email, int id )
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
		
		T1.printTrainerDetails();
		T2.printTrainerDetails();
		T3.printTrainerDetails();

	}
	
	public void printTrainerDetails() {
		System.out.println("Trainer"+" "+name+" "+"can teach"+" "+department+" "+"having email id:"+" "+email+" "+"and id:"+ " "+id);
	}

}
