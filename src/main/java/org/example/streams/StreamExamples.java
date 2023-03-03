package org.example.streams;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.*;
import java.util.stream.*;

public class StreamExamples {

    public static void main(String[] args) {

        // data
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,5);
        List<String> names = Arrays.asList("Reflection", "Collection", "Stream", "Java");
        // different classes same lambda
        IntPredicate evenOnly = x -> x % 2 == 0;
        Predicate<Integer> evenOnlyPredicate = x -> x % 2 == 0;

        // intermediate operations
        // map
        /*
        List<Integer> square = numbers
                .stream()                       // stream numbers (line 12)
                .map(x -> x * x)                // monad that squares the number list
                .collect(Collectors.toList());  // collect the squares in a list
        square.forEach(System.out::println); */



        // filter
        /*
        List<String> result = names
                .stream()
                .filter(s -> s.startsWith("S"))
                .collect(Collectors.toList());
        result.forEach(System.out::println); */


        // sorted
        /*
        List<String> result2 = names
                .stream()
                .sorted()
                .collect(Collectors.toList());
        result2.forEach(System.out::println); */


        // terminal operations

        // collect
        /*
        Set<Integer> squared = numbers
                .stream()
                .map(x -> x * x)
                .collect(Collectors.toSet());
        squared.forEach(System.out::println);

         */

        // forEach

        /*
        numbers.stream()
                .map(x -> x * x)
                .forEach(y -> System.out.println(y));
         */

        // reduce
        int sum = 0;
        for(int x = 1; x <= 5; x++) {   // sum up all of the even numbers from 1 to 5 inclusive
            if (x % 2 == 0) {

                sum += x;
            }
        }
        System.out.println(sum);

        int evenSum = numbers
                .stream()
                .filter(evenOnlyPredicate)          // evenOnlyPredicate just does x -> x % 2 == 0. from line 16
                //.limit(5) if the list was bigger than 5
                .reduce(0, (acc, x) -> acc + x);    // acc is the accumulator. functions the same as sum += x in for loop above
                // the 0 is the value the accumulator starts at
                // this returns the accumulator as a part of the .reduce method
                // doesn't know to stop at 5, just streams til it runs out of numbers
        System.out.println(evenSum);


        // int streams
        int totalSum = IntStream.iterate(0, x -> x + 1)
                .skip(5)    // skips the first 5 values
                .limit(5)   // limits to 5 values
                .filter(evenOnly)
                .reduce(2, Integer::sum); // reduce the final answer by 2
        System.out.println(totalSum);

        // random ints
        Random random = new Random();
        random.ints(1,11)
                .limit(50);
                //.forEach(System.out::println);

        // IntStream generate
        final AtomicInteger counter = new AtomicInteger(1);
        IntStream.generate(counter::getAndIncrement)        //shorthand for an x++
                .filter(evenOnly)
                .limit(10)
                .forEach(System.out::println);

        // stream of random strings
        String randomString = Stream.generate(new StringGenerator())
                .limit(16)
                .collect(Collectors.joining());
        System.out.println(randomString);



    }

}
