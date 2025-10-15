import java.io.*;

// Superclass implementing Serializable
class Vehicle  {
    private static final long serialVersionUID = 1L;
    String brand;
    int wheels;

    Vehicle(String brand, int wheels) {
        this.brand = brand;
        this.wheels = wheels;
    }
}
