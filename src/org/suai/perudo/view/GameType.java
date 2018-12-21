package org.suai.perudo.view;

import javax.swing.*;
import java.awt.*;

public class GameType {
    private JPanel panel;
    private JButton NEWGAMEButton;
    private JButton CONNECTTOSERVERButton;
    private JButton exit;

    public GameType() {
        NEWGAMEButton.setBorderPainted(false);
        CONNECTTOSERVERButton.setBorderPainted(false);
        NEWGAMEButton.setForeground(Color.WHITE);
        NEWGAMEButton.setBackground(Color.BLUE);
        CONNECTTOSERVERButton.setForeground(Color.WHITE);
        CONNECTTOSERVERButton.setBackground(Color.BLUE);
        exit.setBorderPainted(false);
        exit.setContentAreaFilled(false);
    }

    public JPanel getPanel() {
        return panel;
    }

    public JButton getNEWGAMEButton() {
        return NEWGAMEButton;
    }

    public JButton getCONNECTTOSERVERButton() {
        return CONNECTTOSERVERButton;
    }

    public JButton getExit() {
        return exit;
    }
}
