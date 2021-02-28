package dj.learning.streams.terminaloperations;

import dj.learning.data.Student;
import dj.learning.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsJoiningExample {
    public static void main(String[] args) {
        System.out.println(joining_1());
        System.out.println(joining_2());
        System.out.println(joining_3());
    }

    public static String joining_1() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }

    public static String joining_2() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining("_"));
    }
    public static String joining_3() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining("_", "(", ")"));
    }
}
