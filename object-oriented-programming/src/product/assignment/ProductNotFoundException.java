package product.assignment;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String message) {

        super(message+"Product Not Found");
    }
}
