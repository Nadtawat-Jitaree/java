
import java.util.Scanner;

public class ec02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double principal, rate, interest, deposit;
        System.err.print("Program Calculate Deposit\nEnter principal : ");
        principal = input.nextDouble();
        System.err.print("Enter interest rate : ");
        rate = input.nextDouble();
        System.err.println("After deposit 4 year.\nPeiciple : " + principal + "\nInterate rate : " + rate);
        interest = (principal * (rate / 100));
        deposit = principal + interest;
        interest = (deposit * (rate / 100));
        deposit = deposit + interest;
        interest = (deposit * (rate / 100));
        deposit = deposit + interest;
        interest = (deposit * (rate / 100));
        deposit = deposit + interest;
        System.err.println("Deposit total : " + deposit);
    }
}
