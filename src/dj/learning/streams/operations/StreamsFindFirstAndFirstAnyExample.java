package dj.learning.streams.operations;

import dj.learning.data.Student;
import dj.learning.data.StudentDataBase;

import java.util.Optional;

public class StreamsFindFirstAndFirstAnyExample {
    public static void main(String[] args) {
        System.out.println(findAny().get());
        System.out.println(findFirst().get());
    }
    public static Optional<Student> findAny() {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa() >= 3.9)
                .findAny();
    }
    public static Optional<Student> findFirst() {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa() >= 3.9)
                .findFirst();
    }
}
