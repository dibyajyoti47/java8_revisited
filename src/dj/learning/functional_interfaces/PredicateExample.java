package dj.learning.functional_interfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> isEven = input -> input % 2 == 0;
    static Predicate<Integer> isDivisibleBy = input -> input % 5 == 0;

    public static void main(String[] args) {
//        simplePredicate();
//        predicateAnd();
//        predicateOr();
        predicateNegate();
    }


    public static void simplePredicate() {
        System.out.println(isEven.test(15));
    }
    public static void predicateAnd () {
        System.out.println(isEven.and(isDivisibleBy).test(20));
    }
    public static void predicateOr () {
        System.out.println(isEven.or(isDivisibleBy).test(6));
    }
    public static void predicateNegate () {
        System.out.println(isEven.negate().test(20));
    }

}
