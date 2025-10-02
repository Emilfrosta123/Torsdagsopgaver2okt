public class Main {
    public static void main(String[] args) {
        // Opretter Customer instanser
        Customer customer1 = new Customer("John", "Doe", "johndoe123");
        Customer customer2 = new Customer("Jane", "Smith", "janesmith456");
        Customer customer3 = new Customer("Bob", "Johnson", "bobjohnson789");

        // Printer customers
        System.out.println(customer1.toString());
        System.out.println(customer2.toString());
        System.out.println(customer3.toString());

        // Viser counter
        System.out.println("Total customers created: " + Customer.getCounter());
    }
}