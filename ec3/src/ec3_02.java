import java.text.DecimalFormat;
import java.util.Scanner;

public class ec3_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat noDigits = new DecimalFormat("0");
        DecimalFormat twosDigits = new DecimalFormat("###,##0.00");
        Double principle, rate, year;
        System.err.println("Program Calculate Money");
        System.err.println("+++++++++++++++++++++++++");
        System.err.print("Enter principle : ");
        principle = input.nextDouble();
        System.err.print("Enter interest rate : ");
        rate = input.nextDouble();
        System.err.print("Enter year : ");
        year = input.nextDouble();
        System.err.println("Year   Principle       Interest       Total");
        System.err.println("============================================");
        String text = null;
        Double pp = 0.0, it, totalP = 0.0;
        for (Double x = 1.0; x <= year; x++) {
            if (x == 1.0) {
                pp = principle;
            } else {
                pp = totalP;
            }
            it = (Double) (pp * (rate / 100));
            totalP = pp + it;
            text = "   " + noDigits.format(x) + "     " + twosDigits.format(pp) + "       " + twosDigits.format(it)
                    + "    " + twosDigits.format(totalP);
            System.err.println(text);
        }
        System.err.println("============================================");
        System.err.println("Total deposit : " + twosDigits.format(totalP));
    }
}
