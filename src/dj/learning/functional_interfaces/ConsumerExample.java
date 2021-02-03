package dj.learning.functional_interfaces;

import dj.learning.data.Student;
import dj.learning.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    private static Consumer<String>  c1 = (string) -> System.out.println(string);
    private static Consumer<Student> c2 = student -> System.out.println(student);
    private static Consumer<Student> c3 = student -> System.out.print(student.getName());
    private static Consumer<Student> c4 = student -> System.out.println(student.getActivities());

    public static void main(String[] args) {
//        c1.accept("Hello World");
//        printStudents();
//        printNameAndActivities();
        printNameAndActivitiesUsingConditions();
    }

    public static void printStudents() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c2);
    }

    public static void printNameAndActivities () {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c3.andThen(c4));  //consumer chaining
    }

    public static void printNameAndActivitiesUsingConditions () {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if(student.getGradeLevel() >= 3) c3.andThen(c4).accept(student);
        }));
    }
}
