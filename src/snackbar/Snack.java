package snackbar;



public class Snack {
    
    private static int maxId = 0;
    private int id, machineId, quantity;
    private String name;
    private double cost;

    public Snack(String name, int quantity, double cost) {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
    }

    // GETTERS
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public int getMachineId() {
        return machineId;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalCost(int quantity, double cost) {
        return quantity * cost;
    }

    // SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }

    public void setAddSnack(int added) {
        this.quantity = this.quantity + added;
    }

    public void setSubSnack(int bought) {
        this.quantity = this.quantity - bought;
    }

}
