import java.util.Scanner;

public class StudentManager {
	Student student;
	Scanner input;
	
	StudentManager(Scanner input){
		this.input = input;
	}
		 
	public void editstudent() {
		System.out.print("Student ID :");
		int studentId = input.nextInt();
		if(student.id == studentId) {
			int num = 0;
			while(num<=5) {
			System.out.println("**edit**");
			System.out.println("1. edit id");
			System.out.println("2. edit name");
			System.out.println("3. edit email");
			System.out.println("4. view phone");
			System.out.println("5. Exit");
			System.out.println("Select 1~6");
			num = input.nextInt();
			if(num==1) {
				System.out.print("Student ID :");
				student.id = input.nextInt();
			}
			if(num == 2) {
				System.out.print("Student name :");
				student.name = input.next();
				}
			else if(num == 3) {
				System.out.print("E-mail address :");
				student.email = input.next();
				}
			else if(num == 4) {
				System.out.print("Phone number :");
				student.phone = input.next();
				}
			else if(num==5) {
				System.out.println("compliete!");
				break;
				}
			}
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


