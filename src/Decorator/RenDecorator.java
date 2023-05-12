package Decorator;

public class RenDecorator extends Decorator{

   RenDecorator(Button button){
       super(button);
   }

    @Override
    public void func() {
        super.func();
        System.out.println("turn on a 【Red】 light.");
    }
}
