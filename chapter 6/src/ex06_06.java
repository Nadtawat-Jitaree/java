
// จงสร้าง array ข้อมูล 89, 6, 4, 8, 10, 12, 2, 68, 45, 37  ให้ short โดยกำหนดให้มี method หลัก ex06_06 1 ตัว method instane 3 ตัว arrayToString แปลง array เป็นข้อความ กับ bubbleSort Sort ข้อความ และ swap เพื่อสลับตำแหน่ง

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ex06_06 {
    public ex06_06() {
        JTextArea outputTextArea = new JTextArea();
        int array[] = { 89, 6, 4, 8, 10, 12, 2, 68, 45, 37 };
        String output = "Data item in original order\n";
        output += arrayToString(array);
        output += bubbleSort();

        outputTextArea.setText(output);
        JOptionPane.showMessageDialog(null, outputTextArea, "BubbleSort", JOptionPane.INFORMATION_MESSAGE);
    }

    public String arrayToString(int array1[]) {
        String text = "";
        for (int i = 0; i < array1.length; i++) {
            text += array1[i] + "   ";
        }
        return text;
    }

    public 

    public static void main(String[] args) {
        new ex06_06();
    }
}
