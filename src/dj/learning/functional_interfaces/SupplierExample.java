package dj.learning.functional_interfaces;

import dj.learning.data.Student;

import java.util.Arrays;
import java.util.function.Supplier;

public class SupplierExample {

    static Supplier<Student> studentSupplier = () -> new Student("Adam",2,3.6, "male", Arrays.asList("swimming", "basketball","volleyball"));

    public static void main(String[] args) {
        System.out.println(studentSupplier.get());
    }
}
