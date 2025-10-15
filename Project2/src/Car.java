
// Subclass inherits serializability

import java.io.Serializable;

class Car extends Vehicle implements Serializable {
    private static final long serialVersionUID = 2L;
    String model;
    double price;

    Car(String brand, int wheels, String model, double price) {
        super(brand, wheels);
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car [brand=" + brand + ", wheels=" + wheels + ", model=" + model + ", price=" + price + "]";
    }
}