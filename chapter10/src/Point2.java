public class Point2 {

    private int x;
    private int y;

    public Point2() {
    };

    public Point2(int x, int y) {
        setX(x);
        setY(y);
    };

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public String toString() {
        return "[" + getX() + " , " + getY() + "]";
    }
}