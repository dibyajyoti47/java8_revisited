package dj.learning.functional_interfaces;

import java.util.function.Function;

public class FunctionExample {

    static Function<String, Integer> getLengthOfString = name -> name.length();
    static Function<Integer, String> addSomeString = length -> "The length is : ".concat(""+length);

    public static void main(String[] args) {
        System.out.println(getLengthOfString.apply("Dibyajyoti"));
        System.out.println(getLengthOfString.andThen(addSomeString).apply("Behera"));
        System.out.println(getLengthOfString.compose(addSomeString).apply(123)); //opposite of andThen
    }
}
