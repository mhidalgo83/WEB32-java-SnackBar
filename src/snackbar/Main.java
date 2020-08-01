package snackbar;

import java.text.DecimalFormat;

public class Main {

    private static DecimalFormat df = new DecimalFormat("$#,###0.00");

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

        String cashOnHand;

        jane.setSubCash(soda.getTotalCost(3, soda.getCost()));
        soda.setSubSnack(3);
        cashOnHand = df.format(jane.getCashOnHand());
        System.out.println("Customer " + jane.getCustomerId() + " cash on hand is " + cashOnHand);
        System.out.println("Quantity of snack " + soda.getId() + " is " + soda.getQuantity());

        jane.setSubCash(pretzel.getTotalCost(1, pretzel.getCost()));
        pretzel.setSubSnack(1);
        cashOnHand = df.format(jane.getCashOnHand());
        System.out.println();
        System.out.println("Customer " + jane.getCustomerId() + " cash on hand is " + cashOnHand);
        System.out.println("Quantity of snack " + pretzel.getId() + " is " + pretzel.getQuantity());

        bob.setSubCash(soda.getTotalCost(2, soda.getCost()));
        soda.setSubSnack(2);
        cashOnHand = df.format(bob.getCashOnHand());
        System.out.println();
        System.out.println("Customer " + bob.getCustomerId() + " cash on hand is " + cashOnHand);
        System.out.println("Quantity of snack " + soda.getId() + " is " + soda.getQuantity());

        jane.setAddCash(10);
        cashOnHand = df.format(jane.getCashOnHand());
        System.out.println();
        System.out.println("Customer " + jane.getCustomerId() + " cash on hand is " + cashOnHand);

        jane.setSubCash(choccyBar.getTotalCost(1, choccyBar.getCost()));
        choccyBar.setSubSnack(1);
        cashOnHand = df.format(jane.getCashOnHand());
        System.out.println();
        System.out.println("Customer " + jane.getCustomerId() + " cash on hand is " + cashOnHand);
        System.out.println("Quantity of snack " + choccyBar.getId() + " is " + choccyBar.getQuantity());

        pretzel.setAddSnack(12);
        System.out.println();
        System.out.println("Quantity of snack " + pretzel.getId() + " is " + pretzel.getQuantity());

        bob.setSubCash(pretzel.getTotalCost(3, pretzel.getCost()));
        pretzel.setSubSnack(3);
        cashOnHand = df.format(bob.getCashOnHand());
        System.out.println();
        System.out.println("Customer " + bob.getCustomerId() + " cash on hand is " + cashOnHand);
        System.out.println("Quantity of snack " + pretzel.getId() + " is " + pretzel.getQuantity());

    }
}