// ID : 6806021610182
// Name : Nadtawat Jitaree
// Room : 1 RA
// File Name : Assign02_6806021610182_01.java

import java.util.Scanner;

public class Assign02_6806021610182_01 {
    // เริ่มโปรแกรม
    public static void startProgram() {
        Scanner input = new Scanner(System.in);
        // loop
        while (true) {
            System.err.print("Enter integer number(4 digit , 0-exit) : ");
            DataClass data = new DataClass();
            // รับข้อมูล int
            data.num = input.nextInt();
            // check exit program
            if (data.num == 0) {
                System.err.println("Exit Program");
                break;
            }
            // check จำนวนเข้า 4 ตำแหน่ง
            if (data.num < 1000 || data.num > 9999) {
                System.err.println("Input error not in range, please input again?");
            } else {
                digitCheck(data);
            }

        }
        input.close();
    }

    // เช็คเลขคู่เลขคี่
    public static void digitCheck(DataClass data) {
        int temp = data.num;
        int sum = 0;
        // loop จน temp หมด
        while (temp > 0) {
            // ดึงเลขจากขวาสุด
            int digit = temp % 10;
            sum += digit;
            // เช็คเป็นเลขคู่รึป่าวถ้าไม่ก็แสดงบอกเป็น Odd
            if (digit % 2 == 0) {
                System.out.println(digit + " is Even");
            } else {
                System.out.println(digit + " is Odd");
            }
            // ตัดเลขออกจากขวาสุด
            temp /= 10;
        }

        System.out.println("Total number : " + sum);
        // ประกาศว่าเป็นเลข Even หรือ Odd
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
        startProgram();
    }
}