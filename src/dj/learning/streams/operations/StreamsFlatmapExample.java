package dj.learning.streams.operations;

import dj.learning.data.Student;
import dj.learning.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatmapExample {
    public static void main(String[] args) {
        printStudentActivities().forEach(System.out::println);
    }

    public static List<String> printStudentActivities () {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }
}
