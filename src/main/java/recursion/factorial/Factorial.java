package recursion.factorial;

public class Factorial {

    public static void main(String[] args) {

        for (int x = 0; x <= 20; x++) {
            System.out.println("Factorial(" + x + ") = " + factorial(x));
        }
    }

    static long factorial(int x) {
        if (x == 0) {
            return 1;
        } return x * factorial(x - 1);
    }
}