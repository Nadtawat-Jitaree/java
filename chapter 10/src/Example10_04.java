public class Example10_04 {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(12, 23, 2.5, 5.7);
        String output = "X coordinate is " + cylinder.getX() + "\nY coordinate is " + cylinder.getY() + "\nRadius is "
                + cylinder.getRadius() + "\nHeight is " + cylinder.getHeight();
        cylinder.setX(35);
        cylinder.setY(20);
        cylinder.setRadius(4.25);
        cylinder.setHeight(10.75);
        output += "\n\nThe new location radius and height of cylinder are \n" + cylinder.toString();
        output += "\n\nDiameter is " + cylinder.getDiameter();
        output += "\nCircumference is " + cylinder.getCircumference();
        output += "\nArea is " + cylinder.getArea();
        output += "\nVolume is " + cylinder.getVolume();
        System.out.println(output);

    }
}
