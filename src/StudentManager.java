import java.util.Scanner;

public class StudentManager {
	Student student;
	Scanner input;
	
	StudentManager(Scanner input){
		this.input = input;
	}
	public void addstudent() {
		student = new Student();
		System.out.print("Student ID :");
		student.id = input.nextInt();
		System.out.print("Student name :");
		student.name = input.next();
		System.out.print("E-mail address :");
		student.email = input.next();
		System.out.print("Phone number :");
		student.phone = input.next();
		System.out.println("Add student complete!");
	}
	public void deletestudent() {
		System.out.print("Student ID :");
		int studentId = input.nextInt();
		if (student == null) {
			System.out.println("the student has not been registered");
			return;
		}
		if(student.id == studentId) {
			student = null;
			System.out.println("the student is deleted");
		}
	}
		 
	public void editstudent() {
		System.out.print("Student ID :");
		int studentId = input.nextInt();
		if(student.id == studentId) {
			System.out.println("the student to be edited is " + studentId);
		}
		}
	public void viewstudent() {
		System.out.print("Student ID :");
		int studentId = input.nextInt();
		if(student.id==studentId) {
			student.printInfo();
		}
	}
}


