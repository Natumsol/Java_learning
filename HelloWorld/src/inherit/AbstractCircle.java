package inherit;

/**
 * Created by LiuJ on 2016/6/6.
 */
public abstract class AbstractCircle {
    protected double radius;

    public double getRadius() {
        return radius;
    }

    public AbstractCircle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public abstract void render();
}
