public abstract class CarCreator {
    public abstract Car createCar();

    public Car orderCar() {
        Car car = createCar();
        System.out.println("Car ordered: " + car);
        return car;
    }
}
