package dj.learning.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        /**
         * prior to java 8
         */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("old way : " + comparator.compare(4, 9));

        /**
         * lambda way
         */
        Comparator<Integer> comparatorLambda = (o1, o2) -> o1.compareTo(o2);
        System.out.println("lambda way : " + comparatorLambda.compare(9, 9));
    }


}
