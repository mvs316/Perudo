package org.suai.perudo.view;

import javax.swing.*;

public class Connect {
    private JPanel panel;
    private JComboBox comboBox1;
    private JButton button1;

    public JPanel getPanel() {
        return panel;
    }

    public JComboBox getComboBox1() {
        return comboBox1;
    }
    public JButton getButton1(){
        return button1;
    }

    public  Connect(){
        comboBox1.setVisible(true);
        button1.setBorderPainted(false);
        button1.setContentAreaFilled(false);
    }
}
