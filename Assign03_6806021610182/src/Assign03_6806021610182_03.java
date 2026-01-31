
/* Id : 6806021610182
 * Name : Nadtawat Jitaree
 * Room : 1 RA
 * File Name : Assign03_6806021610182_03.java
 */

import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Assign03_6806021610182_03 {
    // ประกาศตัวแปรเริ่มต้น
    String inputText;

    // รับค่า data
    public void inputData() {
        // รับค่า
        inputText = JOptionPane.showInputDialog(null, "Enter text : ", "Input", JOptionPane.QUESTION_MESSAGE);
        // เรียกใช้ calculate ต่อ
        calculate();
    }

    // คำนวณ
    public void calculate() {
        // เช็คค่าว่าง
        if (inputText.equals("")) {
            JOptionPane.showMessageDialog(null, "No input text !", "Error Message", JOptionPane.ERROR_MESSAGE);
            inputData();
            return;
        }
        // ใช้ length นับจำนวนตัวอักษร
        Integer lenghtText = inputText.length();

        // ประกาศตัวแปรเริ่มต้น
        char ch;
        int c1, c2, c3, c4;
        c1 = c2 = c3 = c4 = 0;

        // loop เช็คตัวอักษร พิมพ์ใหญ่ พิมพ์เล็ก ตัวเลข สัญลักษณ์อื่นๆ
        for (int index = 0; index < inputText.length(); index++) {
            // ใช้ charAt ในการเช็คทีละตัวตามตำแหน่ง Index
            ch = inputText.charAt(index);

            if (ch >= 'A' && ch <= 'Z') {
                c1++;
            } else if (ch >= 'a' && ch <= 'z') {
                c2++;
            } else if (ch >= '0' && ch <= '9') {
                c3++;
            } else {
                c4++;
            }

        }
        // แสดงผล
        JOptionPane.showMessageDialog(null,
                "TEXT : " + inputText + "\nText length : " + lenghtText + "\nตัวอักษรใหญ่ : " + c1
                        + "\nตัวอักษรพิมพ์เล็ก : " + c2 + "\nตัวอักษรตัวเลข : " + c3 + "\nสัญลักษณ์อื่น : " + c4,
                "Message",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public void startProgram() {
        // format ภาษาไทย
        UIManager.put("OptionPane.messageFont", new Font("Tahoma", Font.PLAIN, 14));
        // เรียกใช้ inputdata
        inputData();
    }

    public static void main(String[] args) {
        Assign03_6806021610182_03 start = new Assign03_6806021610182_03();
        start.startProgram();
    }
}
