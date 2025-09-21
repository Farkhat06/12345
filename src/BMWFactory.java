public class BMWFactory implements CarFactory {
    @Override
    public Car createCar(String model, String engine, boolean electric) {
        return new Car("BMW", model, engine, electric);
    }
}
