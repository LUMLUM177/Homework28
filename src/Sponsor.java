import java.util.ArrayList;

public class Sponsor {

    private String name;
    private double amountSupport;

    private ArrayList<Sponsor> sponsorsForRacing;

    public Sponsor(String name, double amountSupport) {
        this.name = name;
        this.amountSupport = amountSupport;

        this.sponsorsForRacing = new ArrayList<>();
    }

    public void sponsorTheRace() {
        System.out.println("Спонсор " + getName() + " спонсирует заезд на сумму " + getAmountSupport() + " рублей.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmountSupport() {
        return amountSupport;
    }

    public ArrayList<Sponsor> getSponsorsForRacing() {
        return sponsorsForRacing;
    }

    public void setAmountSupport(double amountSupport) {
        this.amountSupport = amountSupport;
    }
}
