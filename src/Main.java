import java.util.*;

public class Main {

    private static final List<String> NAMES = List.of(
            "Николай Кулаков",
            "Василий Кулаков",
            "Екатерина Кулакова",
            "Елизавета Кулакова",
            "Анастасия Кулакова",
            "Полина Романчук",
            "Диана Романчук",
            "Елизавета Дробина",
            "Владимир Дробин");

    private static final Random RANDOM = new Random();
    private static final int MAX_SIZE = 5;

    private static void randomFilling(Queue<String> queue) {
        int size = RANDOM.nextInt(MAX_SIZE + 1);
        for (int i = 0; i < size; i++) {
            queue.offer(NAMES.get(RANDOM.nextInt(NAMES.size())));
        }
    }

    private static void add(String name,
                            Queue<String> queue1,
                            Queue<String> queue2) {
        if (queue1.size() == MAX_SIZE && queue2.size() == MAX_SIZE) {
            System.out.println("Нужно позвать Галю!");
            return;
        }
        if (queue1.size() < queue2.size()) {
            queue1.offer(name);
        } else {
            queue2.offer(name);
        }
    }

    private static void remove(Queue<String> queue1,
                               Queue<String> queue2) {
        if (RANDOM.nextBoolean()) {
            queue1.poll();
        } else {
            queue2.poll();
        }
    }

    private static void printInfo(Cars car) {
        System.out.print("Информация об авто, участвующем в заезде:" +
                " марка " + car.getBrand() + ", модель " + car.getModel());
        System.out.print(", водитель - ");
        for (Driver<?> driver : car.getDriversForRace()) {
            System.out.print(driver.getName());
        }
        System.out.print(", спонсоры - ");
        for (Sponsor sponsor : car.getSponsorsForRace()) {
            System.out.print(sponsor.getName() + ", ");
        }
        System.out.print("механик - ");
        for (Mechanic<?> mechanic : car.getMechanicsForRace()) {
            System.out.print(mechanic.getName() + " из компании " + mechanic.getCompany());
        }
        System.out.println(".");
    }

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
        System.out.println();

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

        Sponsor megafon = new Sponsor("Мегафон", 25000.00);
        Sponsor mts = new Sponsor("МТС", 30000.00);
        Sponsor beeline = new Sponsor("Билайн", 20000.00);
        Sponsor tele2 = new Sponsor("TELE2", 33000.00);

        DriverB<Auto> john = new DriverB<>("John", true, 5);
        DriverC<Trucks> philipp = new DriverC<>("Philipp", false, 7);
        DriverD<Bus> elza = new DriverD<>("Elza", true, 10);

        Mechanic<Auto> nikolay = new Mechanic<>("Николай", "Шины и диски");
        Mechanic<Trucks> vasiliy = new Mechanic<>("Василий", "Шины");
        Mechanic<Bus> sergey = new Mechanic<>("Сергей", "Диски");

        audi.addDriver(john);
        audi.addMechanic(nikolay);
        audi.addSponsor(megafon, beeline);

        gazelle.addDriver(philipp);
        gazelle.addMechanic(vasiliy);
        gazelle.addSponsor(mts, tele2);

        cursor.addDriver(elza);
        cursor.addMechanic(sergey);
        cursor.addSponsor(mts, megafon);

        System.out.println();
        List<Cars> carsForRacing = List.of(audi, gazelle, cursor);

        for (Cars car : carsForRacing) {
            printInfo(car);
        }

        System.out.println();
        nikolay.performMaintenance(audi);
        vasiliy.repairTheCar(gazelle);

        System.out.println();
        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addAuto(lada);
        serviceStation.addAuto(hyundai);
        serviceStation.addAuto(ford);
        serviceStation.addTruck(gazelle);
        serviceStation.addTruck(kamaz);
        serviceStation.technicalInspection();



        Queue<String> queue1 = new ArrayDeque<>();
        Queue<String> queue2 = new ArrayDeque<>();
        randomFilling(queue1);
        randomFilling(queue2);
        System.out.println();
        System.out.println("Первая очередь: " + queue1);
        System.out.println("Вторая очередь: " + queue2);
        System.out.println();

        add("Елизавета Цыбулькина", queue1, queue2);
        System.out.println("Первая очередь: " + queue1);
        System.out.println("Вторая очередь: " + queue2);
        System.out.println();

        remove(queue1, queue2);
        System.out.println("Первая очередь: " + queue1);
        System.out.println("Вторая очередь: " + queue2);
        System.out.println();


    }
}