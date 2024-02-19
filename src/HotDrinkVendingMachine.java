import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine{
    List<Product> hotDrinkList = new ArrayList<>();

    public void addProductList(Product product) {
        hotDrinkList.add(product);
    }
    @Override
    public Product getProduct(String name) {
        for (Product product : hotDrinkList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public Product getProduct(double cost) {
        for (Product product : hotDrinkList) {
            if (product.getCost() == cost) {
                return product;
            }
        }
        return null;
    }
    public Product getProduct(String name, double cost, double volume) {
        for (Product hotDrink : hotDrinkList) {
            if (hotDrink.getName().equals(name) && hotDrink.getCost() == cost && ((HotDrink) hotDrink).getVolume() == volume) {
                return hotDrink;
            }
        }
        return null;
    }
}
