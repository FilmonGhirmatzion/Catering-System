package com.techelevator;

import java.io.FileNotFoundException;

/*
 * This class should control the workflow of the application, but not do any other work
 * 
 * The menu class should communicate with the user, but do no other work
 * 
 * The work of the Catering System should be in other classes that you build and 
 * call from here. 
 */
public class CateringSystemCLI {

	private static final String CHOICE_QUIT = "3";
	private static final String CHOICE_SHOW_CATERING_ITEMS = "1";
	private static final String CHOICE_ORDER ="2";



	/*
	 * The menu class is instantiated in the main() method at the bottom of this file.  
	 * It is the only class instantiated in the starter code.  
	 * You will need to instantiate all other classes using the new keyword before you can use them.
	 * 
	 * Remember every class and data structure is a data types and can be passed as arguments to methods or constructors.
	 */
	private Menu menu;
	private CateringMachine cateringMachine;
	private CustomerAccount customerAccount = new CustomerAccount();
	private ShoppingCart shoppingCart;

	public CateringSystemCLI(Menu menu) {
		this.menu = menu;
	}


	/*
	 * Your application starts here
	 */
	public void run() {
		shoppingCart = new ShoppingCart();

		menu.showWelcomeMessage();


		while (true) {
			String filename = menu.getInventoryPathFromUser();
			try {
				cateringMachine = new CateringMachine(filename);

				break;
			} catch (FileNotFoundException e) {
				menu.fileNotFoundError();
			}
		}

		menu.showWelcomeMessage();

		while(true) {
			String choice = menu.getChoiceFromMainMenu();

			if (choice.equalsIgnoreCase(CHOICE_QUIT)) {
				break;
			} else if (choice.equalsIgnoreCase(CHOICE_SHOW_CATERING_ITEMS)) {
				cateringMachine.getInventoryAsString();
				System.out.println(cateringMachine.getInventoryAsString());
			} else if (choice.equalsIgnoreCase(CHOICE_ORDER)){
               String choiceAddMoney = "1";
               String ChoiceSelectProduct ="2";
               String ChoiceCompleteTransaction = "3";

				String orderChoice= menu.getChoiceFromOrderMenu();

				if (orderChoice.equalsIgnoreCase(choiceAddMoney)){
					int moneyToAdd = menu.getAmountOfMoneyToAdd();
					customerAccount.deposit(moneyToAdd);

				}else if (orderChoice.equalsIgnoreCase(ChoiceSelectProduct)){

					String codeOfItemToAdd = menu.getItemSelectionFromUser();
					int quantityOfItemToAdd = menu.getItemQuantityFromUser();
					LineItem itemToAdd = new LineItem(quantityOfItemToAdd, cateringMachine.getCateringItemByProductCode(codeOfItemToAdd));
                      customerAccount.withdraw(itemToAdd.getTotalCost());
                      shoppingCart.addItem(itemToAdd);
				}else if (orderChoice.equalsIgnoreCase(ChoiceCompleteTransaction)){
                   String change = cateringMachine.makeChange (customerAccount.getBalance());
                   String cart = shoppingCart.toString();
                   double total = shoppingCart.cartTotal();
					menu.completeTransaction(change, cart, total);
				}
			}

		}





	}

		//menu.showGoodbye();



			/*
			Display the Starting Menu and get the users choice.
			Remember all uses of System.out and System.in should be in the menu
			
			IF the User Choice is Display Vending Machine Items, 
				THEN display vending machine items
			ELSE IF the User's Choice is Purchase,
				THEN go to the purchase menu
			*/



	/*
	 * This starts the application, but you shouldn't need to change it.  
	 */
	public static void main(String[] args) {
		Menu menu = new Menu();
		CateringSystemCLI cli = new CateringSystemCLI(menu);
		cli.run();
	}
}
