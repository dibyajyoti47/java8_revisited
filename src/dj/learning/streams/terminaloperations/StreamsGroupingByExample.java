package dj.learning.streams.terminaloperations;

import dj.learning.data.Student;
import dj.learning.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsGroupingByExample {
    public static void main(String[] args) {
//        groupStudentsByGender();
//        customizeGroupStudentsByGender ();
//        twoLevelGrouping();
        towLevelGrouping2();
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
}
