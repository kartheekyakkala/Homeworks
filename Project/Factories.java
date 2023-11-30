// Step 3: Coffee Factory Interface
interface CoffeeFactory {
    Coffee createCoffee(String size);
}

// Step 4: Concrete Coffee Factories
class BlackCoffeeFactory implements CoffeeFactory {
    public Coffee createCoffee(String size) {
        return new BlackCoffee(size);
    }
}

class LatteFactory implements CoffeeFactory {
    public Coffee createCoffee(String size) {
        // For a Latte, you might provide additional options like milk and sugar
        boolean hasMilk = true;
        boolean hasSugar = false;
        return new Latte(size, hasMilk, hasSugar);
    }
}

class CappuccinoFactory implements CoffeeFactory {
    public Coffee createCoffee(String size) {
        // For a Cappuccino, you might provide additional options like design and sugar
        boolean hasSugar = true;
        String design = "Love";
        return new Cappuccino(size, design, hasSugar);
    }
}
