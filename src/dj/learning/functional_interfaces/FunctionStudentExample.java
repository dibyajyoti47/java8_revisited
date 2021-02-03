package dj.learning.functional_interfaces;

import dj.learning.data.Student;
import dj.learning.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {

    static Function <List<Student>, Map<String, Double>> studentFunction = students -> {
        Map<String, Double> studentMap = new HashMap<>();
        students.forEach(student -> {
            studentMap.put(student.getName(),student.getGpa());
        });
        return studentMap;
    };
    public static void main(String[] args) {
        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
    }
}
