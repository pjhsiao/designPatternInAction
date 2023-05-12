package Proxy;

public class WhiteHuman implements IHuman{

    private String name;

    public WhiteHuman(IHuman human, String name){
        this.name = name;
    }


    @Override
    public void getColor() {
        System.out.println("white");
    }

    @Override
    public void getCountry() {
        System.out.println("USA");
    }

    @Override
    public void getLanguage() {
        System.out.println("ENG");
    }

    @Override
    public void getName() {
        System.out.println(this.name);
    }
}
