public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

public class Order {
    private List<Product> products;

    public Order() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Added " + product.getName() + " to the order.");
    }

    public double calculateTotal() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }
}

public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }
    
    public void placeOrder(Order order) {
        double totalAmount = order.calculateTotal();
        System.out.println(name + " placed an order totaling: " + totalAmount);
    }
}
