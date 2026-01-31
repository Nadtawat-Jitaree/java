import java.util.Scanner;

public class Example04_08 {
    public void input() {
        int numInt1, numInt2;
        double numDouble1, numDouble2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter integer number 1 : ");
        numInt1 = scan.nextInt();
        System.out.print("Enter integer number 2 : ");
        numInt2 = scan.nextInt();
        System.out.print("Result integer number = " + Add(numInt1, numInt2));
        System.out.print("Enter floating number 1 : ");
        numDouble1 = scan.nextDouble();
        System.out.print("Enter floating number 2 : ");
        numDouble2 = scan.nextDouble();
        System.out.print("Result floating number = " + Add(numDouble1, numDouble2));
        scan.close();
    }

    public static int Add(int num1, int num2) {
        return (num1 + num2);
    }

    public static double Add(double num1, double num2) {
        return (num1 + num2);
    }

    public static void main(String[] args) {
        Example04_08 obj = new Example04_08();
        obj.input();
    }
}
