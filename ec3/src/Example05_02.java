
import java.text.DecimalFormat;

public class Example05_02 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(" Angle\t\tSin\t\tCos\t\ttan");
        for (int n = 1; n <= 60; n++) {
            System.out.print("=");
        }
        System.out.println();
        DecimalFormat sixDigit = new DecimalFormat("0.000000");
        double radians;
        for (double angle = 0.0; angle <= 360; angle += 20.0) {
            radians = Math.toRadians(angle);
            System.out.print(sixDigit.format(angle) + "\t");
            System.out.print(sixDigit.format(Math.sin(radians)) + "\t");
            System.out.print(sixDigit.format(Math.cos(radians)) + "\t");
            System.out.println
            
            
            (sixDigit.format(Math.tan(radians)));
        }
    }
}
