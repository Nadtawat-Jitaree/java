
import java.util.Scanner;

public class ec03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer num, digit1, digit2, digit3, sum;
        System.err.print("Enter integer number : ");
        num = input.nextInt();
        digit1 = num % 10;
        num = num / 10;
        digit2 = num % 10;
        num = num / 10;
        digit3 = num % 10;
        sum = digit1 + digit2 + digit3;
        System.err.println("Summation of diit : " + digit3 + "+" + digit2 + "+" + digit1 + " = " + sum);
    }
}
