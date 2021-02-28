package dj.learning.streams.terminaloperations;

import dj.learning.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsCountingExample {
    public static void main(String[] args) {
        System.out.println(count());
    }
    public static long count() {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(s -> s.getGpa() >= 3.9)
                .collect(Collectors.counting());
    }
}
