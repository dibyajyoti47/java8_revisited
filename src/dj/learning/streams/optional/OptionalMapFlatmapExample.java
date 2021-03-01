package dj.learning.streams.optional;

import dj.learning.data.Student;
import dj.learning.data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatmapExample {
    public static void main(String[] args) {
//        optionalFilter();
//        optionalMap();
        optionalFlatmap();
    }
    public static void optionalFilter () {
        Optional<Student> studentOptional =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());
        studentOptional.filter(student -> student.getGpa() >= 3.5)
                .ifPresent(System.out::println);
    }
    public static void optionalMap() {
        Optional<Student> studentOptional =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if (studentOptional.isPresent()) {
            studentOptional
                    .filter(student -> student.getGpa() >= 3.5)
                    .map(Student::getName)
                    .ifPresent(System.out::println);
        }
    }
    public static void optionalFlatmap () {
        Optional<Student> studentOptional =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());
        studentOptional
                .filter(s -> s.getGpa() >= 3.5)
                .flatMap(Student::getBike)
                .ifPresent(System.out::println);

    }
}
