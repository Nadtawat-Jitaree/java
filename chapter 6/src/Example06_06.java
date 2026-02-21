
// จงสร้าง array ข้อมูล 89, 6, 4, 8, 10, 12, 2, 68, 45, 37  ให้ short โดยกำหนดให้มี method instane 3 ตัว arrayToString แปลง array เป็นข้อความ กับ bubbleSort Sort ข้อความ และ swap เพื่อสลับตำแหน่ง

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Example06_06 {
    public Example06_06() {
        JTextArea outputArea = new JTextArea();
        int array[] = { 89, 6, 4, 8, 10, 12, 2, 68, 45, 37 };
        String output = "Data item in original order\n";
        output += arrayToString(array);
        bubbleSort(array);
        output += "\n\nData items in ascending order\n";
        output += arrayToString(array);
        outputArea.setText(output);
        JOptionPane.showMessageDialog(null, outputArea, "Bobble Sort", JOptionPane.INFORMATION_MESSAGE);
    }

    public String arrayToString(int[] datas) {
        String str = "";
        for (int index = 0; index < datas.length; index++)
            str += "    " + datas[index];
        return str;
    }

    public void bubbleSort(int array2[]) {
        boolean done = true;
        for (int pass = 1; pass < array2.length; pass++) {
            done = true;
            for (int element = 0; element < array2.length - pass; element++) {
                if (array2[element] > array2[element + 1]) {
                    swap(array2, element, element + 1);
                    done = false;
                }
            }
            System.out.println(pass);
            if (done)
                break;
        }
    }

    public void swap(int array3[], int first, int second) {
        int hold = array3[first];
        array3[first] = array3[second];
        array3[second] = hold;
    }

    public static void main(String[] args) {
        new Example06_06();
    }
}