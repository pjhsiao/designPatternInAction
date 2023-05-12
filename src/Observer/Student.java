package Observer;

public class Student implements  IStudent{

    private  String name;

    private  Student(){};
    public  Student( String name) {
        this.name = name;
    }


    @Override
    public void openBook() {
        System.out.println(String.format("%s opened book", this.getName()));
    }

    @Override
    public void closeBook() {
        System.out.println(String.format("%s closed book", this.getName()));
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
