package dj.learning.streams.operations;

import dj.learning.data.Student;
import dj.learning.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 3, 5);
//        System.out.println(performMultiplication(integers));
        System.out.println(getHighestGpa().get());
    }
    public static int performMultiplication (List<Integer> integerList) {
        return integerList.stream()
                .reduce(1, (a,b)  -> a*b);
    }
    public static Optional<Student> getHighestGpa () {
        return StudentDataBase.getAllStudents()
                .stream()
                .reduce((s1,s2) -> s1.getGpa() > s2.getGpa() ? s1 : s2);
    }
}
