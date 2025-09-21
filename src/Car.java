public class Car {
    private final String brand;
    private final String model;
    private final String engine;
    private final boolean electric;

    public Car(String brand, String model, String engine, boolean electric) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.electric = electric;
    }

    @Override
    public String toString() {
        return brand + " " + model + " | Engine: " + engine + " | Electric: " + (electric ? "Yes" : "No");
    }
}
