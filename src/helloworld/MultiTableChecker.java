package helloworld;

public class MultiTableChecker {
	public static void main(String[]args) {
		for(int i =1; i < 10; i = i+1) {
			if(i==5) {
			break;
			}
			for(int j = 1 ; j<9; j++) {
				System.out.print(i + "*" + j + "=" +(i*j)+"\t");
			}
			System.out.println();
		}
		
		
	}
	

}
	
