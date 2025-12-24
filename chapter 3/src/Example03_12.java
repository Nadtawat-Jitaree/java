import java.text.DecimalFormat;
import java.util.Scanner;

public class Example03_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat fourDigit = new DecimalFormat("0.0000");
        boolean done = true;
        String strMenu = "   Main Menu\n===============\n";
        strMenu += "1. Area Rectangle\n2. Area Circle\n3. Exit\nEnter Choice : ";
        do {
            System.out.print(strMenu);
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.print("Enter width : ");
                float width = scanner.nextFloat();
                System.out.print("Enter height : ");
                float height = scanner.nextFloat();
                float area = width * height;
                System.out.print("Area of Rectangle = ");
                System.err.println(fourDigit.format(area));
            } else if (choice == 2) {
                System.err.print("Enter radius : ");
                float radius = scanner.nextFloat();
                float area = (float) (Math.PI * radius * radius);
                System.err.print("Area of Circle = ");
                System.out.println(fourDigit.format(area));
            } else if (choice == 3) {
                done = false;
            } else {
                System.err.println("This choices is incorrect, ");
                System.err.println("try again.");
            }
        } while (done);
        System.err.println("Exit Program, Bye.");
        scanner.close();
    }
}
