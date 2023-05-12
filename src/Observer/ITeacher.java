package Observer;

import java.util.List;

public interface ITeacher {
    void setStudents(List<IStudent> list);
    void inClass();
    void outClass();
}
