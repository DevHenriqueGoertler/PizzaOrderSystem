package application;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Pizza;
import model.services.Order;
import model.services.OrderItem;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Order order = new Order(new Date());
		
		String flavor;
		int quantity;
		double price;
		
		System.out.println("How many items do you want to order?");
		int n = sc.nextInt();
		
		for (int i = 0; i<n; i++) {
			System.out.println("Which flavor for pizza #" + (i+1) + "?");
			flavor = sc.next();
			System.out.println("How much pizzas of " + flavor + "?");
			quantity = sc.nextInt();
			System.out.print("Enter pizza price: ");
			price = sc.nextDouble();
			System.out.println();
			
			order.addItem(new OrderItem(quantity, price, new Pizza(flavor, price)));
		}
		
		System.out.println(order);
		
		sc.close();

	}

}
