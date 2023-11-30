class Cappuccino implements Coffee {
    private String size;
    private boolean hasSugar;
    private String design;

    public Cappuccino(String size, String design, boolean hasSugar) {
        this.size = size;
        this.design = design;
        this.hasSugar = hasSugar;
    }

    public String brew() {
        System.out.println("Brewing Cappuccino (" + size + ") with design "+design);
        return "Cappuccino";
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
        if (hasSugar) {
            cost += 0.25;
        }

        return cost;
    }
}

