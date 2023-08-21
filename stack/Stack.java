package stack;

public class Stack {
    private int top;
    private int[] arr;

    public Stack(int c) {
        this.top = -1;
        this.arr = new int[c];
    }

    private boolean isEmpty() {
        return this.top == -1;
    }

    private boolean isFull() {
        return this.top == this.arr.length;
    }

    public void push(int d) {
        if (this.isFull()) {
            throw new Error("Full");
        }
        
        this.top += 1;
        this.arr[this.top] = d;
    }

    public int pop() {
        if (this.isEmpty()) {
            System.out.println("Empty");
        }

        this.top -= 1;

        return this.arr[this.top];
    }

    public void printStack() {
        for (int i = 0; i <= this.top; i += 1) {
            System.out.print(this.arr[i] + " ");
        }

        System.out.println();
    }

    public void printArr() {
        for (int i = 0; i < this.arr.length; i += 1) {
            System.out.print(this.arr[i] + " ");
        }

        System.out.println();
    }
}
