import java.util.Scanner;


public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StudentManager studentManager = new StudentManager(input);
		Addstudent addstudent = new Addstudent(input);
		Deletestudent deletestudent = new Deletestudent(input);
		Editstudent editstudent = new Editstudent(input);
		
		int num = 0;
		while(num<=5) {
		System.out.println("***Menu***");
		System.out.println("1. Add Student");
		System.out.println("2. Delete Student");
		System.out.println("3. Edit Student");
		System.out.println("4. View Student");
		System.out.println("5. Exit");
		System.out.println("Select 1~6");
		num = input.nextInt();
		if(num==1) {
			addstudent.addstudent();
		}
		if(num == 2) {
			deletestudent.deletestudent();
			}
		else if(num == 3) {
			editstudent.editstudent();
			}
		else if(num == 4) {
			studentManager.viewstudent();
			}
		else if(num==5) {
			System.out.println("Thank you for watching!");
			break;
			}
		}
	}
}



