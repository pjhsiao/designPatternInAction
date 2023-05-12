package Proxy;

public class Main {
    public static void main(String[] args) {

        IHuman human = new HumanProxy(ColorEnum.Yellow, "Jeff");
        human.getName();
        human.getColor();
        human.getLanguage();

        System.out.println("========================================");


        IHuman human1 = new HumanProxy(ColorEnum.White, "Anna");
        human1.getName();
        human1.getColor();
        human1.getLanguage();
    }
}
