package dj.learning.streams;

import dj.learning.data.Student;
import dj.learning.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class DistinctCountSortStreamExample {
    public static void main(String[] args) {
        printUniqueStudentActivities().forEach(System.out::println);
        System.out.println(getStudentActivitiesCount());
        printUniqueStudentActivitiesSorted().forEach(System.out::println);
    }
    public static List<String> printUniqueStudentActivities () {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());
    }
    public static Long getStudentActivitiesCount () {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count(); //terminal operations
    }
    public static List<String> printUniqueStudentActivitiesSorted () {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}
