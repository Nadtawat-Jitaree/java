import java.util.Scanner;

public class ec04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Float num;
        Integer numInt, dn1, dn2, dn3;

        System.err.print("Enter floating number : ");
        num = input.nextFloat();
        numInt = (int) (num * 1000);
        dn1 = numInt % 10;
        numInt = numInt / 10;
        dn2 = numInt % 10;
        numInt = numInt / 10;
        dn3 = numInt % 10;
        numInt = numInt / 10;
        System.err.println("Decimal number #1 : " + dn3);
        System.err.println("Decimal number #2 : " + dn2);
        System.err.println("Decimal number #3 : " + dn1);
    }
}
