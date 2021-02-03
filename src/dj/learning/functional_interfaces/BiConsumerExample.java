package dj.learning.functional_interfaces;

import dj.learning.data.Student;
import dj.learning.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    static BiConsumer<String, String> biConsumerStr = (s1, s2) -> System.out.println("name is : "+s1+" "+s2);
    static BiConsumer<Integer, Integer> biConsumerInt1 = (i1, i2) -> System.out.println("addition is : "+(i1+i2));
    static BiConsumer<Integer, Integer> biConsumerInt2 = (i1, i2) -> System.out.println("subtraction is : "+(i1-i2));

    public static void main(String[] args) {
        biConsumerStr.accept("Dibyajyoti", "Behera");
        biConsumerInt1.andThen(biConsumerInt2).accept(15, 12);
        nameAndActivities();
    }

    private static void nameAndActivities() {
        BiConsumer<String, List<String>> bc = (name, activities) -> System.out.println(name + " : "+ activities);
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> bc.accept(student.getName(), student.getActivities()));
    }
}
