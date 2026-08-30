public class Customer extends User {

    public Customer(int id, String name) {
        super(id, name);
    }

    @Override
    public void displayRole() {
        System.out.println("I am a Customer");
    }
}