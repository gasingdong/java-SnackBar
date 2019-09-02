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

		int drinkId = drink.getId();
		Snack soda = new Snack("Soda", drinkId, 24, 2.50d);
		Snack water = new Snack("Water", drinkId, 20, 2.75d);

		jane.buy(soda.getTotalCost(3));
		soda.buy(3);
		System.out.println(jane.getName() + " buys 3 " + soda.getName());
		System.out.println(jane.getName() + " now has " + jane.getCash());
		System.out.println("There are " + soda.getQuantity() + " " + soda.getName() + " remaining");

		jane.buy(pretzel.getTotalCost(1));
		pretzel.buy(1);
		System.out.println(jane.getName() + " buys 1 " + pretzel.getName());
		System.out.println(jane.getName() + " now has " + jane.getCash());
		System.out.println("There are " + pretzel.getQuantity() + " " + pretzel.getName() + " remaining");

		bob.buy(soda.getTotalCost(2));
		soda.buy(2);
		System.out.println(bob.getName() + " buys 2 " + soda.getName());
		System.out.println(bob.getName() + " now has " + bob.getCash());
		System.out.println("There are " + soda.getQuantity() + " " + soda.getName() + " remaining");

		jane.addCash(10);
		System.out.println(jane.getName() + " found 10 dollars. Total cash on hand is now " + jane.getCash());

		jane.buy(chocolateBar.getTotalCost(1));
		chocolateBar.buy(1);
		System.out.println(jane.getName() + " buys 1 " + chocolateBar.getName());
		System.out.println(jane.getName() + " now has " + jane.getCash());
		System.out.println("There are " + chocolateBar.getQuantity() + " " + chocolateBar.getName() + " remaining");

		pretzel.add(12);
		System.out.println("Added 12 " + pretzel.getName() + ". Current stock is now " + pretzel.getQuantity());

		bob.buy(pretzel.getTotalCost(3));
		System.out.println(bob.getName() + " buys 3 " + pretzel.getName());
		System.out.println(bob.getName() + " now has " + bob.getCash());
		System.out.println("There are " + pretzel.getQuantity() + " " + pretzel.getName() + " remaining");
	}
}