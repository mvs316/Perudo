package org.suai.perudo.view;

import org.suai.perudo.model.PerudoModel;
import org.suai.perudo.model.Player;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
public class GameWindow implements ActionListener, MouseListener {
    private JButton dice1;
    private JButton dice2;
    private JButton dice4;
    private JButton dice5;
    private JButton dice3;
    private JButton dice6;
    private JButton makeBid;
    private JButton doubt;
    private JSlider slider;
    private JButton showDices;

    private JButton exit;
    private JTextField textField1;
    private JPanel panel;
    private JButton chat;

    private int [] dices;
    private int chosenDice;

    public GameWindow() {

        dices = new int[6];
        for(int i = 0; i < 6; i++){
            dices[i] = (int)(Math.random() * 6);
            dices[i]++;
        }

        showDices.setBorderPainted(false);
        showDices.setContentAreaFilled(false);
        showDices.setFont(new Font("Serif", Font.PLAIN, 30));
        makeBid.setFont(new Font("Serif", Font.PLAIN, 20));
        makeBid.setForeground(Color.WHITE);
        makeBid.setBackground(Color.GREEN);
        makeBid.setBorderPainted(false);
        doubt.setFont(new Font("Serif", Font.PLAIN, 20));
        doubt.setForeground(Color.WHITE);
        doubt.setBackground(Color.RED);
        doubt.setBorderPainted(false);
        dice1.setBorderPainted(false);
        dice1.setContentAreaFilled(false);
        dice2.setBorderPainted(false);
        dice2.setContentAreaFilled(false);
        dice3.setBorderPainted(false);
        dice3.setContentAreaFilled(false);
        dice4.setBorderPainted(false);
        dice4.setContentAreaFilled(false);
        dice5.setBorderPainted(false);
        dice5.setContentAreaFilled(false);
        dice6.setBorderPainted(false);
        dice6.setContentAreaFilled(false);
        exit.setBorderPainted(false);
        exit.setContentAreaFilled(false);
        chat.setBorderPainted(false);
        chat.setContentAreaFilled(false);

        showDices.addActionListener(this);
        makeBid.addActionListener(this);
        doubt.addActionListener(this);
        dice1.addActionListener(this);
        dice2.addActionListener(this);
        dice3.addActionListener(this);
        dice4.addActionListener(this);
        dice5.addActionListener(this);
        dice6.addActionListener(this);
        chat.addActionListener(this);

    }

    JPanel getPanel(){
        return panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if(src == showDices){
            JDialog jd = new JDialog();
            JPanel pane = new JPanel();
            jd.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            jd.setSize(250, 200);

            JLabel imgLabel = new JLabel(new ImageIcon("dice1.png"));
            JLabel imgLabel2 = new JLabel(new ImageIcon("dice2.png"));
            JLabel imgLabel3 = new JLabel(new ImageIcon("dice3.png"));
            JLabel imgLabel4 = new JLabel(new ImageIcon("dice4.png"));
            JLabel imgLabel5 = new JLabel(new ImageIcon("dice5.png"));
            JLabel imgLabel6 = new JLabel(new ImageIcon("dice6.png"));

            int contains[] = new int[6];
            for(int i = 0; i < 6; i++){
                contains[i] = 0;
            }

            for(int i = 0; i < dices.length; i++){
                if(dices[i] == 1){
                    if(contains[0] == 0) {
                        pane.add(imgLabel);
                        contains[0] = 1;
                    }
                    else {
                        JLabel tmp = new JLabel(new ImageIcon("dice1.png"));
                        pane.add(tmp);
                    }
                }
                if(dices[i] == 2){
                    if(contains[1] == 0) {
                        pane.add(imgLabel2);
                        contains[1] = 1;
                    }
                    else {
                        JLabel tmp = new JLabel(new ImageIcon("dice2.png"));
                        pane.add(tmp);
                    }
                }
                if(dices[i] == 3){
                    if(contains[2] == 0) {
                        pane.add(imgLabel3);
                        contains[2] = 1;
                    }
                    else {
                        JLabel tmp = new JLabel(new ImageIcon("dice3.png"));
                        pane.add(tmp);
                    }
                }
                if(dices[i] == 4){
                    if(contains[3] == 0) {
                        pane.add(imgLabel4);
                        contains[3] = 1;
                    }
                    else {
                        JLabel tmp = new JLabel(new ImageIcon("dice4.png"));
                        pane.add(tmp);
                    }
                }
                if(dices[i] == 5){
                    if(contains[4] == 0) {
                        pane.add(imgLabel5);
                        contains[4] = 1;
                    }
                    else {
                        JLabel tmp = new JLabel(new ImageIcon("dice5.png"));
                        pane.add(tmp);
                    }
                }
                if(dices[i] == 6){
                    if(contains[5] == 0) {
                        pane.add(imgLabel6);
                        contains[5] = 1;
                    }
                    else {
                        JLabel tmp = new JLabel(new ImageIcon("dice6.png"));
                        pane.add(tmp);
                    }
                }
            }

            jd.add(pane);
            jd.setVisible(true);
            jd.setLocationRelativeTo(null);
        }
        if(src == dice1){
            chosenDice = 1;

            dice6.setContentAreaFilled(false);
            dice2.setContentAreaFilled(false);
            dice3.setContentAreaFilled(false);
            dice4.setContentAreaFilled(false);
            dice5.setContentAreaFilled(false);

            dice1.setContentAreaFilled(true);
            dice1.setBackground(Color.green);
        }
        if(src == dice2){
            chosenDice = 2;

            dice1.setContentAreaFilled(false);
            dice6.setContentAreaFilled(false);
            dice3.setContentAreaFilled(false);
            dice4.setContentAreaFilled(false);
            dice5.setContentAreaFilled(false);

            dice2.setContentAreaFilled(true);
            dice2.setBackground(Color.green);
        }
        if(src == dice3){
            chosenDice = 3;

            dice1.setContentAreaFilled(false);
            dice2.setContentAreaFilled(false);
            dice6.setContentAreaFilled(false);
            dice4.setContentAreaFilled(false);
            dice5.setContentAreaFilled(false);

            dice3.setContentAreaFilled(true);
            dice3.setBackground(Color.green);
        }
        if(src == dice4){
            chosenDice = 4;

            dice1.setContentAreaFilled(false);
            dice2.setContentAreaFilled(false);
            dice3.setContentAreaFilled(false);
            dice6.setContentAreaFilled(false);
            dice5.setContentAreaFilled(false);

            dice4.setContentAreaFilled(true);
            dice4.setBackground(Color.green);
        }
        if(src == dice5){
            chosenDice = 5;

            dice1.setContentAreaFilled(false);
            dice2.setContentAreaFilled(false);
            dice3.setContentAreaFilled(false);
            dice4.setContentAreaFilled(false);
            dice6.setContentAreaFilled(false);

            dice5.setContentAreaFilled(true);
            dice5.setBackground(Color.green);
        }
        if(src == dice6) {
            chosenDice = 6;
            dice1.setContentAreaFilled(false);
            dice2.setContentAreaFilled(false);
            dice3.setContentAreaFilled(false);
            dice4.setContentAreaFilled(false);
            dice5.setContentAreaFilled(false);

            dice6.setContentAreaFilled(true);
            dice6.setBackground(Color.green);
        }
        if(src == chat){
            Chat ch = new Chat();
            ch.setLocationRelativeTo(null);
            ch.setVisible(true);

        }

    }




    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    private void createUIComponents() {
        int n = 40;
        textField1 = new JTextField(2);
        slider = new JSlider(1, n, 1);
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                textField1.setText(String.valueOf(slider.getValue()));
            }
        });

    }

    public JButton getExit() {
        return exit;
    }

}

