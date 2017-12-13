import java.io.PrintStream;
import java.util.Scanner;

public class Commerce2 {

	static Cosmetics2 c1 = new Cosmetics2();
	static Groceries2 g1 = new Groceries2();
	static Total t1 = new Total();

	// void total() {
	// int price;
	// System.out.println("Total of Cosmetics is: " + c1.t);
	// System.out.println("Total of Groceries is: " + g1.price);
	// price = c1.t + g1.price;
	// System.out.println("Final Total is: " + price);
	// }

	public static void main(String args[]) {
		PrintStream ps = new PrintStream(System.out);
		Scanner sc = new Scanner(System.in);

		Name2 n = new Name2();
		String name = new String();
		int number = 0;
		boolean b = true;

		ps.println("Welcome to My shop");

		ps.println("Did you want to enter customer details along with contact number");
		ps.println("1.Yes\n2.No");
		ps.println("Choose which type of customer you are: ");

		int ch = sc.nextInt();
		switch (ch) {

		case 1:
			n.input(name, number);
			break;

		case 2:
			n.input(name);
			break;

		}

		while (b == true) {

			ps.println("Enter which type of products you want to enter:");
			ps.println("1.Cosmotics\n2.Groceries\n3.Total");
			ps.println("If you don't want to enter press 4 to exit");

			int ch1 = sc.nextInt();
			switch (ch1) {

			case 1:
				ps.println(c1.sm);
				boolean a = true;
				while (a == true) {

					ps.println("Please select the one of the following action........");
					ps.println("1.Insert\n2.Delete\n3.Display\n4.Exit");

					try {
						int ch2 = sc.nextInt();

						switch (ch2) {

						case 1:

							c1.insert();
							break;

						case 2:
							c1.delete();
							break;

						case 3:
							c1.display();
							break;

						case 4:
							a = false;
							break;

						default:
							ps.println("Please enter a valid entry");
							break;
						}

					} catch (Exception e) {
						ps.println("Please Enter a valid input:" + e);
					}
				}
				break;

			case 2:
				ps.println(g1.sm);
				a = true;
				while (a == true) {

					ps.println("Please select the one of the following action........");
					ps.println("1.Insert\n2.Delete\n3.Display\n4.Exit");

					int ch3 = sc.nextInt();

					switch (ch3) {

					case 1:
						g1.insert();
						break;

					case 2:
						g1.delete();
						break;

					case 3:
						g1.display();
						break;

					case 4:
						a = false;
						break;

					default:
						ps.println("Please enter a valid entry");
						break;
					}
				}
				break;

			case 3:
				a = true;

				while (a == true) {
					t1.total();
					break;

				}
				break;
				
			case 4:
				b = false;
				System.exit(0);
				break;

			// ps.println("Name of the customer is : " + n.name);
			// ps.println("Number of the cutomer is : " + n.number);
			// ps.print("Final total is : " + c1.price);
			// sc.close();
			}
		}
		// ps.print("Final total is : " + c1.price);
	}
}