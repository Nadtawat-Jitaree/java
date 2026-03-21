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

public class AppProduct extends JFrame implements ActionListener {
    JPanel panelForm;
    JTextField textCode, textName, textPrice;
    JLabel label1, label2, label3;
    JButton saveBtn, readBtn;
    JTextArea outputArea;
    JScrollPane scrollPane;
    Container c;
    Font myFont = new Font("Tahoma", Font.BOLD, 16);
    String FILENAME = "products.txt";
    Product prod[] = new Product[10];
    Product product = new Product();
    private int index = 0;

    public AppProduct() {
        super(" Example Read and Write Product ");
        c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15));
        guiForm1();
        guiForm2();
        setSize(500, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void guiForm1() {
        panelForm = new JPanel();
        panelForm.setLayout(new GridLayout(3, 2));
        panelForm.setPreferredSize(new Dimension(400, 100));
        label1 = new JLabel("Enter product Code : ");
        label1.setFont(myFont);
        panelForm.add(label1);
        textCode = new JTextField(10);
        textCode.addActionListener(this);
        textCode.setFont(myFont);
        panelForm.add(textCode);
        label2 = new JLabel("Enter Product Name : ");
        label2.setFont(myFont);
        panelForm.add(label2);
        textName = new JTextField(10);
        textName.setFont(myFont);
        panelForm.add(textName);
        label3 = new JLabel("Enter Product Price : ");
        label3.setFont(myFont);
        panelForm.add(label3);
        textPrice = new JTextField(10);
        textPrice.setFont(myFont);
        panelForm.add(textPrice);
        c.add(panelForm);
    }

    public void guiForm2() {
        saveBtn = new JButton(" Save Product ");
        saveBtn.setFont(myFont);
        saveBtn.addActionListener(this);
        c.add(saveBtn);
        readBtn = new JButton(" Read Product ");
        readBtn.setFont(myFont);
        readBtn.addActionListener(this);
        c.add(readBtn);
        outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);
        outputArea.setFont(myFont);
        scrollPane = new JScrollPane(outputArea);
        c.add(scrollPane);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == saveBtn) {
            String codeStr, nameStr, priceStr;
            codeStr = textCode.getText().toString();
            nameStr = textName.getText().toString();
            priceStr = textPrice.getText().toString();
            if (!codeStr.isEmpty() && !nameStr.isEmpty() && !priceStr.isEmpty()) {
                product.setCode(codeStr);
                product.setName(nameStr);
                product.setPrice(Double.parseDouble(priceStr));
                saveProduct(product);
            } else {
                JOptionPane.showMessageDialog(this, "Data not complete", "Error Message ", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == readBtn) {
            outputArea.setText("");
            readProduct();
            for (int n = 0; n < index; n++) {
                outputArea.append(prod[n].toString() + "\n");
            }
        }
    }

    public void saveProduct(Product product) {
        try {
            FileWriter out = new FileWriter(FILENAME, true);
            BufferedWriter writer = new BufferedWriter(out);
            writer.write(product.toProduct());
            writer.close();
            out.close();
            JOptionPane.showMessageDialog(this, product.toString() + "\n Save already");
            textCode.setText("");
            textName.setText("");
            textPrice.setText("");
        } catch (IOException exception) {
            JOptionPane.showMessageDialog(this, "can not write data", "Error Message ", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void readProduct() {
        try {
            FileReader in = new FileReader(FILENAME);
            BufferedReader reader = new BufferedReader(in);
            String s1;
            index = 0;
            while ((s1 = reader.readLine()) != null) {
                String[] s = s1.split(",");
                prod[index] = new Product(s[0], s[1], Double.parseDouble(s[2]));
                index++;
            }
            reader.close();
            in.close();
        } catch (IOException exception) {
            JOptionPane.showMessageDialog(this, "can not read file", "Error Message", JOptionPane.ERROR_MESSAGE);
        }

    }
}
