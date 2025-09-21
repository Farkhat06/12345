public class SUVCarCreator extends CarCreator {
    @Override
    public Car createCar() {
        CarFactory factory = new ToyotaFactory();
        return factory.createCar("RAV4", "Hybrid", false);
    }
}
