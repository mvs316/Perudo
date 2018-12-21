package org.suai.perudo.view;

import javax.swing.*;
import java.awt.*;

public class NewLocalGame {
    private JPanel panel;
    private JTextField textField1;
    private JButton CREATEGAMEButton;
    private JButton button1;
    private JButton STARTSERVERButton;

    public NewLocalGame(){
        CREATEGAMEButton.setBorderPainted(false);
        CREATEGAMEButton.setForeground(Color.WHITE);
        CREATEGAMEButton.setBackground(Color.BLUE);
        STARTSERVERButton.setBorderPainted(false);
        STARTSERVERButton.setContentAreaFilled(false);
        button1.setBorderPainted(false);
        button1.setContentAreaFilled(false);
    }

    public JPanel getPanel() {
        return panel;
    }
    public JButton getSTARTSERVERButton(){
        return STARTSERVERButton;
    }
    public JTextField getTextField1() {
        return textField1;
    }

    public JButton getCREATEGAMEButton() {
        return CREATEGAMEButton;
    }

    public JButton getButton1() {
        return button1;
    }
}
