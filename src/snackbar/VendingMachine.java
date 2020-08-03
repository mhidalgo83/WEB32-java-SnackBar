package snackbar;

public class VendingMachine {
    private String name;
    private static int maxId = 0;
    private int id;

    public VendingMachine(String name) {
        maxId++;
        id = maxId;
        this.name = name;
    }

    // GETTERS
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }


    // SETTERS
    public void setName(String name) {
        this.name = name;
    }
}