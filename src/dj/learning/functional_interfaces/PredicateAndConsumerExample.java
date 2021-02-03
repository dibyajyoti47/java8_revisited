package dj.learning.functional_interfaces;

import dj.learning.data.Student;
import dj.learning.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    Predicate<Student> studentGardePredicate = student -> student.getGradeLevel() >= 3;
    Predicate<Student> studentGpaPredicate = student -> student.getGpa() >= 3.9;
    Consumer<Student> studentConsumer = student -> {
        if(studentGardePredicate.and(studentGpaPredicate).test(student)) System.out.println(student);
    };

    public static void main(String[] args) {
        new PredicateAndConsumerExample().printNameAndActivities();
    }

    public void printNameAndActivities() {
        StudentDataBase.getAllStudents().forEach(studentConsumer);
    }
}
