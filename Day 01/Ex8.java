import java.util.ArrayList;

abstract class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public abstract void displayInfo();
}

class Fruit extends Product {
    public Fruit(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public void displayInfo() {
        System.out.println("Fruit: " + getName() + " - Price: $" + getPrice() + " - Quantity: " + getQuantity());
    }
}

class Vegetable extends Product {
    public Vegetable(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public void displayInfo() {
        System.out.println("Vegetable: " + getName() + " - Price: $" + getPrice() + " - Quantity: " + getQuantity());
    }
}

class Grocery extends Product {
    public Grocery(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public void displayInfo() {
        System.out.println("Grocery: " + getName() + " - Price: $" + getPrice() + " - Quantity: " + getQuantity());
    }
}

class Store {
    private ArrayList<Product> products;

    public Store() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayProducts() {
        for (Product product : products) {
            product.displayInfo();
        }
    }
}

public class Ex8 {
    public static void main(String[] args) {
        Store store = new Store();

        store.addProduct(new Fruit("Orange",5.0, 50));
        store.addProduct(new Vegetable("Pumpkin",10.0, 30));
        store.addProduct(new Grocery("Sugar", 1.0, 20));

        store.displayProducts();
    }
}