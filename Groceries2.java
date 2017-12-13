import java.io.PrintStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Groceries2 implements Input1 {

	PrintStream ps = new PrintStream(System.out);
	Scanner sc = new Scanner(System.in);

	SortedMap<String, Integer> sm = new TreeMap<String, Integer>();

	public int total = 0;
	private String product;
	int price;
	int mprice;
	int price1;
	int quantity = 1;

	Groceries2() {

		sm.put("Wheat", 120);
		sm.put("Maize", 60);

	}

	public void insert() {

		ps.println("Enter the  name and price of the product:");
		product = sc.next();

		try {

			price = sc.nextInt();

		} catch (Exception e) {

			ps.println("Please enter number only:" + e.getMessage());

		}

		if (sm.containsKey(product)) {

			mprice = price;

			// price1 = price + mprice;

			sm.put(product, price + mprice);

		} else {

			sm.put(product, price);

		}
	}

	public void delete() {

		ps.println("Enter the product that you want to delete:");
		String temp = sc.next();

		if (sm.remove(temp) != null) {

			ps.println("Done");

		} else {

			ps.println("There is no such item of groceries in the list");

		}

	}

	public void display() {

		ps.println(sm);

	}

}