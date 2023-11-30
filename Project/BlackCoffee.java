class BlackCoffee implements Coffee {
    private String size;

    public BlackCoffee(String size) {
        this.size = size;
    }

    public String brew() {
        System.out.println("Brewing Black Coffee (" + size + ")");
        return "Black Coffee";
    }

    public double getCost() {
        // Add cost calculation based on size
        switch (size.toLowerCase()) {
            case "small":
                return 2.0;
            case "medium":
                return 2.5;
            case "large":
                return 3.0;
            default:
                return 2.0;
        }
    }
}
