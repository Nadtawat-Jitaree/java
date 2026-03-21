import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class WindowsFlowLayout {
    JFrame window = new JFrame("Test GUI #1 : FlowLayout");
    Container c = window.getContentPane();
    JPanel panel1, panel2;
    JTextField textField1, textField2;
    JLabel label1, label2, label3;
    JButton btn1, btn2;
    JRadioButton radioButton1, radioButton2 ;
    ButtonGroup radioGroup;
    Font font = new Font("Tahoma", Font.BOLD, 16);

    public WindowsFlowLayout() {
        c.setLayout(new FlowLayout());
        initGui1();
        initGui2();
        initGui3();
        window.setSize(350, 300);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void initGui1() {
        panel1 = new JPanel(new FlowLayout());
        panel1.setPreferredSize(new Dimension(300,80));
        panel1.setBorder(new LineBorder(Color.RED, 2));
        label1 = new JLabel("Enter String 1 :");
        label1.setFont(font);
        label2 = new JLabel("Enter String 2 :");
        label2.setFont(font);
        textField1 = new JTextField(10);
        textField1.setFont(font);
        textField2 = new JTextField(10);
        textField2.setFont(font);
        panel1.add(label1);
        panel1.add(textField1);
        panel1.add(label2);
        panel1.add(textField2);
        c.add(panel1);
    }

    public void initGui2() {
        panel2 = new JPanel(new FlowLayout());
        panel2.setPreferredSize(new Dimension(300,60));
        panel2.setBorder(new LineBorder(Color.BLUE, 2));
        label3 = new JLabel("Select Sex : ");
        label3.setFont(font);
        radioButton1 = new JRadioButton("Male", true);
        radioButton1.setFont(font);
        radioButton2 = new JRadioButton("Female");
        radioButton2.setFont(font);
        radioGroup = new ButtonGroup();
        panel2.add(label3);
        panel2.add(radioButton1);
        panel2.add(radioButton2);
        radioGroup.add(radioButton1);
        radioGroup.add(radioButton2);
        c.add(panel2);
    }

    public void initGui3() {
        btn1 = new JButton(" OK ");
        btn1.setFont(font);
        btn2 = new JButton(" Cancle ");
        btn2.setFont(font);
        c.add( btn1 );
        c.add( btn2);
    }
}
