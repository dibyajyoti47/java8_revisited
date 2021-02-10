package dj.learning.streams.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(6,7,8,9,12,41);
        System.out.println(limit(integers).isPresent() ? limit(integers).get() : "null");
        System.out.println(skip(integers).isPresent() ? skip(integers).get() : "null");
    }

    public static Optional<Integer> limit(List<Integer> integers) {
        return integers.stream()
                .limit(2)
                .reduce((a,b) -> a+b);
    }
    public static Optional<Integer> skip(List<Integer> integers) {
        return integers.stream()
                .skip(2)
                .reduce((a,b) -> a+b);
    }
}
