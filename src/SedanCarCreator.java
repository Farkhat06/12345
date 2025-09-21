public class SedanCarCreator extends CarCreator {
    @Override
    public Car createCar() {
        CarFactory factory = new BMWFactory();
        return factory.createCar("3 Series", "Petrol", false);
    }
}
