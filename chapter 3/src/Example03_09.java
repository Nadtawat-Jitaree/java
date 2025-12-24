import java.util.Scanner;

public class Example03_09 {
    public static void main(String[] args) {
        int number, sum = 0, num = 5;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a positive integers : ");
            number = scanner.nextInt();
            sum = sum + number;
            num = num - 1;
        } while (num > 0);

        System.out.println("Sum value is " + sum);
        scanner.close();
    }
}
