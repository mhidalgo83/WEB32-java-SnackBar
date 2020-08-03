package snackbar;

public class Main {

    public static void main(String[] args) {
        // Customers
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        // Vending machines
        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        // public Snack( String name, int quantity, double cost)
        Snack chips = new Snack("Chips", 36, 1.75);
        Snack choccyBar = new Snack("Chocolate Bar", 36, 1);
        Snack pretzel = new Snack("Pretzel", 30, 2);
        Snack soda = new Snack("Soda", 24, 2.5);
        Snack water = new Snack("Water", 20, 2.75);

        chips.setMachineId(1);
        choccyBar.setMachineId(1);
        pretzel.setMachineId(1);
        soda.setMachineId(2);
        water.setMachineId(2);

        jane.setSubCash(soda.getTotalCost(3, soda.getCost()));
        soda.setSubSnack(3);

        System.out.println("\nCustomer " + jane.getCustomerId() + " cash on hand is " + jane.getCashOnHand());
        System.out.println("Quantity of snack " + soda.getId() + " is " + soda.getQuantity());

        jane.setSubCash(pretzel.getTotalCost(1, pretzel.getCost()));
        pretzel.setSubSnack(1);

        System.out.println("\nCustomer " + jane.getCustomerId() + " cash on hand is " + jane.getCashOnHand());
        System.out.println("Quantity of snack " + pretzel.getId() + " is " + pretzel.getQuantity());

        bob.setSubCash(soda.getTotalCost(2, soda.getCost()));
        soda.setSubSnack(2);

        System.out.println("\nCustomer " + bob.getCustomerId() + " cash on hand is " + bob.getCashOnHand());
        System.out.println("Quantity of snack " + soda.getId() + " is " + soda.getQuantity());

        jane.setAddCash(10);

        System.out.println("\nCustomer " + jane.getCustomerId() + " cash on hand is " + jane.getCashOnHand());

        jane.setSubCash(choccyBar.getTotalCost(1, choccyBar.getCost()));
        choccyBar.setSubSnack(1);

        System.out.println("\nCustomer " + jane.getCustomerId() + " cash on hand is " + jane.getCashOnHand());
        System.out.println("Quantity of snack " + choccyBar.getId() + " is " + choccyBar.getQuantity());

        pretzel.setAddSnack(12);
        System.out.println("\nQuantity of snack " + pretzel.getId() + " is " + pretzel.getQuantity());

        bob.setSubCash(pretzel.getTotalCost(3, pretzel.getCost()));
        pretzel.setSubSnack(3);

        System.out.println("\nCustomer " + bob.getCustomerId() + " cash on hand is " + bob.getCashOnHand());
        System.out.println("Quantity of snack " + pretzel.getId() + " is " + pretzel.getQuantity());

        // Stretch goals
        System.out.println("\nStretch Goals");

        System.out.println("\nSnack: " + chips.getName());
        System.out.println("Vending Machine: " + food.getName());
        System.out.println("Quantity: " + chips.getQuantity());
        System.out.println("Total Cost: " + chips.getFormattedTotalCost(chips.getCost()));

        System.out.println("\nSnack: " + choccyBar.getName());
        System.out.println("Vending Machine: " + food.getName());
        System.out.println("Quantity: " + choccyBar.getQuantity());
        System.out.println("Total Cost: " + choccyBar.getFormattedTotalCost(choccyBar.getCost()));

        System.out.println("\nSnack: " + pretzel.getName());
        System.out.println("Vending Machine: " + food.getName());
        System.out.println("Quantity: " + pretzel.getQuantity());
        System.out.println("Total Cost: " + pretzel.getFormattedTotalCost(pretzel.getCost()));

        System.out.println("\nSnack: " + soda.getName());
        System.out.println("Vending Machine: " + drink.getName());
        System.out.println("Quantity: " + soda.getQuantity());
        System.out.println("Total Cost: " + soda.getFormattedTotalCost(soda.getCost()));

        System.out.println("\nSnack: " + water.getName());
        System.out.println("Vending Machine: " + drink.getName());
        System.out.println("Quantity: " + water.getQuantity());
        System.out.println("Total Cost: " + water.getFormattedTotalCost(water.getCost()));
    }
}