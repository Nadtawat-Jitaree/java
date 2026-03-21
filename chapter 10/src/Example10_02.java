public class Example10_02 {
    public static void main(String[] args) {
        Circle circle = new Circle(50, 30, 10.2);
        System.out.println("Circle : " + circle);
        System.out.println("Diameter : " + circle.getDiameter());
        System.out.println("Circumference : " + circle.getCircumference());
        System.out.println("Area : " + circle.getArea());
    }
}
