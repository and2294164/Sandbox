package recursion.factorialprime;
public class FactorialPrime {

    static boolean isPrime(long n) {

        boolean prime = true;
        if (n == 0 || n == 1) {
            prime = false;
        } else {
            double m = Math.sqrt(n);

            for (int x = 2; x <= m; x++) {
                if (n % x == 0) {
                    prime = false;
                    break;
                }
            }
        }
        return prime;
    }

    static long factorial(int x) {
        if (x == 0) {
            return 1;
        } return x * factorial(x - 1);
    }
}
