import java.util.Scanner;

public class StudentManager {
	Student student;
	Scanner input;
	
	StudentManager(Scanner input){
		this.input = input;
	}
		
	public void viewstudent() {
		System.out.print("Student ID :");
		int studentId = input.nextInt();
		if(student.id==studentId) {
			student.printInfo();
		}
	}
}


