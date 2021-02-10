package dj.learning.streams.operations;

import dj.learning.data.Student;
import dj.learning.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DebugStreamExample {
    public static void main(String[] args) {
        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
                .peek(System.out::println)  //debugging
                .filter(student -> student.getGpa() >= 3.9)
                .peek(System.out::println)  //debugging
                .filter(student -> student.getGradeLevel() >= 3)
                .peek(System.out::println)  //debugging
                .collect(Collectors.toMap(Student::getName, Student::getActivities));  //desired result
    }
}
