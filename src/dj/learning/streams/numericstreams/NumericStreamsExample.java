package dj.learning.streams.numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7);
        System.out.println(sumOfNumbers(integerList));
    }

    public static int sumOfNumbers(List<Integer> integerList) {
        return integerList.stream()
                .reduce(0, (x,y) -> x+y);
    }

    public static int sumOfNumbersIntStream () {
        return IntStream.rangeClosed(1, 6).sum();
    }
}
