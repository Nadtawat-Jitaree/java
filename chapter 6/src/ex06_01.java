
import javax.swing.JOptionPane;

// จงสร้าง main และ method แบบ static createWithNew , createWithInitial 
// โดยโปรแกรมจะต้องแสดงข้อความ JOptionPane ข้อความ Create with new statement \n Index Value
// และใช้ int array ในการเก็บ ข้อมูลเพื่อใช้ for loop ในการแสดงตัวเลข โดยจะแสดง before ก่อน เมื่อกด ok ถึงจะแสดง after ข้อมูล

public class ex06_01 {
    public static void main(String[] args) {
        ex06_01.createWithNew();
        ex06_01.createWithIntitial();
        System.exit(0);
    }

    public static void createWithNew() {
        int array[] = new int[10];
        String output = "Create with new statement\nIndex Value\n";
        for (int i = 0; i < array.length; i++) {
            output += String.format("%5d", i) + String.format("%5d", array[i]) + "\n";
        }
        JOptionPane.showMessageDialog(null, output, "Message", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void createWithIntitial() {
        int array[] = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };
        String output = "Create with Intitial\nIndex Value\n";
        for (int i = 0; i < array.length; i++) {
            output += String.format("%5d", i) + String.format("%5d", array[i]) + "\n";
        }
        JOptionPane.showMessageDialog(null, output, "Message", JOptionPane.INFORMATION_MESSAGE);
    }
}
