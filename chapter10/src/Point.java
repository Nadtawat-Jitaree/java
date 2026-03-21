public class Point {
    protected int x;
    protected int y;

    public Point() {
    };

    public Point(int x, int y) {
    };

    public void setX(int x) {
        this.x = x;
    };

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
        return "[" + getX() + ", " + getY() + "]";
    }

}
