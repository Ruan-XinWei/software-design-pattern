package Observer;

public class Member {
    private String name;

    public Member(String name) {
        this.name = name;
    }

    public void Update(Product product) {
        System.out.println(this.name + "收到更新通知: 产品名为 " + product.getName() + " 价格为 " + product.getPrice());
    }
}
