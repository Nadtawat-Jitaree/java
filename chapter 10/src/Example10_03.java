public class Example10_03 {
    public static void main(String[] args) {
        Circle2 circle = new Circle2(37, 43, 2.5);
        String output = "X coordinate is " + circle.getX() + "\nY coordinate is " + circle.getY() + "\nRadius is "
                + circle.getRadius();
        circle.setX(35);
        circle.setY(20);
        circle.setRadius(4.25);
        output += "\n\nThe new location and raius of circle are \n";
        output += circle.toString();
        output += "\nDiameter is " + circle.getDiameter();
        output += "\nCircumference is " + circle.getCircumference();
        output += "\nArea is " + circle.getArea();
        System.out.println(output);
    }
}
