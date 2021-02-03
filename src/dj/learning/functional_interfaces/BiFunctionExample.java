package dj.learning.functional_interfaces;

import dj.learning.data.Student;
import dj.learning.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class BiFunctionExample {

    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> studentBiFunction =
            (students, predicate) -> {
        Map<String, Double> studentMap = new HashMap<>();
        students.forEach(student -> {
            if (predicate.test(student)) studentMap.put(student.getName(), student.getGpa());
        });
        return studentMap;
    };
    public static void main(String[] args) {
        System.out.println(studentBiFunction.apply(StudentDataBase.getAllStudents(), student -> student.getGpa() >= 3.9));
    }

}
