package dj.learning.lambdas;

import java.util.function.Consumer;

public class LambdaVariable1 {

    public static void main(String[] args) {
        int i = 0;
//        Consumer <Integer> c1 = (i) -> {  compilation error, because i is already defined line #8
        Consumer <Integer> c1 = (j) -> {
//            int i = 2;   // not allowed - i is defined in the scope already
            System.out.println(j);
        };
    }
}
