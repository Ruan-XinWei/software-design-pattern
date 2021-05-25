package Decorator;

public class Person extends Function {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println(name);
    }
}
