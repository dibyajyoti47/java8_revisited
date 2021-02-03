package dj.learning.functional_interfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    static BinaryOperator<Integer> multiply = (a, b) -> a*b;
    public static void main(String[] args) {
        System.out.println(multiply.apply(5, 3));
    }
}
