package queue;

public class Queue {
    private int head;
    private int tail;

    private int[] arr;

    public Queue(int c) {
        this.head = -1;
        this.tail = -1;
        this.arr = new int[c];
    }

    private boolean isEmpty() {
        return this.head == -1 || this.head == arr.length;
    }

    private boolean isFull() {
        return this.tail == this.arr.length - 1;
    }

    public void enqueue(int d) {
        if (this.isFull()) {
            throw new Error("Full");
        }
        if (isEmpty()) {
            this.arr[++this.head] = d;
            ++this.tail;
        }
        this.tail += 1;
        this.arr[this.tail] = d;
    }

    public void dequeue() {
        if (this.isEmpty()) {
            throw new Error("Empty");
        }
        this.head += 1;
    }

    public void printQueue() {
        for (int i = this.head; i <= this.tail; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
