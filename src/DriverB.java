public class DriverB<A extends Auto & Competing> extends Driver<A> {

    public DriverB(String name, boolean driverLicense, int experience) {
        super(name, driverLicense, experience);
    }

    @Override
    public void start(A cars) {
        System.out.print(this.getName() + " на ");
        cars.startMoving();
    }

    @Override
    public void stop(A cars) {
        System.out.print(this.getName() + " на ");
        cars.finishMoving();
    }

    @Override
    public void refill(A cars) {
        System.out.print(this.getName() + " на ");
        cars.pitStop();
    }

    public void getInTheCar(A auto) {
        System.out.println("Водитель " + getName() + " управляет транспортным средством " + auto.getBrand() + " "
                + auto.getModel() + " и будет участвовать в заезде.");
    }
}
