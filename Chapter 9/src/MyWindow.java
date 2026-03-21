import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class MyWindow {
    JFrame window;
    JPanel panel1, panel2;
    Container c;
    public MyWindow() {
        window = new JFrame("Test JPanel");
        c = window.getContentPane();
        c.setLayout(new FlowLayout());
        panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(350,120));
        panel1.setLayout(new FlowLayout());
        panel1.setBorder(new LineBorder(Color.RED, 2));

        panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(350,120));
        panel2.setLayout(new FlowLayout());
        panel2.setBorder(new LineBorder(Color.BLUE, 2));

        window.add(panel1);
        window.add(panel2);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 300);
        window.setVisible(true);
        window.setResizable(false);
    }
}
