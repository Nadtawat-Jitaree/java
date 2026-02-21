// จงสร้าง main และ method แบบ static start 
// โดยโปรแกรมจะต้องแสดงข้อความ JOptionPane ข้อความ Create with new statement \n Index Value
// และใช้ int array ในการเก็บ ข้อมูลเพื่อใช้ for loop random ในการแสดงตัวเลข โดยจะแสดง before ก่อน เมื่อกด ok ถึงจะแสดง after ข้อมูล

import java.util.Random;

import javax.swing.JOptionPane;

public class ex06_02 {

    public static void main(String[] args) {
        ex06_02.start();
        System.exit(0);
    }

    public static void start() {
        final int ARRAY_LEN = 10;
        int array[] = new int[ARRAY_LEN];
        int total = 0;
        Random rnd = new Random();
        for (int index = 0; index < array.length; index++)
            array[index] = 10 + rnd.nextInt(21);

        String output = "Index\tValue\n";
        for (int i = 0; i < array.length; i++)
            output += String.format("%5d", i) + String.format("%5d", array[i]) + "\n";

        for (int index = 0; index < array.length; index++)
            total += array[index];

        output += "Total value of array : " + total + "\n";
        output += "Average value : " + String.format("%5.2f", (float) total / array.length) + "\n";
        JOptionPane.showMessageDialog(null, output, "Value in Array", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
