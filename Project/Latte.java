class Latte implements Coffee {
    private String size;
    private boolean hasMilk;
    private boolean hasSugar;

    public Latte(String size, boolean hasMilk, boolean hasSugar) {
        this.size = size;
        this.hasMilk = hasMilk;
        this.hasSugar = hasSugar;
    }

    public String brew() {
        System.out.println("Brewing Latte (" + size + ")");
        return "Latte";
    }

    public double getCost() {
        // Add cost calculation based on size and customization
        double cost = 2.0;  // Base cost

        switch (size.toLowerCase()) {
            case "medium":
                cost += 0.5;
                break;
            case "large":
                cost += 1.0;
                break;
        }

        if (hasMilk) {
            cost += 0.5;
        }

        if (hasSugar) {
            cost += 0.25;
        }

        return cost;
    }
}
