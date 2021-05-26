package Observer;

import java.util.ArrayList;

public class Product {
    private double price;
    private String name;
    private ArrayList<Member> members = new ArrayList<>();

    public Product(String name, double price) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Add(Member member) {
        members.add(member);
    }

    public void Remove(Member member) {
        members.remove(member);
    }

    public void Notify() {
        for (Member member : members) {
            member.Update(this);
        }
    }
}
