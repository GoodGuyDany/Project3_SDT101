// Part 3.1

import javax.swing.*;
import java.awt.*;

public class GUI {

    public static void main(String[] args) {
        JFrame myFrame = new JFrame("Ugly UI");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Setting BorderLayout for myFrame
        myFrame.setLayout(new BorderLayout());

        // Adding labels to the north, south, east and west regions
        JLabel northLabel = new JLabel("North Label");
        JLabel southLabel = new JLabel("South Label");
        JLabel eastLabel = new JLabel("East Label");
        JLabel westLabel = new JLabel("West Label");
        myFrame.add(northLabel, BorderLayout.NORTH);
        myFrame.add(southLabel, BorderLayout.SOUTH);
        myFrame.add(eastLabel, BorderLayout.EAST);
        myFrame.add(westLabel, BorderLayout.WEST);

        // Adding a panel with BoxLayout to the center
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));

        // Adding buttons, text fields and rigid areas to myFrame
        centerPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        centerPanel.add(new JButton("Button 1"));
        centerPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        centerPanel.add(new JTextField("Text Field 1"));
        centerPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        centerPanel.add(new JButton("Button 2"));
        centerPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        centerPanel.add(new JTextField("Text Field 2"));
        centerPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        centerPanel.add(new JButton("Button 3"));
        centerPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        centerPanel.add(new JTextField("Text Field 3"));
        centerPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        centerPanel.add(Box.createVerticalGlue());
        centerPanel.add(new JButton("Button 4"));
        centerPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        myFrame.add(centerPanel, BorderLayout.CENTER);

        // Setting GridLayout for the panel in the south region
        JPanel southPanel = new JPanel(new GridLayout(1, 4));
        southPanel.add(new JButton("Button 5"));
        southPanel.add(new JButton("Button 6"));
        southPanel.add(new JButton("Button 7"));
        southPanel.add(new JButton("Button 8"));
        myFrame.add(southPanel, BorderLayout.SOUTH);

        // Setting the size of the frame and making it visible
        myFrame.setSize(500, 500);
        myFrame.setVisible(true);
    }
}