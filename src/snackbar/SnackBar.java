package snackbar;

public class SnackBar {

	public static void main(String[] args) {
		Customer jane = new Customer("Jane", 45.25d);
		Customer bob = new Customer("Bob", 33.14d);

		VendingMachine food = new VendingMachine("Food");
		VendingMachine drink = new VendingMachine("Drink");
		VendingMachine office = new VendingMachine("Office");

		int foodId = food.getId();
		Snack chips = new Snack("Chips", foodId, 36, 1.75d);
		Snack chocolateBar = new Snack("Chocolate Bar", foodId, 36, 1.00d);
		Snack pretzel = new Snack("Pretzel", foodId, 30, 2.00d);

		int drunkId = drink.getId();
		Snack soda = new Snack("Soda", drinkId, 24, 2.50d);
		Snack water = new Snack("Water", drinkId, 20, 2.75d);

		jane.buy(soda.getTotalCost(3));
		soda.buy(3);
		System.out.println(jane.getName() + " buys 3 " + soda.getName());
		System.out.println(jane.getName() + " now has " + jane.getCash());
		System.out.println("There are " + soda.getQuantity() + " " + soda.getName() + " remaining");
	}
}