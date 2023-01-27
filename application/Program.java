package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Entre product data: ");
		System.out.println("name: ");
		product.name = sc.nextLine();
		System.out.println("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock");
		product.quantity = sc.nextInt();
		
		System.out.println(product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be remove in stock: ");
		int quantityRemove = sc.nextInt();
		product.removeProducts(quantityRemove);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close();
				
	}
}
