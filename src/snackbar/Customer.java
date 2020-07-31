package snackbar;

public class Customer {
    private String name;
    private int id;
    private int maxId;
    private double cashOnHand;

    public Customer(String name, double cashOnHand) {
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    // GETTERS
    // Gets id of customer
    public int customerId() {
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
    public void buySnacks(double cost) {
        this.cashOnHand = this.cashOnHand - cost;
    }

    // sets new cash by adding
    public void addCash(double cash) {
        this.cashOnHand = this.cashOnHand + cash;
    }
}