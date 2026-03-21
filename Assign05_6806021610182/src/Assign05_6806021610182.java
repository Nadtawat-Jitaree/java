
// Id : 6806021610182
// Name : Nadtawat Jitaree
// Room : 1 RA
// File Name : Assign05_6806021610182.java
import java.util.Random;

import javax.swing.JOptionPane;

public class Assign05_6806021610182 {
    // default array
    public static double[] array1 = new double[12];

    // mainProgram static ไม่คืนค่า
    public static void mainProgram() {
        String output = "Menu Sale Report\n______________________\n1. Generate Sale\n2.Report Sale\n3.Exit\nEnter choice : ";
        // loop
        while (true) {
            String choice = JOptionPane.showInputDialog(null, output, "Input",
                    JOptionPane.QUESTION_MESSAGE);
            switch (choice) {
                case "1":
                    // กันมาเจนอีกรอบให้มันรีเซ็ต array เดิม
                    array1 = new double[12];
                    // gen
                    genSale(array1);
                    break;
                case "2":
                    // แสดงผล
                    reportSale(array1);
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Exit Program.", "Message", JOptionPane.INFORMATION_MESSAGE);
                    return;
            }
        }
    }

    // genSale static ไม่คืนค่า
    public static void genSale(double array[]) {
        // random 100,000 - 900,000
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] += rnd.nextDouble(100000, 900000);
        }
        // เก็บ array ที่ loop random มาเก็บใน array1 ที่ประกาศ default ไว้ก่อนหน้า
        array1 = array;
    }

    // reportSale static ไม่คืนค่า
    public static void reportSale(double array[]) {
        // default
        double total = 0.0d;
        String output = "No.          Sales                  Percent\n===========================\n";
        // loop เก็บ total
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        // loop แสดงผล
        for (int i = 0; i < array.length; i++) {
            output += String.format("%-15d", (i + 1)) + String.format("%,-18.2f", array[i])
                    + String.format("%,.2f", ((array1[i] / total) * 100)) + "\n";
        }
        output += "===========================\nTotal " + String.format("%,20.2f", total) + String.format("%8d", 100);
        // แสดงผล
        JOptionPane.showMessageDialog(null, output);
    }

    // method หลัก
    public static void main(String[] args) {
        Assign05_6806021610182.mainProgram();
    }
}