import java.io.PrintStream;
import java.util.Scanner;

public class Total {
	PrintStream ps = new PrintStream(System.out);
	Scanner sc = new Scanner(System.in);

	Cosmetics2 c1 = new Cosmetics2();
	Groceries2 g1 = new Groceries2();

	int price;

	void total() {
		int price;
		System.out.println("Total of Cosmetics is: " + c1.price);
		System.out.println("Total of Groceries is: " + g1.price);
		price = c1.price + g1.price;
		System.out.println("Final Total is: " + price);
		
	}

}
