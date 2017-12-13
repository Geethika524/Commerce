import java.io.PrintStream;
import java.util.Scanner;

public class Name2 implements Input2 {

	PrintStream ps = new PrintStream(System.out);
	Scanner sc = new Scanner(System.in);

	String name;
	int number;

	public void input(String name1) {

		ps.println("Enter Customer name");
		name = sc.nextLine();

	}

	public void input(String name1, int number1) {

		ps.println("Enter Customer name");
		name = sc.nextLine();

		
		try {
			ps.println("Enter Customer number");
			number = sc.nextInt();
		} catch (Exception e) {
			ps.println("Please enter numbers only " + e.getMessage());
			
		} finally {
			ps.println("Invalid number, Number is not stored");
//			int number2 = sc.nextInt();
			
		}
		
	}
	

}