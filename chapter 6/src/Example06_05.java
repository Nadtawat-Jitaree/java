import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Example06_05 {
    public static void main(String[] args) {
        Example06_05 obj = new Example06_05();
        obj.studentPoll();
    }

    public void studentPoll() {
        int responses[] = new int[50];
        int frequency[] = new int[10];
        randomPoll(responses);
        countFrequency(responses, frequency);
        String output = "Rating\tFreqency\n" + toOutput(frequency);
        // for (int rating = 0; rating < frequency.length; rating++)
        // output += (rating + 1) + "\t" + frequency[rating] + "\n";

        JTextArea outputArea = new JTextArea();
        outputArea.setText(output);
        JOptionPane.showMessageDialog(null, outputArea, "Student Poll Program", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    public String toOutput(int[] datas) {
        String output = "";
        for (int rating = 0; rating < datas.length; rating++)
            output += (rating + 1) + "\t" + datas[rating] + "\n";
        return output;
    }

    public void randomPoll(int[] datas) {
        Random rnd = new Random();
        for (int index = 0; index < datas.length; index++)
            datas[index] = 1 + rnd.nextInt(10);
    }

    public void countFrequency(final int[] datas, int[] frequency) {
        for (int i : datas) {
            // Pointer
            frequency[i - 1]++;

            // if (i == 1)
            // frequency[0]++;
            // else if (i == 2)
            // frequency[1]++;
            // else if (i == 3)
            // frequency[2]++;
            // else if (i == 4)
            // frequency[3]++;
            // else if (i == 5)
            // frequency[4]++;
            // else if (i == 6)
            // frequency[5]++;
            // else if (i == 7)
            // frequency[6]++;
            // else if (i == 8)
            // frequency[7]++;
            // else if (i == 9)
            // frequency[8]++;
            // else if (i == 10)
            // frequency[9]++;
        }
    }
}