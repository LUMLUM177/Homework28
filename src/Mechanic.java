import java.util.ArrayList;

public class Mechanic<A extends Cars> {

    private String name;
    private String company;


    private ArrayList<Mechanic> mechanicsForRacing;

    public Mechanic(String name, String company) {
        this.name = name;
        this.company = company;

        this.mechanicsForRacing = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public ArrayList<Mechanic> getMechanicsForRacing() {
        return mechanicsForRacing;
    }

    public void performMaintenance(A cars) {
        System.out.println("Машина " + cars.getBrand() + " " + cars.getModel() + " прошла техобслуживание. " +
                "Ответственный механик - " + getName() + ".");
    }

    public void repairTheCar(A cars) {
        System.out.println("Машина " + cars.getBrand() + " " + cars.getModel() + " успешно отремонтирована." +
                "Ответственный механик - " + getName() + ".");
    }

    @Override
    public String toString() {
        return name;
    }
}
