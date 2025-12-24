import java.util.Scanner;

public class Ec2_03 {
    public static void main(String[] args) {
        int data = 123, sum;
        Scanner input = new Scanner(System.in);
        // System.out.print("Enter integer number : ");
        // data = input.nextInt();
        System.out.print("Summation of digit : " + data / 100 + "+" + (data / 10) % 10 + "+" + data % 10 + " = ");
    }
}
