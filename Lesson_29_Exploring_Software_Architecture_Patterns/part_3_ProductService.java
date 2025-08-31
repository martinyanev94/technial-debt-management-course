// Product Service
class Product {
    private int id;
    private String name;
    
    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class ProductService {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getAllProducts() {
        return products;
    }
}
