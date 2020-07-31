package snackbar;

public class Snack {
    private int id, maxId, machineId, quantity;
    private String name;
    private double cost;

    public Snack( String name, int quantity, double cost, int machineId) {
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.machineId = machineId;
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

    public int getQuanitity() {
        return quantity;
    }

    public double getTotalCost() {
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

    public void setNewQuantity(int quantity) {
        this.quantity = this.quantity + quantity;
    }

    public void buySnack(int quantity) {
        this.quantity = this.quantity - quantity;
    }

}
