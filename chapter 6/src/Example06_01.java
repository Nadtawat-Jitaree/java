import javax.swing.JOptionPane;

public class Example06_01 {
    public static void main(String[] args) {
        Example06_01.createWithNew();
        Example06_01.createWithIntitial();
        System.exit(0);
    }

    public static void createWithNew() {
        int array[] = new int[10];
        String output = "Create with new statement\nIndex Value\n";
        for (int index = 0; index < array.length; index++)
            output += String.format("%5d", index) + String.format("%5d", array[index]) + "\n";
        JOptionPane.showMessageDialog(null, output);
    }

    public static void createWithIntitial() {
        int array[] = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };
        String output = "Create with Initial\nIndex Value\n";
        for (int index = 0; index < array.length; index++)
            output += String.format("%5d", index) + String.format("5%d", array[index]) + "\n";
        JOptionPane.showMessageDialog(null, output);
    }
}