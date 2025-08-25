//Problem: Generate all primes ≤ N.

public class PrimeSieve {
    static void sieve(int n) {
        boolean[] prime = new boolean[n + 1];
        for (int i = 2; i * i <= n; i++) {
            if (!prime[i]) {
                for (int j = i * i; j <= n; j += i) prime[j] = true;
            }
        }
        for (int i = 2; i <= n; i++) {
            if (!prime[i]) System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int n = 50;
        System.out.print("Primes up to " + n + ": ");
        sieve(n);
    }
}
