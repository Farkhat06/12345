public class ToyotaFactory implements CarFactory {
    @Override
    public Car createCar(String model, String engine, boolean electric) {
        return new Car("Toyota", model, engine, electric);
    }
}
