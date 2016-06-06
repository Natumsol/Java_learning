package inherit;

/**
 * Created by LiuJ on 2016/6/6.
 */
public class ConcreteCircle extends AbstractCircle {

    public ConcreteCircle() {
        this(0.0);
    }

    public ConcreteCircle(double radiux) {
        super(radiux);
    }

    public void render(){
        System.out.printf("画一个半径为%f的实心圆\n", getRadius());
    }
}
