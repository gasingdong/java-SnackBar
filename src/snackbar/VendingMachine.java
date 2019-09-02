package snackbar;

public class VendingMachine {

	private static void machineId = 0;

	private int id;
	private String name;

	public VendingMachine(String name) {
		this.id = machineId;
		machineId++;
		this.name = name;
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