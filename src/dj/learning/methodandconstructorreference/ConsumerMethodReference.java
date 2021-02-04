package dj.learning.methodandconstructorreference;

import dj.learning.data.Student;
import dj.learning.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReference {

    private static Consumer<Student> c1 = System.out :: println;
    private static Consumer<Student> c2 = Student::printListOfActivities;

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(c1);
        StudentDataBase.getAllStudents().forEach(c2);
    }
}
