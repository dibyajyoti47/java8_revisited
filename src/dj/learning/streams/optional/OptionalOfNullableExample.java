package dj.learning.streams.optional;

import java.util.Optional;

public class OptionalOfNullableExample {

    public static void main(String[] args) {
        Optional<String> stringOptional = Optional.ofNullable("Hi Nullable");
        Optional<String> stringOptional1 =  Optional.of("Hi Of");
        Optional<String> stringOptional2 = Optional.empty();
        System.out.println("OfNullable : "+ stringOptional);
        System.out.println("Of : "+ stringOptional1);
        System.out.println("Empty : "+ stringOptional2);
    }
}
