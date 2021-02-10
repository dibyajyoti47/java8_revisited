package dj.learning.streams.operations;

import dj.learning.data.Student;
import dj.learning.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {

    public static void main(String[] args) {
        sortStudentsByName().forEach(System.out::println);
        System.out.println("--------------");
        sortStudentsByGpa().forEach(System.out::println);
        System.out.println("--------------");
        sortStudentsByGpaDesc().forEach(System.out::println);
    }

    public static List<Student> sortStudentsByName() {
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }
    public static List<Student> sortStudentsByGpa() {
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
    }
    public static List<Student> sortStudentsByGpaDesc() {
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }
}
