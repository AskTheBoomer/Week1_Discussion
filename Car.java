// This is a class definition.
// A class is a blueprint that defines what attributes and behaviors an object will have.

public class Car {
    // These are attributes (also called fields or properties) of the class.
    // Every object created from this class will have a make and model.
    String make;
    String model;

    // This is a constructor.
    // It's used to create a new Car object and set its make and model.
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // This is a method that belongs to the class.
    // Objects created from this class can use this method.
    public void displayInfo() {
        System.out.println("Car Make: " + make + ", Model: " + model);
    }
}
