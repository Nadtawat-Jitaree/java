import java.util.Scanner;

public class Assign04_6806021610182 {
    Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println(">>>  Program Fibonacci  <<<\n");
        while (true) {
            System.out.print("Enter sequence number : ");
            Integer data = input.nextInt();
            if (data == -1) {
                System.out.println("Exit Program.");
                return;
            }
            System.out.println("Fibonacci sequence " + data + " = " + fibonacci(data));
            System.out.println("");
        }
    }

    public Integer fibonacci(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }

    public static void main(String[] args) {
        Assign04_6806021610182 obj = new Assign04_6806021610182();
        obj.start();
    }
}
