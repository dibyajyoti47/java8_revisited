package dj.learning.streams.terminaloperations;

import dj.learning.data.Student;
import dj.learning.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsGroupingByExample {
    public static void main(String[] args) {
//        groupStudentsByGender();
//        customizeGroupStudentsByGender ();
//        twoLevelGrouping();
//        towLevelGrouping2();
        calculateTopGpa();
    }


    public static void groupStudentsByGender () {
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGender));
        System.out.println(studentMap);
    }

    public static void customizeGroupStudentsByGender () {
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(student->student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE"));
        System.out.println(studentMap);
    }

    public static void twoLevelGrouping () {
        Map<String, Map<String, List<Student>>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGender,
                        Collectors.groupingBy(s -> s.getGpa()>=3.8 ? "Great" : "Average")));
        System.out.println(studentMap);
    }
    public static void towLevelGrouping2 () {
        Map<Integer, Integer> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(
                        Student::getGradeLevel,
                        Collectors.summingInt(Student::getNotebooks))
                );
        System.out.println(studentMap);
    }

    public static void calculateTopGpa () {
        Map<Integer, Optional<Student>> studentMapOptional = StudentDataBase.getAllStudents()
                .stream()
                .collect(
                        Collectors.groupingBy(
                                Student::getGradeLevel,
                                Collectors.maxBy(Comparator.comparing(Student::getGpa))
                        )
                );
//        System.out.println(studentMapOptional);
        Map<Integer, Student> studentMapOptional1 = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(
                        Student::getGradeLevel,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparing(Student::getGpa)),
                                Optional::get
                            )
                        )
                );
        System.out.println(studentMapOptional1);
    }
}
