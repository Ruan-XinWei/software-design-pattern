package Adapter;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Circle();
        graph.Draw();
        graph = new Rectangle();
        graph.Draw();
        graph = new Line();
        graph.Draw();
        Angle angle = new Angle();
        graph = new AngleAdapter(angle);
        graph.Draw();
    }
}
