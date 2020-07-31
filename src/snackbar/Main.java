package snackbar;

public class Main {

    public static void main(String[] args) {
        Customer jane = new Customer("Jane", 45.25 );
        System.out.println("Customer name 1: " + jane.getName());

        Customer bob = new Customer("Bob", 33.14 );
        System.out.println("Customer name 2: " + bob.getName());

    }
}