package dj.learning.streams.operations;

import dj.learning.data.Student;
import dj.learning.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterExample {
    public static void main(String[] args) {
        filterStudents().forEach(System.out::println);

    }
    public static List<Student> filterStudents () {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGradeLevel() >= 3)
                .collect(Collectors.toList());
    }
}
