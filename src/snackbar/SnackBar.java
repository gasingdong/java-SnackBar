package snackbar;

public class SnackBar {

	public static void main(String[] args) {
		Customer jane = new Customer("Jane", 45.25d);
		Customer bob = new Customer("Bob", 33.14d);

		VendingMachine food = new VendingMachine("Food");
		VendingMachine drink = new VendingMachine("Drink");
		VendingMachine office = new VendingMachine("Office");
	}
}