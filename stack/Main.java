package stack;

public class Main {
    public static void main(String[] args) {
        Stack S = new Stack(10);

        S.push(5);
        S.push(6);
        S.push(7);
        S.push(8);

        S.printStack();

        S.pop();

        S.printStack();

        S.push(10);

        S.printStack();
    }
}

// javac -d . stack/Main.java; java stack/Main.java
