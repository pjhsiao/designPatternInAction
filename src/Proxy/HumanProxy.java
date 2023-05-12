package Proxy;

public class HumanProxy implements IHuman {
    private IHuman human;

    public HumanProxy(ColorEnum colorEnum, String name){
        switch (colorEnum){
            case Yellow:
                this.human = new YellowHuman(this, name);
                break;
            case White:
                this.human = new WhiteHuman(this, name);
                break;
        }



    }

    @Override
    public void getColor() {
        System.out.println("My skin color is :");
        this.human.getColor();
    }

    @Override
    public void getCountry() {
        System.out.println("My country is :");
        this.human.getCountry();
    }

    @Override
    public void getLanguage() {
        System.out.println("My language is :");
        this.human.getLanguage();
    }

    @Override
    public void getName() {
        System.out.println("My name is :");
        this.human.getName();
    }
}
