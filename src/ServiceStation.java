import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {

    private Queue<Cars> queue = new LinkedList<>();

    private void addCars(Cars car) {
        queue.offer(car);
    }

    public void addAuto (Auto auto) {
        addCars(auto);
    }

    public void addTruck (Trucks truck) {
        addCars(truck);
    }

    public void technicalInspection() {
        Cars car = queue.poll();
        if (car != null) {
            car.passVerification();
            System.out.println();
            technicalInspection();
        } else {
            System.out.println("В очереди не осталось машин.");
        }
    }
}
