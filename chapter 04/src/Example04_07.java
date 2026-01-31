
import java.util.Scanner;

public class Example04_07 {
    public long factorial(long n) {
        if (n > 1)
            return (n * factorial(n - 1));
        else
            return (1);
    }

    public static long factorialStatic(long n) {
        long fac = 1;
        if (n > 0) {
            for (int x = 1; x <= n; x++) {
                fac *= x;
            }
            return fac;
        } else
            return fac;
    }

    public void test() {
        long n;
        Scanner scan = new Scanner(System.in);
        Example04_07 obj = new Example04_07();
        System.out.print("Enter number :");
        n = scan.nextInt();
        System.out.println("Factorial of " + n + " is " + obj.factorial(n));
        System.out.println("FactorialStatic of " + n + " is " + obj.factorialStatic(n));
        System.out.println(Example04_07.factorialStatic(n));
        scan.close();

    }

    public static void main(String[] args) {
        new Example04_07().test();
    }
}
