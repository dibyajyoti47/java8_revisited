package dj.learning.streams.parallelstream;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;

public class ParallelStreamBoxedExample {

    public static int sequentialSum (List<Integer> integerList) {
        long start = System.currentTimeMillis();
        int sum = integerList.stream()
                .reduce(0, (x,y) -> x+y);
        long duration = System.currentTimeMillis() - start;
        System.out.println("sequential duration : "+ duration);
        return sum;
    }

    public static int ParallelSum (List<Integer> integerList) {
        long start = System.currentTimeMillis();
        int sum = integerList.parallelStream()
                .reduce(0, (x,y) -> x+y);
        long duration = System.currentTimeMillis() - start;
        System.out.println("parallel duration : "+ duration);
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> integerList = IntStream.rangeClosed(1, 100000)
                .boxed()
                .collect(toList());
        sequentialSum(integerList);
        ParallelSum(integerList);
    }
}
