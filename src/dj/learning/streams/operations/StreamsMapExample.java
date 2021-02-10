package dj.learning.streams.operations;

import dj.learning.data.Student;
import dj.learning.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMapExample {
    public static void main(String[] args) {
        namesList().forEach(System.out::println);
        namesSet().forEach(System.out::println);
        namesMap().forEach((s, s2) -> System.out.println(s+" : "+s2));
    }
    public static List<String> namesList() {
        return StudentDataBase.getAllStudents()
                .stream() //stream of students
                .map(Student::getName)  //stream of strings
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
    public static Set<String> namesSet() {
        return StudentDataBase.getAllStudents()
                .stream() //stream of students
                .map(Student::getName)  //stream of strings
                .map(String::toLowerCase)
                .collect(Collectors.toSet());
    }
    public static Map<String, String> namesMap() {
        return StudentDataBase.getAllStudents()
                .stream() //stream of students
                .map(Student::getName)  //stream of strings
                .collect(Collectors.toMap(String::toLowerCase, String::toUpperCase));
    }
}
