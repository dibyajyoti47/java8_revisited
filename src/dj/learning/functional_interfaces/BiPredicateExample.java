package dj.learning.functional_interfaces;

import dj.learning.data.Student;
import dj.learning.data.StudentDataBase;

import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateExample {

    static List<Student> studentList = StudentDataBase.getAllStudents();
    static BiPredicate<Integer, Double> bp = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;

    public static void main(String[] args) {
        filterStudentsWithGpaAndGrade();
    }

    public static void filterStudentsWithGpaAndGrade () {
        studentList.forEach(student -> {
           if (bp.test(student.getGradeLevel(), student.getGpa())) System.out.println(student);
        });
    }
}
