public class Main {
    public static void main(String[] args) {
        CarCreator suvCreator = new SUVCarCreator();
        suvCreator.orderCar();

        CarCreator sedanCreator = new SedanCarCreator();
        sedanCreator.orderCar();
    }
}
