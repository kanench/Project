/**
 * 
 */
package com.oocl.mnlbc.group3.transaction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.oocl.mnlbc.group3.model.Customer;
import com.oocl.mnlbc.group3.model.Order;
import com.oocl.mnlbc.group3.model.Product;
import com.oocl.mnlbc.group3.model.Warehouse;
import com.oocl.mnlbc.group3.util.Validators;

/**
 * @author KANENCH
 *
 */
public class ShoppingTransaction {

	static Customer cust;
	static BufferedReader input;

	List<Product> cart;
	public ShoppingTransaction() {
		input = new BufferedReader(new InputStreamReader(System.in));
	}

	public void registerUser() throws IOException {
		Validators validate = new Validators();
		System.out.println("Register now!");

		String firstName;
		String lastName;
		String userName;
		String emailAddress;
		String mobileNumber;
		double balance;
		System.out.print("Enter your first name: ");
		firstName = input.readLine();
		System.out.print("Enter your last name: ");
		lastName = input.readLine();
		System.out.print("Enter a user name: ");
		userName = input.readLine();
		do {
			System.out.print("Enter your email address: ");
			emailAddress = input.readLine();
		} while (!validate.checkEmail(emailAddress));
		do {
			System.out.print("Enter your mobile number: ");
			mobileNumber = input.readLine();
		} while (!validate.checkPhone(mobileNumber));

		System.out.print("Enter your balance: ");
		balance = Double.parseDouble(input.readLine());
		cust = new Customer(1, firstName, lastName, userName, emailAddress,
				mobileNumber, balance);

		System.out.println();
		System.out.println(cust.toString());
		System.out.println();
	}

	public void addBalance() {
		System.out.print("How much balance will you add?: $");
		Scanner input = new Scanner(System.in);
		int amount = 0;
		amount = input.nextInt();

		cust.setBalance(amount + cust.getBalance());
		System.out.println("Your new balance is: " + cust.getBalance());

	}

	public void displayOptions() {

		System.out.println("Please select transaction: [1-5]");
		System.out.println("[1]  Shop Now!");
		System.out.println("[2]  Check our products!");
		System.out.println("[3]  Check your balance.");
		System.out.println("[4]  Deposit additional balance.");
		System.out.println("[5]  Logout.");

	}

	public String readOption() throws IOException {
		boolean inputValid = false;
		String choiceStr = "";
		do {
			System.out.print("Enter your Transaction No.: ");
			choiceStr = input.readLine();
			if (choiceStr.equals("1") || choiceStr.equals("2")
					|| choiceStr.equals("3") || choiceStr.equals("4")
					|| choiceStr.equals("5")) {
				inputValid = true;
			} else {
				System.out
						.println("Please select a number between [1-5] only.");
			}
		} while (!inputValid);

		return choiceStr;

	}

	public void checkBalance() {

		System.out.println("Current Balance: " + cust.getBalance());
	}

	public void displayProduct() {
		Warehouse warehouse = new Warehouse();
		warehouse.listProducts();
		pressAnyKeyToContinue();

	}

	/*
	 * This method will do the Transaction of Ordering of user Add List of
	 * Products to Order List and Use warehouse to get and minus the stock of
	 * the order. Display current order list
	 */
	public void placeAnOrder() throws IOException {
		int prodNumber = 0;
		double quantity;
		double itemsSubtotal = 0;
		double totalAmount = 0;
		cart = new ArrayList<Product>();

		Warehouse warehouse = new Warehouse();
		Product prod=null;
		String proceed;
		int ctr=0;

		do{
		warehouse.listProducts();
//		Scanner input = new Scanner(System.in);
		
		while(prod == null){
			System.out.println("Choose an Item");
			System.out.print("Enter Product Number: ");
			prodNumber = Integer.parseInt(input.readLine());
			prod = warehouse.getProduct(prodNumber);
			if(prod==null){
				System.out.println("Choose a valid product");
			}
		}
		
		
				
		cart.add(warehouse.getProduct(prodNumber));

		System.out.print("Enter Quantity: ");
		quantity = Double.parseDouble(input.readLine());

		itemsSubtotal = (prod.getPrice() * quantity);
		cart.get(ctr).setInStock((int) quantity);
		ctr++;
		
		totalAmount+=itemsSubtotal;
		System.out.println("Items Subtotal: " + itemsSubtotal);
		System.out.println("Total Amount: " + totalAmount);

		System.out.print("Add another product?[y/n]: ");
		proceed=input.readLine();
		
		}while(proceed.equalsIgnoreCase("y"));
		totalAmount=0;		
		for (Product item : cart) {
			totalAmount += (item.getPrice() * item.getInStock());
		}

		System.out.println("Final Amount: " + totalAmount);

		System.out.println("You are now proceeding to payment...");
		doPayment(totalAmount);
		

	}

	/*
	 * This method will compute the transaction if user has proceed to payment
	 * New Balance = Current Balance - Total Price of Transaction Display New
	 * balance of customer.
	 */
	public void doPayment(double totalPrice) throws IOException {
		System.out.println("");
		String proceed="";
		double currentBalance = cust.getBalance();
		double totalCost=0;
		double remainingBalance;
		
		if(currentBalance >= totalPrice){
			remainingBalance = currentBalance - totalPrice;
			cust.setBalance(remainingBalance);
			System.out.println("Order created.");
			System.out.println("Your remaining balance is " + remainingBalance);
		}else{
			System.out.println("Insufficient Balance.");
			System.out.println("Your cart items are:");
			
			for(Product item: cart){
				System.out.println(item.getProductName() + "- quantity: " + item.getInStock());
				totalCost+=item.getPrice() * item.getInStock();
				
			}
			System.out.print("Do you want to reset your cart or cancel transaction[r/c]?: ");
			proceed=input.readLine();
			if(proceed.equalsIgnoreCase("r")){
			    cart=null;
				placeAnOrder();
			}else
			{
				displayOptions();
				readOption();
			}
			
			System.out.println("Total cost: "+ totalCost);
			System.out.println("Your current balance is " + currentBalance);
			
		}
			
	}

	public void printReciept() {

	}

	private void pressAnyKeyToContinue() {
		System.out.println("Press Enter to continue...\n");
		try {
			Scanner input = new Scanner(System.in);
			input.nextLine();
		} catch (Exception e) {
		}
	}
	
	private void removeItem(){
		
	}
}