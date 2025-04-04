package assignment11Abstract.shoppingcart2;

abstract class Product {
	protected String productName;
	protected double price;
	
	public Product(String productName, double price) {
		this.productName = productName;
		this.price = price;
	}
	public abstract double getPrice();
    public abstract String getDescription();
}
