import java.util.Scanner;

public class Ec2_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double C;
        System.out.println("Program change Temperature ");
        System.out.print("Enter celsius : ");
        C = input.nextDouble();
        System.out.println("Temperature celcius : " + C);
        // System.out.println("Temperature fahrenheit : " + (((9/5) * C) + 32));
        System.out.println("Temperature fahrenheit : " + (((1.8) * C) + 32));
        input.close();
    }
}
