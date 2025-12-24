import java.util.Scanner;

public class Ec2_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double principal, interest, deposit, cal;
        System.out.println("Program Calculate Deposit");
        System.out.print("Enter principal : ");
        principal = input.nextDouble();
        System.out.print("Enter interest : ");
        interest = input.nextDouble();

        System.out.println("\nAfter deposit 4 year.");
        System.out.println("Priciple : " + principal);
        System.out.println("Interate rate : " + interest);
        cal = (principal * (interest / 100.0));
        deposit = principal + cal;
        cal = (deposit * (interest / 100.0));
        deposit = deposit + cal;
        cal = (deposit * (interest / 100.0));
        deposit = deposit + cal;
        cal = (deposit * (interest / 100.0));
        deposit = deposit + cal;

        System.out.println("Deposit total : " + deposit);

    }
}
