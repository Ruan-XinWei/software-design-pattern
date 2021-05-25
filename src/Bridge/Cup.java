package Bridge;

public abstract class Cup {
    private Food food = null;

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public abstract void Show();
}
