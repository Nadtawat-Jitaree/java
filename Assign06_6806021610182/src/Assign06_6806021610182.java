// Id : 6806021610182
// Name : Nadtawat Jitaree
// Room : 1 RA
// File Name : Assign06_6806021610182.java

// import
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Assign06_6806021610182 {
    // ตัวแปร default
    Score[] score = new Score[20];
    Random rnd = new Random();

    // method หลัก
    public void mainProgram() {
        String input;
        // loop
        while (true) {
            // รัยค่า
            input = JOptionPane.showInputDialog(null, "Enter number of students (0-exit) : ", "Input",
                    JOptionPane.QUESTION_MESSAGE);
            // เช็คเงื่อนไขเท่ากับ 0 ให้ออก มากกว่า 20 ให้แจ้งเตือน นอกนั้นให้เรียก method
            // genScore มาแสดง
            if (Integer.parseInt(input) == 0) {
                JOptionPane.showMessageDialog(null, "Exit Program...", "Message", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else if (Integer.parseInt(input) > 20) {
                JOptionPane.showMessageDialog(null, "Number of students not correct", "Message",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                genScore(Integer.parseInt(input));

            }
        }
    }

    // สุ่มค่า score
    public void genScore(Integer input) {
        // loop มิดเทอม 30 คะแนน final 40 คะแนน homework 30 คะแนน
        for (int i = 0; i < input; i++) {
            int m = rnd.nextInt(30);
            int f = rnd.nextInt(40);
            int h = rnd.nextInt(30);
            score[i] = new Score(m, f, h);
        }
        // เรียกใช้ report
        report(input);
    }

    // แสดงผล
    public void report(Integer num) {
        JTextArea outputText = new JTextArea();

        String data = "No.\tMid\tFinal\tHw\tTotal\tGrade\n";
        data += "================================================================\n";
        // loop เก็บข้อมูลลงใน str
        for (int i = 0; i < num; i++) {
            data += (i + 1) + "\t" + score[i].toString() + "\n";
        }

        outputText.setText(data);
        JOptionPane.showMessageDialog(null, outputText, "Message",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        Assign06_6806021610182 obj = new Assign06_6806021610182();
        obj.mainProgram();
    }
}
