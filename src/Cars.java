import java.util.ArrayList;

public abstract class Cars implements Competing{

    private String brand;
    private String model;
    private double engineVolume;

    private ArrayList<Cars> carsForRacing;

    public Cars(String brand, String model, double engineVolume) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);

        this.carsForRacing = new ArrayList<>();
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

    public ArrayList<Cars> getCarsForRacing() {
        return carsForRacing;
    }

    public void setModel(String model) {
        if (model == null || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
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

    @Override
    public String toString() {
        return "Информация об авто:" +
                " марка " + getBrand() +
                ", модель " + getModel() +
                ", мощность двигателя " + getEngineVolume() +
                " литров.";
    }
}
