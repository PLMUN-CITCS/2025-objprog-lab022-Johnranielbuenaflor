// Car class definition
class Car {
    // Attributes (instance variables)
    String make;
    String model;
    int year;

    // Method to display car details
    public void displayInfo() {
        System.out.println("Car: " + year + " " + make + " " + model);
    }
}

// Main class
public class CarDemo {
    public static void main(String[] args) {
        // Create an object of the Car class
        Car myCar = new Car();

        // Assign values to attributes
        myCar.make = "Toyota";
        myCar.model = "Corolla";
        myCar.year = 2020;

        // Call the displayInfo method to print car details
        myCar.displayInfo();
    }
}
