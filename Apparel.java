public class Apparel extends Product{

	private char size;
	private String color;

	public Apparel(String name, double price, int quantity, char size, String color) {
		super(name, price, quantity);
		this.size = size;
		this.color = color;
	}

	@Override
String getDetails () {
		return "We sell different kinds of business clothes for both men and women.";

	}
}
