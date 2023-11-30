// Step 6: Client Code
public class CoffeeShop {
    public static void main(String[] args) {
        CoffeeFactory blackCoffeeFactory = new BlackCoffeeFactory();
        CoffeeFactory latteFactory = new LatteFactory();

        CoffeeFacade customer1 = new CoffeeFacade(blackCoffeeFactory);
        System.out.println("Order for customer1");
        coffeeFacade2.orderCoffee("medium");

        CoffeeFacade customer2 = new CoffeeFacade(latteFactory);
        System.out.println("Order for customer2");
        coffeeFacade2.orderCoffee("large");
        coffeeFacade2.orderCoffee("small");

        System.out.println("Order history of customer2");
        coffeeFacade2.displayOrderHistory();

        CoffeeFacade customer3 = new CoffeeFacade(latteFactory);
        System.out.println("Order for customer3");
        coffeeFacade2.orderCoffee("medium");
        coffeeFacade2.orderCoffee("small");

        System.out.println("Order history of customer3");
        coffeeFacade2.displayOrderHistory();

    }
}
