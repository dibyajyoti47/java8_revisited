package dj.learning.imperative_vs_declarative;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample1 {
    public static void main(String[] args) {
        /**
         * Imperative - how style of programming
         */
        int sum = 0; //mutated variable, can be problematic during multithreaded environment.
        for (int i=0; i<=100; i++) { //we are performing all the operations
            sum+=i;
        }
        System.out.println("Sum using Imperative approach : "+ sum);

        /**
         * Declarative - what style of programming
         */
        int sum1 = IntStream.rangeClosed(0, 100) //it splits the values
                .parallel() //can perform on multi threaded environment
                .sum(); //we simply provide input, don't care about the algorithm behind it.
        System.out.println("Sum using Declarative approach : "+ sum1);
    }
}
