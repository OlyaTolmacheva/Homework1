public interface VendingMachine {
    void addProductList(Product product);
    Product getProduct(String name);
    Product getProduct(double cost);
}
