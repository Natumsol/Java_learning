package inherit;

/**
 * Created by LiuJ on 2016/6/6.
 */
public class Table implements Cloneable {
    private Point center;

    public Table(Point center) {
        this.center = center;
    }

    public Table() {
        this(new Point());
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public Object clone() throws CloneNotSupportedException {
        Table table = (Table) super.clone();
        if(this.center != null) {
            table.center = (Point) center.clone();
        }

        return table;
    }

    @Override
    public String toString() {
        return "Table: center(" + this.center.getX() + ", " + this.center.getY() + ")";
    }
}
