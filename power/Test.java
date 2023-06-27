package power;

public class Test {
    public static int pow(int x, int n) {
        int res = 1;
        if (n == 0 ) return 1;
        while (n > 1) {
            if (n % 2 == 0) {
                x = x * x;
                n = n / 2;
            } else {
                res = res * x;
                x = x * x;
                n = (n - 1) / 2;
            }
        }
        return res * x;
    }
    public static void main(String[] args) {
        System.out.println(pow(3, 5));
    }
}

// javac -d . power/Test.java; java power/Test
