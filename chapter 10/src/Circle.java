public class Circle extends Point {
    protected double radius;

    public Circle() {
    };

    public Circle(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        setRadius(radius);
    }

    public void setRadius(double radius) {
        this.radius = (radius < 0.0 ? 0.0 : radius);
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getCircumference() {
        return Math.PI * getDiameter();
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "Center = [" + this.x + ", " + this.y + "]; Radius = " + getRadius();
    }
}
