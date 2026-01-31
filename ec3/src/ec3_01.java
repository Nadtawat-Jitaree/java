import java.util.Scanner;

public class ec3_01 {
    public static void main(String[] args) {
            System.err.print(">> Program Calculate Commission <<");
        while (true) {
            Scanner input = new Scanner(System.in);
            Double sale, rate = 0.0, commission;

            System.err.print("\nEnter sale amount : ");
            sale = input.nextDouble();
            if (sale == 0) {
                System.err.println("Error Sale amount, no calcculate commision.");
                break;
            }
            if (sale > 0.0 && sale < 10000.0) {
                rate = 0.0;
            } else if (sale > 10001.0 && sale < 20000.0) {
                rate = 1.5;
            } else if (sale > 20001.0 && sale < 40000.0) {
                rate = 2.75;
            } else if (sale > 40001.0 && sale < 60000.0) {
                rate = 5.0;
            } else if (sale > 60001.0 && sale < 80000.0) {
                rate = 7.0;
            } else if (sale > 80001.0 && sale < 100000.0) {
                rate = 9.0;
            } else if (sale >= 100000.0) {
                rate = 10.0;
            }

            commission = (Double) (sale * (rate / 100));
            System.err.println("\nYour total sale : " + sale + "\nYou got commission rate = " + rate + "%"
                    + "\nYou got commission : " + commission);
        }

    }
}