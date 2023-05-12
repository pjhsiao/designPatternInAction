package Decorator;

public class GreenDecorator extends Decorator{

   GreenDecorator(Button button){
       super(button);
   }

    @Override
    public void func() {
        super.func();
        System.out.println("turn on a 【Green】 light.");
    }
}
