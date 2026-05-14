package product_assignment;

public class ProductExistException extends RuntimeException {
    public ProductExistException(String message) {
        super(message);
    }
}