package dj.learning.lambdas;

import java.util.function.Consumer;

public class LamdaVariable2 {

    public static int i = 5; //class variable

    public static void main(String[] args) {
        int value = 4;
        //closure
        Consumer<Integer> c1 = i -> {
//            value++;   // Variable used in lambda should be final or effectively final
              i++;       // but in case of class variable (static or non-static) it's fine
        };
    }
}
