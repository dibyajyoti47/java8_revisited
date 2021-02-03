package dj.learning.functional_interfaces;

import dj.learning.data.Student;
import dj.learning.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    private static Predicate<Student> gradeLevel = student -> student.getGradeLevel() >= 3;
    private static Predicate<Student> gpaLevel = student -> student.getGpa() >= 3.9;

    private static List<Student> studentList = StudentDataBase.getAllStudents();

    public static void main(String[] args) {
        filterStudentsByGardeLevel();
        System.out.println("***********");
        filterStudentsByGpaLevel();
        System.out.println("***********");
        filterStudents(gradeLevel, gpaLevel);
    }

    public static void filterStudentsByGardeLevel () {
        studentList.forEach(student -> {
            if (gradeLevel.test(student)) System.out.println(student);
        });
    }
    public static void filterStudentsByGpaLevel () {
        studentList.forEach(student -> {
            if (gpaLevel.test(student)) System.out.println(student);
        });
    }
    public static void filterStudents (Predicate p1, Predicate p2) {
        studentList.forEach(student -> {
            if (p1.negate().or(p2).test(student)) System.out.println(student);
        });
    }
}
