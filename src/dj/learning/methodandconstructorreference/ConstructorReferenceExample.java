package dj.learning.methodandconstructorreference;

import dj.learning.data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {

    static Supplier<Student> supplier = Student::new;

    static Function <String, Student> function = Student::new;
    public static void main(String[] args) {
        Student student = supplier.get();
        System.out.println(student);
        Student student1 = function.apply("Linku");
        System.out.println(student1);
    }
}
