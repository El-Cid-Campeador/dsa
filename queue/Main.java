package queue;

public class Main {
    public static void main(String[] args) {
        Queue Q = new Queue(4);
        Q.enqueue(5);
        Q.enqueue(6);
        Q.enqueue(7);
        Q.enqueue(8);
        Q.enqueue(9);

        Q.printQueue();

        Q.dequeue();
        Q.dequeue();
        Q.dequeue();
        Q.dequeue();
        // Q.dequeue();

        Q.printQueue();
    }
}

// javac -d . queue/Main.java; java queue/Main.java
