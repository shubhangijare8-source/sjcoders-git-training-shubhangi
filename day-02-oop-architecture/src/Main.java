import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Customer c1 = new Customer(1, "Shubhangi");
        Customer c2 = new Customer(2, "Priya");

        Service s1 = new Service(101, "Haircut", 500);
        Service s2 = new Service(102, "Facial", 800);

        Booking b1 = new Booking(1001, c1, s1, "CONFIRMED");
        Booking b2 = new Booking(1002, c2, s2, "PENDING");
        Booking b3 = new Booking(1003, c1, s2, "CONFIRMED");

        ArrayList<Booking> bookings = new ArrayList<>();
        bookings.add(b1);
        bookings.add(b2);
        bookings.add(b3);

        HashSet<String> serviceNames = new HashSet<>();
        serviceNames.add("Haircut");
        serviceNames.add("Facial");
        serviceNames.add("Haircut");

        HashMap<Integer, Booking> bookingMap = new HashMap<>();
        bookingMap.put(b1.getBookingId(), b1);
        bookingMap.put(b2.getBookingId(), b2);
        bookingMap.put(b3.getBookingId(), b3);

        System.out.println("All Bookings:");
        for (Booking booking : bookings) {
            booking.displayBooking();
        }

        System.out.println("\nUnique Services:");
        System.out.println(serviceNames);

        System.out.println("\nBooking with ID 1002:");
        bookingMap.get(1002).displayBooking();

        System.out.println("\nPolymorphism:");
        c1.displayRole();
    }
}