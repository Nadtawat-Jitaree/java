
import java.util.Scanner;

public class ec01 {
    public static void main(String[] args) {
        Double celsius, fahrenheit;
        Scanner input = new Scanner(System.in);

        System.err.print("Program change Temperature\nEnter celsius : ");
        celsius = input.nextDouble();
        System.err.println("Temperature celcius : " + celsius);
        fahrenheit = ((9 / 5) * celsius) + 32;
        System.err.println("Temperature fahrenheit : " + fahrenheit);
    }
}