package dj.learning.streams.operations;

import dj.learning.data.Student;
import dj.learning.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa() >= 3.9)  //stream of students
                .filter(student -> student.getGradeLevel() >= 3) //stream of students
                .collect(Collectors.toMap(Student::getName, Student::getActivities));  //desired result
        System.out.println(studentMap);
    }
}
