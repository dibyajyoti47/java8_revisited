package dj.learning.methodandconstructorreference;

import java.util.function.Function;

public class FunctionMethodReference {

    static Function<String, String> toUppercaseLambda = string -> string.toUpperCase();
    static Function<String, String> toUppercaseMethodReference = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(toUppercaseLambda.apply("dibyajyoti"));
        System.out.println(toUppercaseMethodReference.apply("behera"));
    }
}
