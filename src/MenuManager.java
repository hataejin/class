import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 5;
		while(num!=6) {
		System.out.println("1. Add Student");
		System.out.println("2. Delete Student");
		System.out.println("3. Edit Student");
		System.out.println("4. View Student");
		System.out.println("5. show a menu");
		System.out.println("6. Exit");
		System.out.println("Select 1~6");
		num = input.nextInt();
		if(num == 1) {
			addstudent();
			}
		else if(num == 2) {
			deletestudent();
			}
		else if(num == 3) {
			editstudent();
			}
		else if(num == 4) {
			viewstudent();
			}
		}
}


	public static void addstudent() {
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID :");
		int studentId = input.nextInt();
		System.out.print("Student name :");
		String studentName = input.next();
		System.out.println(studentName);
		System.out.print("E-mail address :");
		String studentaddress = input.next();
		System.out.println(studentaddress);
		System.out.print("Phone number :");
		String phone = input.next();
	}
	public static void deletestudent() {
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID :");
		int studentId = input.nextInt();
	}
		 
	public static void editstudent() {
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID :");
		int studentId = input.nextInt();
		
	} 
	public static void viewstudent() {
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID :");
		int studentId = input.nextInt();
	}
}