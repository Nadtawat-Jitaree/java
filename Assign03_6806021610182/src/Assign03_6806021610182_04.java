
/* Id : 6806021610182
 * Name : Nadtawat Jitaree
 * Room : 1 RA
 * File Name : Assign03_6806021610182_04.java
 */

import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Assign03_6806021610182_04 {
    // ประกาศตัวแปรเริ่มต้น
    Long num = 0L;

    // รับค่า integer type long method นี้ไม่รับค่า parameters และ return long
    public Long getNumber() {
        // รับค่า
        String inputData = JOptionPane.showInputDialog(null, "Enter number : ", "Input", JOptionPane.QUESTION_MESSAGE);
        // แปลง str to long
        num = Long.valueOf(inputData);
        return num;
    }

    // คำนวณตัวเลขที่รับค่ามาและแสดงผล รับค่า long parameter ได้ แต่ไม่ต้อง return
    public void sumDigit(Long n) {
        // ประกาศตัวแปรเริ่มต้น
        Long digit = 0L, sum = 0L, tem = 0L;
        // กำหนดตัวแปรให้ท่ากับ parameter ที่รับมา
        digit = n;
        // loop
        while (digit > 0) {
            // ใช้ tem เก็บค่าตัวเลข 1 หลัก
            tem = digit % 10;
            // ใช้ sum เก็บผลลัพธ์ไปเรื่อย
            sum += tem;
            // ตัดตัวเลข 1 หลักออก
            digit = digit / 10;
        }
        // แสดงผล
        String messSumDigit = "Your enter number : " + n + "\nSummation of digit : " + sum;
        JOptionPane.showMessageDialog(null, messSumDigit, "Message", JOptionPane.INFORMATION_MESSAGE);
    }

    // แสดงผล reverse ตัวเลข โดยรับค่า long parameter มา แต่ไม่ต้อง return
    public void printReverse(Long n) {
        // ประกาศตัวแปรเริ่มต้น
        Long digit = 0L, tem = 0L;
        String reverse = "";
        // กำหนดตัวแปรให้ท่ากับ parameter ที่รับมา
        digit = n;
        // loop
        while (digit > 0) {
            // เอา tem รับค่าทีละหลักโดยใช้ % 10 ตัดออกมา
            tem = digit % 10;
            // ใช้ string + ค่าไปทีละหลัก
            reverse += "" + tem;
            // ตัดตัวเลข 1 หลักออก
            digit = digit / 10;
        }
        // แสดงผล
        String messReverse = "Your enter number : " + n + "\nReverse number : " + reverse;
        JOptionPane.showMessageDialog(null, messReverse, "Message", JOptionPane.INFORMATION_MESSAGE);
    }

    // คำนวณจำนวนตัวเลข แสดงผลลัพธ์ รับ long parameter และไม่ return
    public void countDigit(Long n) {
        // ประกาศตัวแปรเริ่มต้น
        Long digit = 0L, count = 0L;
        // กำหนดตัวแปรให้ท่ากับ parameter ที่รับมา
        digit = num;
        // loop ตัดตำแหน่งไปเรื่อยๆเพื่อรับนับจำนวนครั้งแทนจำนวนตัวเลข
        while (digit > 0) {
            count += 1;
            digit = digit / 10;
        }
        // แสดงผลลัพธ์
        String messCount = "Your enter number : " + n + "\nThis number has " + count + " digits";
        JOptionPane.showMessageDialog(null, messCount, "Message", JOptionPane.INFORMATION_MESSAGE);
    }

    // method หลัก มีเมนู รอรับค่า text method นี้ไม่รับค่า parameter อะไรทั้งนั้น
    // ควรจะมี check Upper lower ด้วย
    public void mainMenu() {
        // format font
        UIManager.put("OptionPane.messageFont", new Font("Tahoma", Font.PLAIN, 14));
        // loop เมนู
        while (true) {
            String menu = "::   Main Menu   ::\n===================\n A. Get Integer Number \n B. Summation of Digit\n C. Print Reverse Number\n D. Count Digit \n E. exit\nEnter Choice : ";
            String choice = JOptionPane.showInputDialog(null, menu, "Input", JOptionPane.QUESTION_MESSAGE);
            choice = choice.toUpperCase().trim();
            switch (choice) {
                case "A":
                    getNumber();
                    break;
                case "B":
                    sumDigit(num);

                    break;
                case "C":
                    printReverse(num);
                    break;
                case "D":
                    countDigit(num);
                    break;
                case "E":
                    // ออก
                    JOptionPane.showMessageDialog(null, "Now, Exit Program...", "Message",
                            JOptionPane.INFORMATION_MESSAGE);
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "No this choice, please input again", "Message",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Assign03_6806021610182_04 obj = new Assign03_6806021610182_04();
        obj.mainMenu();
    }
}
