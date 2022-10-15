import java.util.ArrayList;

public class Sponsor {

    private String name;
    private double amountSupport;

    public Sponsor(String name, double amountSupport) {
        this.name = name;
        this.amountSupport = amountSupport;
    }
    public void sponsorTheRace() {
        System.out.println("Спонсор " + getName() + " спонсирует заезд на сумму " + getAmountSupport() + " рублей.");
    }
    public String getName() {
        return name;
    }

    public double getAmountSupport() {
        return amountSupport;
    }

}
