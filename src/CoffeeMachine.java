import java.util.Scanner;

public class CoffeeMachine {
    private int water;
    private int milk;
    private int coffeeBeans;
    private int money;
    private Coffee[] coffees;
    private int espressoCupsSold;
    private int latteCupsSold;
    private int cappuccinoCupsSold;

    public CoffeeMachine(int initialWater, int initialMilk, int initialCoffeeBeans) {
        water = initialWater;
        milk = initialMilk;
        coffeeBeans = initialCoffeeBeans;
        money = 0;
        espressoCupsSold = 0;
        latteCupsSold = 0;
        cappuccinoCupsSold = 0;

        // Define the available coffees
        coffees = new Coffee[]{
                new Coffee("Espresso", 4, 250, 0, 16),
                new Coffee("Latte", 7, 350, 75, 20),
                new Coffee("Cappuccino", 6, 200, 100, 12)
        };
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.println("Select an option: ");
            System.out.println("1. Buy");
            System.out.println("2. Fill");
            System.out.println("3. Take");
            System.out.println("4. Show");
            System.out.println("5. Analytics");
            System.out.println("6. Exit");
            input = scanner.nextLine();

            if (input.equals("1")) {
                buyCoffee(scanner);
            } else if (input.equals("2")) {
                fillIngredients(scanner);
            } else if (input.equals("3")) {
                takeMoney();
            } else if (input.equals("4")) {
                showIngredients();
            } else if (input.equals("5")) {
                showAnalytics();
            } else if (input.equals("6")) {
                System.out.println("Exiting the simulation...");
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        } while (!input.equals("6"));

        scanner.close();
    }

    private void buyCoffee(Scanner scanner) {
        System.out.println("Available coffees:");
        for (int i = 0; i < coffees.length; i++) {
            Coffee coffee = coffees[i];
            System.out.println((i + 1) + ". " + coffee.getType() + " ($" + coffee.getPrice() + ")");
        }

        System.out.println("Select a coffee type (1-" + coffees.length + "): ");
        int coffeeIndex = Integer.parseInt(scanner.nextLine()) - 1;  // input given

        if (coffeeIndex < 0 || coffeeIndex >= coffees.length) {
            System.out.println("Invalid coffee type. Please try again.");
            return;
        }

        Coffee selectedCoffee = coffees[coffeeIndex];

        if (water < selectedCoffee.getWaterNeeded() || milk < selectedCoffee.getMilkNeeded() ||
                coffeeBeans < selectedCoffee.getCoffeeBeansNeeded()) {
            System.out.println("Error: Not enough ingredients to make the selected coffee.");
            return;
        }

        System.out.println("Coffee dispensed. Enjoy your " + selectedCoffee.getType() + "!");

        water -= selectedCoffee.getWaterNeeded();
        milk -= selectedCoffee.getMilkNeeded();
        coffeeBeans -= selectedCoffee.getCoffeeBeansNeeded();
        money += selectedCoffee.getPrice();
    }

    private void fillIngredients(Scanner scanner) {
        System.out.println("Enter the amount of water to add: ");
        water += Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the amount of milk to add: ");
        milk += Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the amount of coffee beans to add: ");
        coffeeBeans += Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the amount of money to add: ");
        money += Integer.parseInt(scanner.nextLine());

        System.out.println("Ingredients filled successfully!");
    }

    private void takeMoney() {
        System.out.println("Money collected: $" + money);
        money = 0;
    }

    private void showIngredients() {
        System.out.println("Ingredients available in the coffee machine:");
        System.out.println("Water: " + water + " ml");
        System.out.println("Milk: " + milk + " ml");
        System.out.println("Coffee Beans: " + coffeeBeans + " g");
        System.out.println("Money: $" + money);
    }

    private void showAnalytics() {
        System.out.println("Coffee Machine Analytics:");
        for (Coffee coffee : coffees) {
            String coffeeType = coffee.getType();
            int cupsSold = 0;

            switch (coffeeType) {
                case "Espresso":
                    cupsSold = espressoCupsSold;
                    break;
                case "Latte":
                    cupsSold = latteCupsSold;
                    break;
                case "Cappuccino":
                    cupsSold = cappuccinoCupsSold;
                    break;
            }

            System.out.println(coffeeType + " cups sold: " + cupsSold);
        }

        System.out.println("Total money earned: $" + money);
    }
}
