package org.suai.perudo.view;

import javax.swing.*;
import java.awt.*;

public class NewGame {
    public JTextField getTextField1() {
        return textField1;
    }

    public JTextField getTextField2() {
        return textField2;
    }

    public JButton getCREATEGAMEButton() {
        return CREATEGAMEButton;
    }

    public JPanel getPanel() {
        return panel;
    }

    public JButton getButton1() {
        return button1;
    }

    private JTextField textField1;
    private JTextField textField2;
    private JButton CREATEGAMEButton;
    private JPanel panel;
    private JButton button1;

    public NewGame(){
        CREATEGAMEButton.setBorderPainted(false);
        CREATEGAMEButton.setForeground(Color.WHITE);
        CREATEGAMEButton.setBackground(Color.BLUE);
        button1.setBorderPainted(false);
        button1.setContentAreaFilled(false);
    }
}
