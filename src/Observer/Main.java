package Observer;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ITeacher englishTeacher = new Teacher();

        IStudent stud_1 = new Student("Jeff");
        IStudent stud_2 = new Student("Jessica");
        IStudent stud_3 = new Student("Jolie");

        List<IStudent> studentList = List.of(stud_1, stud_2, stud_3);

        englishTeacher.setStudents(studentList);

        englishTeacher.inClass();

        System.out.println("==================== after 60 min ===========================");

        englishTeacher.outClass();
    }
}
