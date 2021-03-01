package dj.learning.streams.parallelstream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {
    public static void main(String[] args) {
//        System.out.println(sumSequentialStream());
//        System.out.println(sumParallelStream());
        System.out.println("sequential : " + checkPerformanceResult(ParallelStreamExample::sumSequentialStream, 20));
        System.out.println("parallel :   " + checkPerformanceResult(ParallelStreamExample::sumParallelStream, 20));
    }

    public static long checkPerformanceResult(Supplier<Integer> supplier, int x){
        long startTime = System.currentTimeMillis();
        for (int i=0; i<=x; i++) {
            supplier.get();
        }
        long endTime = System.currentTimeMillis();
        return endTime-startTime;
    }
    public static int sumSequentialStream () {
        return IntStream.rangeClosed(1, 100000000)
                .sum();
    }
    public static int sumParallelStream () {
        return IntStream.rangeClosed(1, 100000000)
                .parallel()
                .sum();
    }
}
