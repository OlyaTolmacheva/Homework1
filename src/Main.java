public class Main {
    public static void main(String[] args ) {
        BottleOfWaterVendingMachine machine = new BottleOfWaterVendingMachine();
        machine.addProductList(new BottleOfWater("Вода1", 100, 5));
        machine.addProductList(new BottleOfWater("Вода2", 10, 0.5));
        machine.addProductList(new BottleOfWater("Вода3", 1, 1));
        machine.addProductList(new BottleOfWater("Вода4", 1000, 500));
        printProductByName(machine, "Вода1");

        HotDrinkVendingMachine machine1 = new HotDrinkVendingMachine();
        machine1.addProductList(new HotDrink("Кофе", 100, 300, 90));
        machine1.addProductList(new HotDrink("Чай", 50, 200, 80));
        printProductByName(machine1, "Кофе");
    }
    public static void printProductByName(VendingMachine vendingMachine, String name) {
        System.out.println(vendingMachine.getProduct(name));
    }
}