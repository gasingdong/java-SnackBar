package snackbar;

public class Customer {

	private int id;
	private String name;
	private double cash;

	public Customer() {
		this.id = 0;
		this.name = "";
		this.cash = 0.0d;
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