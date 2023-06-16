

public class Coffee {
    private String type;
    private int price;
    private int waterNeeded;
    private int milkNeeded;
    private int coffeeBeansNeeded;

    public Coffee(String type, int price, int waterNeeded, int milkNeeded, int coffeeBeansNeeded) {
        this.type = type;
        this.price = price;
        this.waterNeeded = waterNeeded;
        this.milkNeeded = milkNeeded;
        this.coffeeBeansNeeded = coffeeBeansNeeded;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public int getWaterNeeded() {
        return waterNeeded;
    }

    public int getMilkNeeded() {
        return milkNeeded;
    }

    public int getCoffeeBeansNeeded() {
        return coffeeBeansNeeded;
    }
}
