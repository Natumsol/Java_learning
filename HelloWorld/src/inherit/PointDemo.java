package inherit;

/**
 * Created by LiuJ on 2016/6/6.
 */
public class PointDemo {
    // inner class
    private class Point{
        private int x, y;

        public Point() {
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public void setPoint(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    private Point[] points;

    public PointDemo(int length) {
        points = new Point[length];
        for(int i = 0; i < points.length; i ++) {
            points[i] = new Point();
            points[i].setPoint(i * 5, i * 5);
        }
    }

    public void showPoints(){
        for(int i = 0; i < points.length; i ++) {
            System.out.printf("Point[%d]: x = %d, y = %d\n", i, points[i].getX(), points[i].getY());
        }
    }
}
