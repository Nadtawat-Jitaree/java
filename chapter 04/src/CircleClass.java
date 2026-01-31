import java.util.Scanner;

public class CircleClass {
    public void mainProgram() {
        Scanner scanner = new Scanner(System.in);
        boolean done = true;
        int radius;
        System.err.println("Program Calculate Area...");
        do {
            System.err.println("Enter radius(-1 : exit) : ");
            radius = scanner.nextInt();
            if (radius != -1) {
                double area = calArea(radius);
                double circum = calCircumference(radius);
                String result = "Radius : " + radius;
                result += "\nArea Circle = " + area;
                result += "\nCircumference = " + circum;
                System.err.println(result);
            }
        } while (done);
        scanner.close();

    }
    public double calArea(double radius){
        double area = Math.PI * Math.pow(radius,2);
        return area;
    }
    public double calCircumference(double radius){
        double circum = 2 * Math.PI * radius;
        return circum;
    }
}
