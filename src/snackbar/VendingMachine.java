package snackbar;

public class VendingMachine {

	private int id;
	private String name;

	public VendingMachine() {
		this.id = 0;
		this.name = "";
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
}