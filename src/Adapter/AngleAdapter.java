package Adapter;

public class AngleAdapter implements Graph {
    Angle angle;

    public AngleAdapter(Angle angle) {
        this.angle = angle;
    }

    @Override
    public void Draw() {
        angle.DrawAngle();
    }
}
