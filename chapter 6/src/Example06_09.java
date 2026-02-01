import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Example06_09 {
    JTextArea outputArea;

    public Example06_09() {
        outputArea = new JTextArea();
        int array1[][] = { { 1, 2, 3, 4 }, { 4, 5, 6, 7 } };
        int array2[][] = { { 1, 2 }, { 3, 4, 5 }, { 4, 5, 6, 7 }, { 5 } };
        outputArea.setText("Values in array1 by row are\n");
        buildOutput(array1);
        outputArea.append("Values in array2 by row are\n");
        buildOutput(array2);
        JOptionPane.showConfirmDialog(null, outputArea, "Array 2-D", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    public void buildOutput(int array[][]) {
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                outputArea.append(array[row][column] + "  ");
            }
            outputArea.append("\n");
        }
    }

    public static void main(String[] args) {
        new Example06_09();
    }
}
