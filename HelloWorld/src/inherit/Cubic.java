package inherit;

/**
 * Created by natumsol on 16/6/5.
 */
public class Cubic extends Rectangle {
    protected int z;
    protected int length;

    public Cubic() {
        super();
    }

    public Cubic(int x, int y, int z, int width, int height, int length) {
        super(x, y, width, height);
        this.z = z;
        this.length = length;
    }

    public int getZ() {
        return z;
    }

    public int getLength() {
        return length;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getVolumn(){
        return width * height * length;
    }

    @Override
    public Cubic getCopy() {
        return new Cubic();
    }
}
