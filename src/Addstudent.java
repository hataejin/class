import java.util.Scanner;

public class Addstudent extends Student {
	Student add;
	Scanner input;
	
	Addstudent(Scanner input){
		this.input = input;
	}
	public void addstudent() {
		add = new Student();
		System.out.print("Student ID :");
		add.id = input.nextInt();
		System.out.print("Student name :");
		add.name = input.next();
		System.out.print("E-mail address :");
		add.email = input.next();
		System.out.print("Phone number :");
		add.phone = input.next();
		System.out.println("Add student complete!");
	}
	

}
