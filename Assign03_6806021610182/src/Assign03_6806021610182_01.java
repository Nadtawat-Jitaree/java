/* Id : 6806021610182
 * Name : Nadtawat Jitaree
 * Room : 1 RA
 * File Name : Assign03_6806021610182_01.java
*/

import java.util.Scanner;

public class Assign03_6806021610182_01 {
    // ประกาศตัวแปรเริ่มต้น
    Long num = 0L;
    Integer count = 0;
    Long sum = 0L;

    Scanner input = new Scanner(System.in);

    // รับค่า integer เป็น type Long
    public void getNumber() {
        num = 0L;
        System.out.print("Enter long number : ");
        num = input.nextLong();
    }

    // คำนวณตัวเลขทั้งหมด
    public void sumDigit() {
        System.out.println("Your enter number : " + num);
        Long digit = 0L, tem = 0L;
        digit = num;
        // loop เอาตัวเลขบวกกันทีละตัวโดยใช้ % 10
        while (digit > 0) {
            tem = digit % 10;
            // ใช้ sum เก็บผลลัพธ์แต่ละครั้งในการ loop ไว้
            sum += tem;
            // ตัดเอาเลขหนึ่งหลักที่ดึงมาออก
            digit = digit / 10;
        }
        // แสดงผลผลลัพธ์
        System.out.println("Summation of digit : " + sum);
    }

    // คำนวณ
    public void countDigit() {
        Long digit = 0L;
        digit = num;
        while (digit > 0) {
            // นับจำนวน loop ว่า loop กี่ครั้งแทนจำนวนตัวเลขกี่ตัว
            count += 1;
            // ตัดเอาเลขหนึ่งหลักที่ดึงมาออก
            digit = digit / 10;
        }
        // แสดงผล
        System.out.println("Your enter number : " + num);
        System.out.println("This number has " + count + " digits.");

    }

    public void startProgram() {
        // loop แสดง menu
        while (true) {
            String choose = null;

            System.out.println("\n::       Main Menu       ::");
            System.out.println("===========================");
            System.out.println(
                    " A. Get Integer Number\n B. Summation of Digit\n C. Count Digit \n D. Exit ");
            System.out.print("Enter Choice : ");
            choose = input.next().toUpperCase().trim();
            switch (choose) {
                case "A":
                    getNumber();
                    break;
                case "B":
                    sumDigit();
                    break;
                case "C":
                    countDigit();
                    break;
                case "D":
                    System.out.println("Exit Program...");
                    return;
                default:
                    System.out.println("No choice");
                    break;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Assign03_6806021610182_01 start = new Assign03_6806021610182_01();
        start.startProgram();
    }
}