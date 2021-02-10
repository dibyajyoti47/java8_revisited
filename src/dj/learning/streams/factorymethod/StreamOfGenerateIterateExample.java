package dj.learning.streams.factorymethod;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOfGenerateIterateExample {
    public static void main(String[] args) {
        /*Stream.of("Linku", "Tinku", "Pinku")
                .sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println);
        Stream.iterate(1, x -> x*2)
                .limit(10)
                .forEach(System.out::println);*/
        Supplier<Integer> integerSupplier = new Random()::nextInt;
        Stream.generate(integerSupplier)
                .limit(10)
                .forEach(System.out::println);

    }

}
