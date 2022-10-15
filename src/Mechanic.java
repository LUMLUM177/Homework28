import java.util.ArrayList;

public class Mechanic<A extends Cars> {

    private String name;
    private String company;


    public Mechanic(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }


    public void performMaintenance(A cars) {
        cars.passVerification();
        System.out.println("Ответственный механик - " + getName() + ".");
    }

    public void repairTheCar(A cars) {
        cars.repairCar();
        System.out.println("Ответственный механик - " + getName() + ".");
    }

    @Override
    public String toString() {
        return name;
    }
}
