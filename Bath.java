public class Bath extends Product {

	public Bath(String name, double price, int quantity) {
		super(name, price, quantity);

	}

	@Override
	String getDetails() {
		return "We sell organic bath products!";
	}


}
