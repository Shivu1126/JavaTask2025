package assignment11Abstract.shoppingcart2;

import java.util.ArrayList;
import java.util.List;

class ElectronicsProduct extends Product{
	private String brand;
	private int count;
	public ElectronicsProduct(String productName, double price, String brand, int count) {
		super(productName, price);
		this.brand = brand;
		this.count = count;
	}

	@Override
	public double getPrice() {
		return price*count;
	}

	@Override
	public String getDescription() {
		return "Electronics: "+productName+" (Brand: "+brand+", Price:"+price+", Count: "+count+")";
	}
}

class ClothingProduct extends Product{
	private String brand;
	private int count;
	private String size;
	public ClothingProduct(String productName, double price, String brand, int count, String size) {
		super(productName, price);
		this.brand = brand;
		this.count = count;
		this.size = size;
	}

	@Override
	public double getPrice() {
		return price*count;
	}

	@Override
	public String getDescription() {
		return "Clothings: "+productName+" (Brand: "+brand+", Size:"+size+", Price:"+price+", Count: "+count+")";
	}
}

class BookProduct extends Product {
    private String author;
    private int count;

    public BookProduct(String productName, double price, String author, int count) {
        super(productName, price);
        this.author = author;
        this.count = count;
    }

    @Override
    public double getPrice() {
        return price*count;
    }

    @Override
    public String getDescription() {
        return "Book: " + productName + " (Author: " + author + ", Price:"+price+", Count: "+count+")";
    }
}

class ShoppingCart {
    private List<Product> cart;

    public ShoppingCart() {
        cart = new ArrayList<>();
    }

    public void addProduct(Product product) {
        cart.add(product);
    }

    public void displayCart() {
        System.err.println("Shopping Cart:");
        double totalPrice = 0;
        for (Product product : cart) {
            System.out.print(product.getDescription() + " - ");
            System.err.println("₹" + product.getPrice());
            totalPrice += product.getPrice();
        }
        System.out.print("Total Price: ");
        System.err.println("₹" + totalPrice);
    }
}

public class ShoppingSystem {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();

        Product laptop = new ElectronicsProduct("Laptop", 42000.50, "Dell",1);
        Product tshirt = new ClothingProduct("T-Shirt", 299.99, "OTTO",3,"M");
        Product book = new BookProduct("Java Programming", 245.75, "James Gosling",2);

        cart.addProduct(laptop);
        cart.addProduct(tshirt);
        cart.addProduct(book);

        cart.displayCart();
	}

}
