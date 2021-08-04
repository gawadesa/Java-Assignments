package com.mastek.shoppingcart;

import com.mastek.shoppingcart.model.Cart;
import com.mastek.shoppingcart.model.Item;

import java.util.Scanner;

public class ShoppingCart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cart cart = new Cart();

		Item i1 = null;
		System.out.println("How many product you want to buy");
		Integer NumberOfProducts = sc.nextInt();
		while (NumberOfProducts > 0) {

			System.out.println("Enter Product Name");
			String itemName = sc.next();
			System.out.println("Enter your Quantity");
			Integer Quantity = sc.nextInt();
			System.out.println("Enter your Price");
			Double Price = sc.nextDouble();

			i1 = new Item(itemName, Quantity, Price);
			cart.addToCart(i1);

			NumberOfProducts--;
		}

		cart.showCart();

		cart.showCart();

		double totalAmount = cart.getTotalAmount();
		System.out.println(totalAmount);

		double payableAmount = cart.getPayableAmount();
		System.out.println(payableAmount);

		cart.applyCoupon("BLACK");

		cart.printInvoice();

		cart.removeFromCart(i1);
		System.out.println("After Remove the item");

		cart.printInvoice();

	}
}
