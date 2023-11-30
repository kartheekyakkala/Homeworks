// Step 5: Coffee Facade
class CoffeeFacade {
    private CoffeeFactory coffeeFactory;
    private List<Coffee> orderHistory;

    public CoffeeFacade(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
        this.orderHistory = new ArrayList<>();
    }

    public void orderCoffee(String size) {
        Coffee coffee = coffeeFactory.createCoffee(size);
        String coffeeType = coffee.brew();
        double cost = coffee.getCost();
        orderHistory.add(coffee);

        System.out.println("Enjoy your " + coffeeType + ". Cost: $" + cost);
    }

    public void displayOrderHistory() {
        System.out.println("\nOrder History:");
        for (Coffee coffee : orderHistory) {
            System.out.println(coffee.brew() + ". Cost: $" + coffee.getCost());
        }
    }
}
