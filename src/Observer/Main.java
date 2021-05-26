package Observer;

public class Main {
    public static void main(String[] args) {
        Member member1 = new Member("会员一号");
        Member member2 = new Member("会员二号");

        Orange orange = new Orange("橙子", 15.0);

        orange.Add(member1);
        orange.Add(member2);
        orange.setPrice(12);
        orange.Remove(member1);
        orange.Notify();
    }
}
