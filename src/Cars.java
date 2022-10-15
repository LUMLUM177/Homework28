import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Cars implements Competing {

    private String brand;
    private String model;
    private double engineVolume;

    private final List<Driver<?>> driversForRace = new ArrayList<>();
    private final List<Mechanic<?>> mechanicsForRace = new ArrayList<>();
    private final List<Sponsor> sponsorsForRace = new ArrayList<>();


    public Cars(String brand, String model, double engineVolume) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void addDriver(Driver<?>... drivers) {
      this.driversForRace.addAll(Arrays.asList(drivers));
    }

    public void addMechanic(Mechanic<?>... mechanics) {
        this.mechanicsForRace.addAll(Arrays.asList(mechanics));
    }

    public void addSponsor(Sponsor... sponsors) {
        this.sponsorsForRace.addAll(Arrays.asList(sponsors));
    }

    public void setModel(String model) {
        if (model == null || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
    }

    public List<Driver<?>> getDriversForRace() {
        return driversForRace;
    }

    public List<Mechanic<?>> getMechanicsForRace() {
        return mechanicsForRace;
    }

    public List<Sponsor> getSponsorsForRace() {
        return sponsorsForRace;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public abstract void startMoving();

    public abstract void finishMoving();

    public abstract void passVerification();

    public abstract void repairCar();


    @Override
    public String toString() {
        return "Информация об авто:" +
                " марка " + getBrand() +
                ", модель " + getModel() +
                ", мощность двигателя " + getEngineVolume() +
                " литров.";
    }
}
