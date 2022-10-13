import java.util.LinkedList;
import java.util.Queue;

public class Supermarket<T extends String> {

    private Queue<T> queueFirst = new LinkedList<>();
    private Queue<T> queueSecond = new LinkedList<>();

    public void addMan(T man) {
        if (queueFirst.size() <= queueSecond.size()) {
            queueFirst.offer(man);
        } else {
            queueSecond.offer(man);
        }
    }

    public void manQueueFirst() {
        T man = queueFirst.poll();
        if (man != null) {
            System.out.println("Человек " + man + " стоит в первой очереди.");
            manQueueFirst();
        } else {
            System.out.println("В очереди не осталось людей.");
        }
    }

    public void manQueueSecond() {
        T man = queueSecond.poll();
        if (man != null) {
            System.out.println("Человек " + man + " стоит во второй очереди.");
            manQueueSecond();
        } else {
            System.out.println("В очереди не осталось людей.");
        }
    }

    public void removeMan(T man) {
        queueFirst.remove(man);
    }
}

