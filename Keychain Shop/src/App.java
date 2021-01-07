import java.util.Scanner;

public class App {
	
    static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		
		boolean isValid = true;
		int numKeychains = 0;
		int keychainPrice = 10;
		double salesTax = .0825;
		int baseShippingCost = 5;
		int additionalShippingCost = 1;
		
		System.out.println("Welcome to ye o\'l keychain shop.");

		while(isValid) {
			System.out.println("1. Add Keychains");
			System.out.println("2. Remove Keychains");
			System.out.println("3. View Order");
			System.out.println("4. Checkout");
			System.out.println();

			System.out.println("Select Your Option: ");

			int response = s.nextInt();

			switch (response) {
			case 1:
				numKeychains = addKeychains(numKeychains);
				break;
			case 2:
				numKeychains = removeKeychains(numKeychains);
				break;
			case 3:
				viewOrder(numKeychains, keychainPrice, salesTax, baseShippingCost, additionalShippingCost);
				break;
			case 4:
				checkout(numKeychains, keychainPrice, salesTax, baseShippingCost, additionalShippingCost);
				isValid = false;
//				System.exit(0);
				break;
			default:
				System.out.println("This is not a valid Menu Option! Please Select Another");
				break;
			}
		}
		s.close();
	} // end main method

	public static int addKeychains(int newNumKeychains) {
		System.out.println("Add keychains");
		System.out.println("You have " + newNumKeychains + " keychains. How many would you like to add?");
		int newValue = s.nextInt();
		newValue += newNumKeychains;
		System.out.println("You now have " + newValue + " keychains.");
		return newValue;
	}

	public static int removeKeychains(int newNumKeychains) {
		System.out.println("Remove keychains");
		System.out.println("You have " + newNumKeychains + " keychains. How many would you like to remove?");
		int newValue = s.nextInt();
		newValue = newNumKeychains - newValue;
		if(newValue >= 0) {
			System.out.println("You now have " + newValue + " keychains.");
		} else {
			System.out.println("You can't have less than 0 keychains. Please remove a valid number of keychains");
			System.out.println("You have " + newNumKeychains + " keychains. How many would you like to remove?");
			newValue = s.nextInt();
			System.out.println("You now have " + newValue + " keychains.");
		}
		return newValue;
	}

	public static void viewOrder(int newNumKeychains, double price_per_keychain, double tax, int base_shipping, int per_keychain_shipping) {
		System.out.println("View Order");
		System.out.println("You have " + newNumKeychains + " keychains");
		System.out.println("Each keychain cost $10.");
		// price before tax
		price_per_keychain = (newNumKeychains * 10) + base_shipping;
		// add additional shipping cost if more than 1 key chain is ordered
		if(newNumKeychains > 1) {
			price_per_keychain += (per_keychain_shipping * newNumKeychains) - 1;
		} 
		// total with tax
		double price_with_tax = price_per_keychain * tax;
		double total = price_per_keychain + price_with_tax;
		System.out.println("Your total cost is $" + total + ".");
	}

	public static void checkout(int newNumKeychains, double price_per_keychain, double tax, int base_shipping, int per_keychain_shipping) {
		Scanner s2 = new Scanner(System.in);
		
		System.out.println("Checkout");
		
		System.out.println("What is your name?");
		String name = s2.nextLine();
		
		viewOrder(newNumKeychains, price_per_keychain, tax, base_shipping, per_keychain_shipping);
		
		System.out.println("Thank you for your order, " + name + ".");
		s2.close();
	}
}