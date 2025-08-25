//problem 4. Fibonacci Sequence (Dynamic Programming)

public class FibonacciDP {
    public static void fibonacci(int n) {
        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        for (int num : fib) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.print("Fibonacci sequence: ");
        fibonacci(n);
    }
}
