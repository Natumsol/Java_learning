package inherit;

/**
 * Created by LiuJ on 2016/6/6.
 */
public class HollowCircle extends AbstractCircle {
    public HollowCircle(double radius) {
        super(radius);
    }
    public HollowCircle() {
        super(0);
    }

    @Override
    public void render() {
        System.out.printf("画一个半径为%f的空心圆\n", getRadius());
    }
}
