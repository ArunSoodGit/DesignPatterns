package pl.sood.lamda;

public class Apple {
    private AppleColor color;
    private double weight;

    public Apple(AppleColor color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public AppleColor getColor() {
        return color;
    }

    public void setColor(AppleColor color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color=" + color +
                ", weight=" + weight +
                '}';
    }
}
