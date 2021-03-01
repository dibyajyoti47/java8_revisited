package dj.learning.streams.parallelstream;

import dj.learning.data.Student;
import dj.learning.data.StudentDataBase;

import java.util.List;
import static java.util.stream.Collectors.toList;

public class ParallelStreamExample1 {
    public static void main(String[] args) {
        sequentialPrintStudentActivities();
        parallelPrintStudentActivities();
    }

    public static List<String> sequentialPrintStudentActivities () {
        long startTime = System.currentTimeMillis();
        List<String> students = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(toList());
        long endTime = System.currentTimeMillis();
        System.out.println("sequential : "+ (endTime - startTime));
        return students;
    }

    public static List<String> parallelPrintStudentActivities () {
        long startTime = System.currentTimeMillis();
        List<String> students = StudentDataBase.getAllStudents()
                .stream()
                .parallel()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(toList());
        long endTime = System.currentTimeMillis();
        System.out.println("parallel : "+ (endTime - startTime));
        return students;
    }
}
