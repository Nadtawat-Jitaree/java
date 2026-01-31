
/* Id : 6806021610182
 * Name : Nadtawat Jitaree
 * Room : 1 RA
 * File Name : Assign03_6806021610182_02.java
 */
import javax.swing.JOptionPane;

public class Assign03_6806021610182_02 {

    // ประกาศตัวแปรเริ่มต้น
    String startTime;
    String endTime;
    int sh;
    int sm;
    int ss;
    int eh;
    int em;
    int es;
    int hours;
    int minutes;
    int seconds;

    public void inputData() {
        // รับเวลาเริ่ม
        startTime = JOptionPane.showInputDialog(
                null,
                "Enter start time :",
                "Input",
                JOptionPane.QUESTION_MESSAGE);
        // รับเวลาจบ
        endTime = JOptionPane.showInputDialog(
                null,
                "Enter end time :",
                "Input",
                JOptionPane.QUESTION_MESSAGE);
    }

    public void calculate() {
        // แยกวันเริ่มชั่วโมง นาที วินาที โดยใช้ substring
        sh = Integer.parseInt(startTime.substring(0, 2));
        sm = Integer.parseInt(startTime.substring(3, 5));
        ss = Integer.parseInt(startTime.substring(6, 8));

        // แยกวันจบชั่วโมง นาที วินาที โดยใช้ substring
        eh = Integer.parseInt(endTime.substring(0, 2));
        em = Integer.parseInt(endTime.substring(3, 5));
        es = Integer.parseInt(endTime.substring(6, 8));

        // แปลงเป็นวินาทีทั้งหมด
        int startSec = sh * 3600 + sm * 60 + ss;
        int endSec = eh * 3600 + em * 60 + es;

        // เวลาเริ่มต้องน้อยกว่าหรือเท่ากับ เวลาจบ
        if (startSec >= endSec) {
            JOptionPane.showMessageDialog(
                    null,
                    "Start time must be less than End time",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        // คำนวณเวลาที่ใช้
        int cal = endSec - startSec;

        hours = cal / 3600;
        minutes = (cal % 3600) / 60;
        seconds = cal % 60;
    }

    public void display() {
        // แสดงผล
        String message = "Start Time : " + startTime + "\n"
                + "End Time : " + endTime + "\n"
                + "Time used : " + hours + " Hours "
                + minutes + " minutes "
                + seconds + " seconds.";

        JOptionPane.showMessageDialog(
                null,
                message,
                "Message",
                JOptionPane.INFORMATION_MESSAGE);
        startProgram();
    }

    public void startProgram() {
        inputData();
        calculate();
        display();
    }

    public static void main(String[] args) {
        Assign03_6806021610182_02 start = new Assign03_6806021610182_02();
        start.startProgram();
    }
}
