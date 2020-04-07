import java.util.Scanner;

public class Editstudent {
	Student edit;
	Scanner input;
	
	Editstudent(Scanner input){
		this.input = input;
	}
	public void editstudent() {
		System.out.print("Student ID :");
		int studentId = input.nextInt();
		if(edit.id == studentId) {
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
				edit.id = input.nextInt();
			}
			if(num == 2) {
				System.out.print("Student name :");
				edit.name = input.next();
				}
			else if(num == 3) {
				System.out.print("E-mail address :");
				edit.email = input.next();
				}
			else if(num == 4) {
				System.out.print("Phone number :");
				edit.phone = input.next();
				}
			else if(num==5) {
				System.out.println("compliete!");
				break;
				}
			}
			System.out.println("the student to be edited is " + studentId);
		}
		}

}
