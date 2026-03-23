public class BookMyStayApp {
    // 1. The Abstract Class (The "Template" for all rooms)
    abstract class Room {
        private String type;
        private int beds;
        private double price;

        public Room(String type, int beds, double price) {
            this.type = type;
            this.beds = beds;
            this.price = price;
        }

        public void displayDetails() {
            System.out.println("Room Type: " + type + " | Beds: " + beds + " | Price: " + price);
        }
    }

    // 2. Inheritance: Concrete classes extending the Abstract class
    class SingleRoom extends Room {
        public SingleRoom() {
            super("Single Room", 1, 100.0);
        }
    }

    class DoubleRoom extends Room {
        public DoubleRoom() {
            super("Double Room", 2, 180.0);
        }
    }

    class SuiteRoom extends Room {
        public SuiteRoom() {
            super("Suite Room", 3, 350.0);
        }
    }

    // 3. Your Main Application Class
    public class BookMyStayApp {
        public static void main(String[] args) {
            System.out.println("--- Welcome to BookMyStayApp ---");

            // Static Availability (Simple variables as per UC2 requirements)
            int singleAvailable = 5;
            int doubleAvailable = 3;
            int suiteAvailable = 0;

            // Polymorphism: Using the Room type to hold different objects
            Room r1 = new SingleRoom();
            Room r2 = new DoubleRoom();
            Room r3 = new SuiteRoom();

            // Displaying results
            r1.displayDetails();
            System.out.println("Availability: " + singleAvailable);
            System.out.println("--------------------------------");

            r2.displayDetails();
            System.out.println("Availability: " + doubleAvailable);
            System.out.println("--------------------------------");

            r3.displayDetails();
            System.out.println("Availability: " + suiteAvailable);
            System.out.println("--------------------------------");
        }
    }
}
