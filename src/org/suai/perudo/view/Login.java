package org.suai.perudo.view;

import javax.swing.*;
import java.awt.*;

public class Login {
    private JPanel panel;
    private JTextField login;
    private JTextField password;
    private JButton loginButton;
    private JButton STAYOFFLINEButton;
    private JButton REGISTERButton;
    private JButton exit;

    public JPanel getPanel() {
        return panel;
    }

    public JTextField getLogin() {
        return login;
    }

    public JTextField getPassword() {
        return password;
    }

    public JButton getLoginButton() {
        return loginButton;
    }

    public JButton getSTAYOFFLINEButton() {
        return STAYOFFLINEButton;
    }

    public JButton getREGISTERButton() {
        return REGISTERButton;
    }

    public JButton getExit() {
        return exit;
    }

    public Login(){
        loginButton.setBorderPainted(false);
        STAYOFFLINEButton.setBorderPainted(false);
        REGISTERButton.setBorderPainted(false);
        loginButton.setForeground(Color.WHITE);
        REGISTERButton.setBackground(Color.BLUE);
        STAYOFFLINEButton.setForeground(Color.WHITE);
        loginButton.setBackground(Color.BLUE);
        REGISTERButton.setForeground(Color.WHITE);
        STAYOFFLINEButton.setBackground(Color.BLUE);
        exit.setBorderPainted(false);
        exit.setContentAreaFilled(false);

    }

}
