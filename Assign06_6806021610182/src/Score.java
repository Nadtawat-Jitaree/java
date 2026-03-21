// Id : 6806021610182
// Name : Nadtawat Jitaree
// Room : 1 RA
// File Name : Score.java

import java.text.DecimalFormat;

public class Score {
    // ประกาศตัวแปร Default
    private Double midtermExam = 0.0;
    private Double finalExam = 0.0;
    private Double homework = 0.0;

    public Score() {

    }

    // เรียกใช้ instance method
    public Score(double m, double f, double h) {
        // set ค่าให้ตัวแปร
        setMidterm(m);
        setFinal(f);
        setHomework(h);
        // เรียกใช้เพื่อให้ return ผลลัพธ์ออกมา
        toString();
    }

    // set ค่าให้ตัวแปร
    public void setMidterm(double m) {
        midtermExam = m;
    }

    public void setFinal(double f) {
        finalExam = f;
    }

    public void setHomework(double h) {
        homework = h;
    }

    // เรียกใช้ตัวแปรเพื่อให้มาแสดงผลลัพธ์
    public double getMidterm() {
        return midtermExam;
    }

    public double getFinal() {
        return finalExam;
    }

    public double getHomework() {
        return homework;
    }

    // คำนวณ
    public double toSum() {
        return midtermExam + finalExam + homework;
    }

    // หาค่าเกรด
    public String toGrade() {
        String grade = "";
        double sum = toSum();
        if (sum >= 80) {
            grade = "A";
        } else if (sum >= 70) {
            grade = "B";
        } else if (sum >= 60) {
            grade = "C";
        } else if (sum >= 50) {
            grade = "D";
        } else if (sum <= 49) {
            grade = "F";
        }
        return grade;
    }

    // แสดงผล
    public String toString() {
        DecimalFormat df = new DecimalFormat("0");
        return df.format(getMidterm()) + "\t" +
                df.format(getFinal()) + "\t" +
                df.format(getHomework()) + "\t" +
                df.format(toSum()) + "\t" +
                toGrade();
    }
}
