import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Part 3.2
public class GUI3_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text Circulation App"); // Creating a new JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Setting a default close operation to end the runtime when closing application

        JPanel panel = new JPanel(); // Creating a new panel
        panel.setLayout(new GridLayout(3, 2));

        JLabel label1 = new JLabel("Copy from:");
        JTextField textField1 = new JTextField();
        JLabel label2 = new JLabel("Copy to 1:");
        JTextField textField2 = new JTextField();
        JLabel label3 = new JLabel("Copy to 2:");
        JTextField textField3 = new JTextField();

        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(label3);
        panel.add(textField3);

        // Creating a button to copy the text from textField1 to textField2
        JButton button1 = new JButton("Copy to 1"); // Creating a button to copy to textLabel1
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField1.getText();
                textField2.setText(text);

                JOptionPane.showMessageDialog(frame, "Text copied from Copy from field to Copy to 1 field.");
            }
        });

        // Creating a button to copy the text from textField1 to textField3
        JButton button2 = new JButton("Copy to 2");
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField1.getText();
                textField3.setText(text);

                JOptionPane.showMessageDialog(frame, "Text copied from Copy from field to Copy to 2 field.");
            }
        });

        // Adding the buttons to the panel
        panel.add(button1);
        panel.add(button2);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}