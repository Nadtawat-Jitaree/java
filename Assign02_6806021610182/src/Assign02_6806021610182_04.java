
// ID : 6806021610182
// Name : Nadtawat Jitaree
// Room : 1 RA
// File Name : Assign02_6806021610182_04.java

import java.text.DecimalFormat;
import java.util.Scanner;

public class Assign02_6806021610182_04 {
    // เริ่มโปรแกรม
    public static void startProgram() {
        Scanner input = new Scanner(System.in);
        Double number;
        // loop
        while (true) {
            System.out.print("Enter your income(-1 to exit) : ");
            number = input.nextDouble();

            if (number == -1) {
                System.out.println("Exit Program.");
                break;
            }
            checkIncome(number);
        }

        input.close();
    }

    // check rate income
    public static void checkIncome(Double num) {
        // format
        DecimalFormat two = new DecimalFormat("#,###,##0.00");
        Double rate = 0.0;
        Double AmountTax = 0.0;
        // เช็ค rate
        if (num >= 0 && num <= 150000) {
            rate = 0.0;
        } else if (num >= 150001 && num <= 300000) {
            rate = 2.5;
        } else if (num >= 300001 && num <= 500000) {
            rate = 4.0;
        } else if (num >= 500001 && num <= 800000) {
            rate = 5.5;
        } else if (num >= 800001 && num <= 1000000) {
            rate = 7.5;
        } else if (num > 1000000) {
            rate = 10.0;
        }
        // cal
        AmountTax = num * (rate / 100);
        // แสดงผล
        System.out.println("Net Income : " + two.format(num));
        System.out.println("Tax Rate(%) : " + rate + "%");
        System.out.println("Amount Tax : " + two.format(AmountTax) + "\n");
    }

    public static void main(String[] args) {
        startProgram();
    }
}
