In Java, understanding the difference between objects and classes is key to grasping how object-oriented programming actually works. A class is like a plan or blueprint. It tells the program what kind of data something should have and what actions it should be able to perform. But the class itself isn’t doing anything—it just defines what an object could look like and how it could behave.

An object, on the other hand, is the real thing built from that class. It holds actual values and can run the methods defined in the class. You can think of it like this: the class describes the idea of a car—every car has a make, model, and year. An object is an actual car, like a 2025 Toyota Camry. You can create multiple objects from one class, and each object can have different data, even though they’re built from the same structure.

A class doesn’t take up memory in your program until you create an object from it. That’s when memory gets used and real data gets stored. So while the class defines structure and behavior, the object is what actually does something and holds real-world values.

Example

See `Main.java` and `Car.java` for example code demonstrating how objects and classes work.

To run the program:

```bash
javac Main.java Car.java
java Main
