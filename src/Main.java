import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void example() {
        List<List<String>> biDemArrList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                biDemArrList.get(i).add(j, "◯");
                if ((i + j) % 2 != 0) {
                    biDemArrList.get(i).add(j, "●");
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            System.out.println();
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {

        example();

        Auto auto = new Auto("Auto", "default", 0.0);

        Auto audi = new Auto("Audi", "A8", 2.7);
        Auto hyundai = new Auto("Hyundai", "Ferrato", 2.3);
        Auto lada = new Auto("Lada", "Grande", 1.6);
        Auto ford = new Auto("Ford", "Focus", -5.0);

        Trucks kamaz = new Trucks("Камаз", "А 30", 18.0);
        Trucks sable = new Trucks("Соболь", "М 333", 11.0);
        Trucks gazelle = new Trucks("Газель", "Г 3", 9.0);
        Trucks zil = new Trucks("ЗИЛ", "З 100", 17.0);

        Bus lion = new Bus("Lion", "City", 10);
        Bus city = new Bus("СитиРитм", "10", 9);
        Bus cursor = new Bus("ЛиАЗ", "4292", 8);
        Bus mercedez = new Bus("Mercedez-Benz", "Sprinter II", 7);

        Sponsor sponsor = new Sponsor("Default", 15000.00);
        Sponsor megafon = new Sponsor("Мегафон", 25000.00);
        Sponsor mts = new Sponsor("МТС", 30000.00);
        Sponsor beeline = new Sponsor("Билайн", 20000.00);
        Sponsor tele2 = new Sponsor("TELE2", 33000.00);

        DriverB driver = new DriverB("default", false, 0);
        DriverB<Auto> john = new DriverB<>("John", true, 5);
        john.getInTheCar(hyundai);
        DriverC<Trucks> philipp = new DriverC<>("Philipp", false, 7);
        philipp.getInTheCar(gazelle);
        DriverD<Bus> elza = new DriverD<>("Elza", true, 10);
        elza.getInTheCar(mercedez);

        Mechanic mechanic = new Mechanic<>("default", "default");
        Mechanic nikolay = new Mechanic<>("Николай", "Шины и диски");
        Mechanic vasiliy = new Mechanic<>("Василий", "Шины");
        Mechanic sergey = new Mechanic<>("Сергей", "Диски");

        System.out.println();
        auto.getCarsForRacing().add(audi);
        auto.getCarsForRacing().add(hyundai);
        auto.getCarsForRacing().add(lada);
        auto.getCarsForRacing().add(ford);

        auto.getCarsForRacing().add(kamaz);
        auto.getCarsForRacing().add(sable);
        auto.getCarsForRacing().add(gazelle);
        auto.getCarsForRacing().add(zil);

        auto.getCarsForRacing().add(lion);
        auto.getCarsForRacing().add(city);
        auto.getCarsForRacing().add(cursor);
        auto.getCarsForRacing().add(mercedez);

        for (Cars carsForRacing : auto.getCarsForRacing()) {
            System.out.println("Автомобиль " + carsForRacing.getBrand() + " " + carsForRacing.getModel() +
                    " будет участвовать в гонке.");
        }

        System.out.println();
        sponsor.getSponsorsForRacing().add(megafon);
        sponsor.getSponsorsForRacing().add(mts);
        sponsor.getSponsorsForRacing().add(beeline);
        sponsor.getSponsorsForRacing().add(tele2);

        for (Sponsor sponsorsForRacing : sponsor.getSponsorsForRacing()) {
            System.out.println("Спонсор " + sponsorsForRacing.getName() + " спонсирует заезд на сумму " +
                    sponsorsForRacing.getAmountSupport() + " рублей.");
        }

        System.out.println();
        driver.getDriversForRacing().add(john);
        driver.getDriversForRacing().add(philipp);
        driver.getDriversForRacing().add(elza);

        for (int i = 0; i < driver.getDriversForRacing().size(); i++) {
            System.out.println("Водитель " + driver.getDriversForRacing().get(i) + " будет участвовать в заезде.");
        }

        System.out.println();
        mechanic.getMechanicsForRacing().add(nikolay);
        mechanic.getMechanicsForRacing().add(vasiliy);
        mechanic.getMechanicsForRacing().add(sergey);

        for (int i = 0; i < mechanic.getMechanicsForRacing().size(); i++) {
            System.out.println("Механик " + mechanic.getMechanicsForRacing().get(i) + " будет ремонтировать машины.");
        }

        System.out.println();
        nikolay.performMaintenance(audi);
        vasiliy.repairTheCar(hyundai);

        System.out.println();
        ServiceStation<Auto> serviceStationAuto = new ServiceStation();
        ServiceStation<Trucks> serviceStationTrucks = new ServiceStation<>();
        serviceStationAuto.addCars(lada);
        serviceStationAuto.addCars(hyundai);
        serviceStationAuto.addCars(ford);
        serviceStationAuto.technicalInspection();

        System.out.println();
        Supermarket supermarket = new Supermarket();
        supermarket.addMan("Николай");
        supermarket.addMan("Василий");
        supermarket.addMan("Елизавета");
        supermarket.addMan("Анастасия");
        supermarket.addMan("Нина");
        supermarket.addMan("Михаил");
        supermarket.addMan("Надежда");
        supermarket.removeMan("Николай");

        supermarket.manQueueFirst();
        supermarket.manQueueSecond();



    }
}