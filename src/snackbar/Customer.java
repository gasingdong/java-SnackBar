package snackbar;

public class Customer {

	private static int customerId = 0;

	private int id;
	private String name;
	private double cash;

	public Customer(String name, double cash) {
		this.id = customerId;
		customerId++;
		this.name = name;
		this.cash = cash;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void addCash(double cash) {
		this.cash += cash;
	}

	public void buy(double amount) {
		this.cash = Math.max(0, this.cash - amount);
	}

	public double getCash() {
		return this.cash;
	}
}