package snackbar;

public class Snack {

	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int machineId;

	public Snack() {
		this.id = 0;
		this.name = "";
		this.quantity = 0;
		this.cost = 0.0d;
		this.machineId = 0;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getCost() {
		return this.cost;
	}

	public void setMachineId(int id) {
		this.machineId = id;
	}

	public int getMachineId() {
		return this.machineId;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void add(int restock) {
		this.quantity += restock;
	}

	public void buy(int bought) {
		this.quantity -= bought;
	}

	public double getTotalCost(int quantity) {
		return quantity * this.cost;
	}
}