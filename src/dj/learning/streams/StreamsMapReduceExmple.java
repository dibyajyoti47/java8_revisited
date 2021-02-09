package dj.learning.streams;

import dj.learning.data.Student;
import dj.learning.data.StudentDataBase;

public class StreamsMapReduceExmple {
    public static void main(String[] args) {
        System.out.println(noOfNoteBooks());
    }

    private static int noOfNoteBooks () {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGradeLevel() >=3 )
                .filter(student -> student.getGender().equals("female"))
                .map(Student::getNotebooks)
                .reduce(0, (a, b) -> a+b);
    }
}
