package Proxy;

public class YellowHuman implements IHuman{
    private String name;

    public YellowHuman(IHuman human,String name){
        this.name = name;
    }


    @Override
    public void getColor() {
        System.out.println("yellow");
    }

    @Override
    public void getCountry() {
        System.out.println("Taiwan");
    }

    @Override
    public void getLanguage() {
        System.out.println("ZH-TW");
    }

    @Override
    public void getName() {
        System.out.println(this.name);
    }
}
