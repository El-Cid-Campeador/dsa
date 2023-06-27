package sorting;

public class Sort {
    public static void display(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] insertion(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = current;
        }
        return arr;
    }

    public static int[] selection(int[] arr) {
        int n = arr.length;
        for (int step = 0; step < n; step++) {
            int min = step;
            for (int i = step + 1; i < n; i++) {
                if (arr[min] > arr[i]) {
                    min = i;
                }
            }
            int tmp = arr[min];
            arr[min] = arr[step];
            arr[step] = tmp;
        }
        return arr;
    }

    public static int[] bubble(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {8, 70, -1, 12, 0, 1};
        // insertion(arr);
        // selection(arr);
        bubble(arr);
        display(arr);
    }
}

// javac -d . sorting/Sort.java && java sorting/Sort
