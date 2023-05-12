package Decorator;

public abstract class Decorator extends Button{
    private Button button;

    Decorator(Button button){
        this.button = button;
    }

    @Override
    public void func() {
        button.func();
    }
}
