import java.util.Scanner;

public class Deletestudent {
	Student del;
	Scanner input;
	Deletestudent(Scanner input){
		this.input = input;
	}
	public void deletestudent() {
		System.out.print("Student ID :");
		int studentId = input.nextInt();
		if (del == null) {
			System.out.println("the student has not been registered");
			return;
		}
		if(del.id == studentId) {
			del = null;
			System.out.println("the student is deleted");
		}
	}

}
