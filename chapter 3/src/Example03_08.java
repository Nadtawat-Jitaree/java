import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Example03_08 {
    public static void main(String[] args) {
        final double RATE = 0.045;
        Scanner scanner = new Scanner(System.in);
        DecimalFormat twoDigit = new DecimalFormat("###,##0.00");
        NumberFormat fmt = NumberFormat.getPercentInstance();
        fmt.setMinimumFractionDigits(2);
        System.out.println("Program Calculate Deposit : ");
        System.out.print("Enter princical : ");
        double princical = scanner.nextDouble();
        double amount = princical, interest;
        for (int year = 1; year <= 5; year++) {
            interest = amount * RATE;
            amount = amount + interest;
        }

        System.out.print("Princical = ");
        System.out.println(twoDigit.format(princical));
        System.out.println("Interest rate = " + fmt.format(RATE));
        System.out.println("Year = 5");
        System.out.print("Amount of deposit = ");
        System.out.println(twoDigit.format(amount));
        scanner.close();
    }

}
