package dj.learning.streams.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6, 5, 3, 8, 34, 65);
        System.out.println(findMaxValue(integerList));
        System.out.println(findMinValue(integerList).get());
    }

    public static int  findMaxValue (List<Integer> integerList) {
        return integerList.stream()
                .reduce(Integer.MAX_VALUE, (a,b) -> a<b ? a : b);
    }
    public static Optional<Integer> findMinValue (List<Integer> integerList) {
        return integerList.stream()
                .reduce((a,b) -> a>b ? a : b);
    }

}
