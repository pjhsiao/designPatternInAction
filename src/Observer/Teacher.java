package Observer;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements ITeacher{

    private List<IStudent> studentList = new ArrayList<>();

    @Override
    public void setStudents(List<IStudent> list) {
        studentList.addAll(list);
    }

    @Override
    public void inClass() {
        System.out.println("Teacher said: open book");
        studentList.forEach( stud -> {
            stud.openBook();
        });
    }

    @Override
    public void outClass() {
        System.out.println("Teacher said: close book");
        studentList.forEach( stud -> {
            stud.closeBook();
        });
    }


}
