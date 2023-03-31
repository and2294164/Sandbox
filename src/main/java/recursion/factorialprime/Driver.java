package recursion.factorialprime;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver extends FactorialPrime{

    public static void main(String[] args) {

        List<Long> minus = new ArrayList<>();
        List<Long> plus = new ArrayList<>();

        // subtraction
        for (int x = 0; x < 20; x++) {

            long fact = factorial(x);
            if (isPrime(fact - 1)) {
                minus.add(fact - 1);
                //System.out.println(x + "!" + "-1 is prime [" + (fact - 1) + "]");
            }
        }
        System.out.println();
        // addition
        for (int x = 0; x < 20; x++) {

            long fact = factorial(x);
            if (isPrime(fact + 1)) {
                plus.add(fact + 1);
                //System.out.println(x + "!" +  "+1 is prime [" + (fact + 1) + "]");
            }
        }

        List<Long> factorials = Stream.of(minus, plus)
                .flatMap(Collection::stream)
                .sorted()
                .distinct()
                .collect(Collectors.toList());
        factorials.forEach(System.out::println);

    }

}
