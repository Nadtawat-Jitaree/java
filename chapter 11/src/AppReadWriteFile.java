import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AppReadWriteFile extends JFrame implements ActionListener {
    JPanel panelFormm;
    JTextField textName;
    JLabel label1, label2, label3;
    JButton saveBtn, readBtn;
    JTextArea outputArea;
    JScrollPane scrollPane;
    Container c;
    Font myFont = new Font("Tahoma", Font.BOLD, 16);
    String FILENAME = "name.txt";

    public AppReadWriteFile() {
        super(" Example Read and Write Product ");
        c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15));
        guiForm();
        saveBtn = new JButton(" Save ");
        saveBtn.setFont(myFont);
        saveBtn.addActionListener(this);
        c.add(saveBtn);
        readBtn = new JButton(" Read ");
        readBtn.setFont(myFont);
        readBtn.addActionListener(this);
        c.add(readBtn);
        outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);
        outputArea.setFont(myFont);
        scrollPane = new JScrollPane(outputArea);
        c.add(scrollPane);
        setSize(500, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void guiForm() {
        panelFormm = new JPanel();
        panelFormm.setLayout((new GridLayout(1, 2)));
        panelFormm.setPreferredSize(new Dimension(400, 40));
        label1 = new JLabel("Enter name : ");
        label1.setFont(myFont);
        panelFormm.add(label1);
        textName = new JTextField(10);
        textName.addActionListener(this);
        textName.setFont(myFont);
        panelFormm.add(textName);
        c.add(panelFormm);
    }

    public void save() {
        String nameStr;
        nameStr = textName.getText().toString();
        if (!nameStr.isEmpty()) {
            try {
                FileWriter out = new FileWriter(FILENAME, true);
                BufferedWriter writer = new BufferedWriter(out);
                writer.write(nameStr + "\n");
                writer.close();
                out.close();
                JOptionPane.showMessageDialog(this, " Save already ");
                textName.setText("");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, " can not write data ", "Error Message", JOptionPane.ERROR_MESSAGE);

            }
        } else {
            JOptionPane.showMessageDialog(this, "Data not complete", "Error Message ", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void read() {
        outputArea.setText("");
        try {
            FileReader in = new FileReader(FILENAME);
            BufferedReader reader = new BufferedReader(in);
            String s1;
            while ((s1 = reader.readLine()) != null) {
                outputArea.append(s1 + "\n");
            }
            reader.close();
            in.close();
        } catch (IOException exception) {
            JOptionPane.showMessageDialog(this, "can not read file", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == saveBtn) {
            save();
        } else if (e.getSource() == readBtn) {
            read();
        }
    }
}