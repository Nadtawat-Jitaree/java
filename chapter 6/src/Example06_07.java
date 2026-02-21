import java.util.Random;
import javax.swing.JOptionPane;

public class Example06_07 {
    public static void main(String[] args) {
        Example06_07.start();
    }

    public static void start() {
        int array[] = new int[100];
        Random rnd = new Random();
        boolean done = true;
        String result;
        // int array[] = { 31, 2, 4, 5, 7 };
        for (int index = 0; index < array.length; index++)
            array[index] = rnd.nextInt(101);

        do {
            String searchKey = JOptionPane.showInputDialog("Enter number to search(-1 : exit) :");
            if (searchKey.equals("-1"))
                done = false;
            else {
                int element = linearSearch(array, Integer.parseInt(searchKey));
                result = (element != -1) ? "Found value in element " + element : "Value not found";
                JOptionPane.showMessageDialog(null, result);
            }
        } while (done);
        System.exit(0);
    }

    public static int linearSearch(int array2[], int key) {
        for (int index = 0; index < array2.length; index++)
            if (array2[index] == key)
                return index;
        return -1;
    }
}
