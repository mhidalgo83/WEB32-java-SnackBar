package snackbar;



public class Customer {
    
    private String name;
    private static int maxId = 0;
    private int id;
    private double cashOnHand;

    public Customer(String name, double cashOnHand) {
        maxId++;
        id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    // GETTERS
    // Gets id of customer
    public int getCustomerId() {
        return id;
    }

    // Gets name of customer
    public String getName() {
        return name;
    }

    // Gets cash on hand
    public double getCashOnHand() {
        return cashOnHand;
    }

    // SETTERS

    // set name of customer
    public void setName(String name) {
        this.name = name;
    }

    // Sets cash on hand after buying snacks
    public void setSubCash(double totalCost) {
        this.cashOnHand = this.cashOnHand - totalCost;
    }

    // sets new cash by adding
    public void setAddCash(double cash) {
        this.cashOnHand = this.cashOnHand + cash;
    }

    @Override
    public String toString() {
        return "Customer: " + name + " with id: " + id;
    }
}