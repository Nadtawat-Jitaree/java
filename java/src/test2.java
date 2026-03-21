import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class test2 {
    JTextArea outputArea;
    int array2[][] = { { 85, 22 }, { 65, 44 } };

    public void start() {
        String grade = "The array is:\n";
        outputArea = new JTextArea();
        for (int i = 0; i < array2.length; i++) {
            grade += "grade[" + i + "]   " + showArray(array2[i]);
        }
        grade += "\nlow is " + minimum();
        grade += "\nhight is " + maximum();
        outputArea.setText(grade);
        JOptionPane.showMessageDialog(null, outputArea);

    }

    public Integer minimum() {
        int low = array2[0][0];
        for (int r = 0; r < array2.length; r++) {
            for (int c = 0; c < array2[r].length; c++) {
                if (array2[r][c] < low) {
                    low = array2[r][c];
                }
            }
        }
        return low;
    }

    public Integer maximum() {
        int maxV = array2[0][0];
        for (int r = 0; r < array2.length; r++) {
            for (int c = 0; c < array2[r].length; c++) {
                if (array2[r][c] > maxV) {
                    maxV = array2[r][c];
                }
            }
        }
        return maxV;
    }

    public String showArray(int array[]) {
        String output = "";
        for (int i = 0; i < array.length; i++) {
            output += array[i] + " ";
        }
        output += "\n";
        return output;
    }

    public static void main(String[] args) {
        test2 obj = new test2();
        obj.start();
    }
}
