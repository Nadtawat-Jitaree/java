
// ID : 6806021610182
// Name : Nadtawat Jitaree
// Room : 1 RA
// File Name : Assign02_6806021610182_02.java

import java.util.Scanner;

public class Assign02_6806021610182_02 {
    // เริ่มโปรแกรม
    public static void startProgram() {
        Scanner input = new Scanner(System.in);
        System.err.print("Enter integer number : ");
        DataClass data = new DataClass();
        // รับค่า
        data.num = input.nextLong();
        // เรียกใช้ method โดยส่ง parameter ไป
        digitCheck(data);
        input.close();
    }

    // เช็คเลข
    public static void digitCheck(DataClass data) {
        Long temp = data.num;
        Long totalEven = 0L, totalOdd = 0L, totalZero = 0L;
        // loop
        while (temp > 0) {
            Long digit = temp % 10;
            if (digit == 0) {
                totalZero += 1;
            } else if (digit % 2 == 0) {
                totalEven += 1;
            } else {
                totalOdd += 1;
            }

            temp /= 10;
        }
        // แสดงผล
        System.out.println("Even number : " + totalEven);
        System.out.println("Odd number : " + totalOdd);
        System.out.println("Zero number : " + totalZero + "\n");
        // เรียกใช้อีกรอบ
        startProgram();

    }

    static class DataClass {
        Long num;
    }

    public static void main(String[] args) {
        startProgram();
    }
}
