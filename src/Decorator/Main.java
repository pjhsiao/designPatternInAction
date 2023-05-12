package Decorator;

public class Main {
    public static void main(String[] args) {
        //產生被代理者
        Button button = new LampButton();
        //產生代理者傳入被代理物件
        Decorator decorator1 = new GreenDecorator(button);
        Decorator decorator2 = new RenDecorator(button);

        decorator1.func();
        System.out.println("==============");
        decorator2.func();
    }
}
