import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Car extends Vehicle implements Serializable {
    private static final long serialVersionUID = 1L;
    String model;
    double price;

    Car(String brand, int wheels, String model, double price) {
        super(brand, wheels);
        this.model = model;
        this.price = price;
    }

    // Custom serialization
    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject(); // Serialize subclass fields
        oos.writeUTF(brand);
        oos.writeInt(wheels);
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject(); // Deserialize subclass fields
        brand = ois.readUTF();
        wheels = ois.readInt();
    }

    @Override
    public String toString() {
        return "Car [brand=" + brand + ", wheels=" + wheels + ", model=" + model + ", price=" + price + "]";
    }
}
