package com.techelevator;

import java.util.Scanner;

/*
 * This is the only class that should have any usage of System.out or System.in
 */
public class Menu {
	
	private static final Scanner in = new Scanner(System.in);

	public void showWelcomeMessage() {

		System.out.println("*************************");
		System.out.println("**     Weyland Corp.   **");
		System.out.println("**      Catering       **");
		System.out.println("*************************");
		System.out.println();
	}
	public String fileNotFoundError(){
		//System.out.println("File not found");
		return "File not found";
	}

	public String getInventoryPathFromUser() {
		System.out.println("Path to inventory file:");
		return in.nextLine();
	}
	public String getItemSelectionFromUser(){
		System.out.println("Please enter a product code ");
		String code = in.nextLine();

		return code;
				//new LineItem(quantity, new Beverage("Code1", "Tasty Beverage", 100));
	}

	public int getItemQuantityFromUser() {
		System.out.println("How many would you like to buy? ");
		int quantity = Integer.parseInt(in.nextLine());
		return quantity;
	}

	public String getChoiceFromMainMenu() {
		String choice = null;
		while (choice == null) {
			System.out.println("1) Display Catering Items ");
			System.out.println("2) Order ");
			System.out.println("3) Quit  ");

			choice = in.nextLine();

			if (choice.equalsIgnoreCase("1") ||
					choice.equalsIgnoreCase("2") || choice.equalsIgnoreCase("3")) {
				break;
			} else {
				System.out.println("Invalid selection!");
				choice = null;
			}
		}
		return choice;

	}
	public String getChoiceFromOrderMenu() {

		String choice = null;

		while(choice == null) {
			System.out.println("1) Add Money ");
			System.out.println("2) Select Products ");
			System.out.println("3) Complete Transaction ");


			choice = in.nextLine();

			if (choice.equalsIgnoreCase("1") ||
					choice.equalsIgnoreCase("2") || choice.equalsIgnoreCase("3")) {
				break;
			} else {
				System.out.println("Invalid selection!");
				choice = null;
			}
		}

		return choice;

	}

	public int getAmountOfMoneyToAdd() {
		System.out.println("How much money would you like to add?");
		return Integer.parseInt(in.nextLine());
	}

	public void completeTransaction(String change, String cart, double orderTotal){

		System.out.println("Order Summary:\n" + cart );
		System.out.println("Total:  $" + orderTotal );
		System.out.println("Thanks for shopping with Weyland Corp. Catering!");
		System.out.println("your change is  " + change);

	}



}
