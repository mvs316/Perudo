package org.suai.perudo.view;

import javax.swing.*;
import java.awt.*;

public class connectLocal {
    private JPanel panel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton JOINButton;
    private JButton button1;

    public JPanel getPanel() {
        return panel;
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public JTextField getTextField2() {
        return textField2;
    }

    public JButton getJOINButton() {
        return JOINButton;
    }

    public JButton getButton1() {
        return button1;
    }

    public connectLocal(){
        JOINButton.setBorderPainted(false);
        JOINButton.setForeground(Color.WHITE);
        JOINButton.setBackground(Color.BLUE);
        button1.setBorderPainted(false);
        button1.setContentAreaFilled(false);
    }
}
