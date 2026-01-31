import java.util.Scanner;

public class Assign02_6806021610182_01 {
    public static void inputNum() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.err.print("Enter integer number(4 digit , 0-exit) : ");
            DataClass data = new DataClass();
            data.num = input.nextInt();

            if (data.num == 0) {
                System.err.println("Exit Program");
                break;
            }

            if (data.num < 1000 || data.num > 9999) {
                System.err.println("Input error not in range, please input again?");
            }

            digitCheck(data);

        }
        input.close();
    }

    public static void digitCheck(DataClass data) {
        int temp = data.num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;

            if (digit % 2 == 0) {
                System.out.println(digit + " is Even");
            } else {
                System.out.println(digit + " is Odd");
            }

            temp /= 10;
        }

        System.out.println("Total number : " + sum);

        if (data.num % 2 == 0) {
            System.out.println("Number " + data.num + " is Even.\n");
        } else {
            System.out.println("Number " + data.num + " is Odd.\n");
        }
    }

    static class DataClass {
        int num;
    }

    public static void main(String[] args) {
        inputNum();
    }
}