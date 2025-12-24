
import java.text.DecimalFormat;
import java.util.Scanner;

public class Example03_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat twoDigit = new DecimalFormat("0.00");
        final int PER_LINE = 5;
        System.out.print("Enter first number : ");
        int first = input.nextInt();
        System.out.print("Enter secon number : ");
        int second = input.nextInt();
        int sum = 0, count = 0;
        String result = "";
        for (int num = first; num <= second; num++) {
            sum += num;
            result += "\t" + num;
            if (++count % PER_LINE == 0)
                result += "\n";
        }
        result += "\nSummation of " + first + " to " + second + " = " + sum + "\n";
        result += "Average : " + twoDigit.format((float) sum / count);
        System.out.println(result);
    }
}
