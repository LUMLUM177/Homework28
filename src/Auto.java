public class Auto extends Cars implements Competing {

    public Auto(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public void startMoving() {
        System.out.println(this.getBrand() + " " + this.getModel() + " начинает движение.");
    }

    public void finishMoving() {
        System.out.println(this.getBrand() + " " + this.getModel() + " заканчивает движение.");
    }

    public void pitStop() {
        System.out.println(this.getBrand() + " " + this.getModel() + " совершает пит-стоп!");
    }

    @Override
    public double getBestTimeLap() {
        System.out.println(this.getBrand() + " " + this.getModel() + " устанавливает лучшее время круга!");
        return 0;
    }

    @Override
    public double getMaxSpeed() {
        System.out.println(this.getBrand() + " " + this.getModel() + " развивает максимальную скорость!");
        return 0;
    }

    public void passVerification() {
        System.out.print("Машина " + getBrand() + " " + getModel() + " прошла техобслуживание. ");
    }

    public void repairCar() {
        System.out.print("Машина " + getBrand() + " " + getModel() + " успешно отремонтирована. ");
    }


}
