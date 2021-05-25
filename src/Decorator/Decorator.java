package Decorator;

public class Decorator extends Function {
    protected Function component;

    public void Decorate(Function component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }
}
