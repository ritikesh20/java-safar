import java.util.Scanner;
class RoomAvailable {
    private int roomNumber;
    private String roomType;
    private boolean isAvailable;
    private int ratePerNight;
    public RoomAvailable(int roomNumber, String roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isAvailable = true;
        this.ratePerNight = getRatePerNight();
    }
    public int getRatePerNight() {
        switch (roomType.toLowerCase()) {
            case "single":
                return 1000;
            case "double":
                return 1500;
            case "suite":
                return 2000;
            default:
                return 0;
        }
    }
    public boolean assignRoom() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }
    public void displayRoomDetails() {
        System.out.println("\nRoom Details:");
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Room Type: " + roomType);
        System.out.println("Rate per Night: " + ratePerNight);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }
}

class Customer {
    private String name;
    private String contactNumber;
    private String roomType;
    private RoomAvailable roomAssigned;
    private int totalAmount;

    public Customer(String name, String contactNumber, String roomType) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.roomType = roomType;
        this.roomAssigned = null;
        this.totalAmount = 0;
    }
    public boolean assignRoom(RoomAvailable[] availableRooms) {
        for (RoomAvailable room : availableRooms) {
            if (room.getRatePerNight() == 0) {
                System.out.println("Invalid room type. Please choose Single, Double, or Suite.");
                return false;
            }
            if (room.assignRoom()) {
                roomAssigned = room;
                totalAmount = room.getRatePerNight();
                return true;
            }
        }
        return false;
    }
    public void displayCustomerDetails() {
        System.out.println("\nCustomer Details:");
        System.out.println("Name: " + name);
        System.out.println("Contact Number: " + contactNumber);
        if (roomAssigned != null) {
            roomAssigned.displayRoomDetails();
            System.out.println("Total Amount: " + totalAmount);
        } else {
            System.out.println("Room not assigned.");
        }
    }
}
public class HotelBookingSystem {
    public static void main(String[] args) {
        RoomAvailable room1 = new RoomAvailable(101, "Single");
        RoomAvailable room2 = new RoomAvailable(102, "Double");
        RoomAvailable room3 = new RoomAvailable(103, "Suite");
        // Create an instance of the Customer class with user input
        Customer customer = acceptCustomerDetails();
        RoomAvailable[] availableRooms = {room1, room2, room3};
        if (customer.assignRoom(availableRooms)) {
            System.out.println("Room assigned successfully.");
        } else {
            System.out.println("No rooms available for the selected type.");
        }
        customer.displayCustomerDetails();
    }
    private static Customer acceptCustomerDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();

        System.out.print("Enter customer contact number: ");
        String contactNumber = scanner.nextLine();

        System.out.print("Enter room type (Single/Double/Suite): ");
        String roomType = scanner.nextLine();

        return new Customer(name, contactNumber, roomType);
    }
}
