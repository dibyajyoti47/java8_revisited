package dj.learning.methodandconstructorreference;

import dj.learning.data.Student;
import dj.learning.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {

    static Predicate<Student> p1 = RefactorMethodReferenceExample::isGreaterThanGradeLevel;

    public static boolean isGreaterThanGradeLevel (Student s) {
        return s.getGradeLevel() >= 3;
    }
    public static void main(String[] args) {
        System.out.println(p1.test(StudentDataBase.studentSupplier.get()));
    }
}
