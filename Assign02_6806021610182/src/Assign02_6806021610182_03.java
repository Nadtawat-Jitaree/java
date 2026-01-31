
// ID : 6806021610182
// Name : Nadtawat Jitaree
// Room : 1 RA
// File Name : Assign02_6806021610182_03.java

import java.util.Scanner;

public class Assign02_6806021610182_03 {
    // เริ่มโปรแกรม
    public static void startProgram() {
        Scanner input = new Scanner(System.in);
        int number;
        // loop
        while (true) {
            System.out.print("Enter positive number(0-exit) : ");
            number = input.nextInt();
            // เช็ค exit โปรแกรม
            if (number == 0) {
                System.out.println("Exit Program.");
                break;
            }
            // เช็ค prime number
            if (isPrime(number)) {
                System.out.println("Number " + number + " is prime number.");
            } else {
                System.out.println("Number " + number + " is not prime number.");
            }
        }

        input.close();
    }

    // เช็ค prime number
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        startProgram();
    }
}
