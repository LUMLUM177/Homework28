import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation<T extends Cars> {

    private Queue<T> queue = new LinkedList<>();

    public void addCars(T car) {
        queue.offer(car);
    }

    public void technicalInspection() {
        T car = queue.poll();
        if (car != null) {
            System.out.println("Авто " + car.getBrand() + " " + car.getModel() + " успешно прошла техосмотр.");
            technicalInspection();
        } else {
            System.out.println("В очереди не осталось авто.");
        }
    }
}
