
public class Book extends Product {

private String author;
private String genre;
private String isbn;

public Book(String name, double price, int quantity, String author) {
	super(name, price, quantity);
	this.author = author;
}
public Book(String name, double price, int quantity, String author, String genre, String isbn) {
	super(name, price, quantity);
	this.author = author;
	this.genre = genre;
	this.isbn = isbn;
}
@Override

 String getDetails() {
	 return "We sell books on Software Development";
 }

}
