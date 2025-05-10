// This is the Main class where the program starts running.

public class Main {
    // The main method is the entry point of any Java application.
    public static void main(String[] args) {
        // Here we are creating two objects (instances) of the Car class.
        // Each object represents a specific car with its own make and model.

        Car car1 = new Car("Toyota", "Camry");  // Object 1
        Car car2 = new Car("Honda", "Civic");   // Object 2

        // We're using the objects to call the displayInfo method.
        // This shows how objects can use the structure defined in the class.

        car1.displayInfo();
        car2.displayInfo();
    }
}
