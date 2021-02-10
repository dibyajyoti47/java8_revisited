package dj.learning.streams.operations;

import dj.learning.data.StudentDataBase;

public class StreamsMatchExample {
    public static void main(String[] args) {
        System.out.println(allMatch());
        System.out.println(anyMatch());
    }
    public static boolean allMatch() {
        return StudentDataBase.getAllStudents()
                .stream()
                .allMatch(student -> student.getGpa() >= 2.9);
    }
    public static boolean anyMatch() {
        return StudentDataBase.getAllStudents()
                .stream()
                .anyMatch(student -> student.getGpa() >= 9.0);
    }
}
