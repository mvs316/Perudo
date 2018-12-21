package org.suai.perudo.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class Menu implements ActionListener, MouseListener {
    private JFrame frame;
    private JButton btn1;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JPanel panel;
    private GridBagConstraints cst;
    private JOptionPane msg;
    private GameWindow window;
    private JPanel gameWindow;
    private  JButton exit1;
    private JPanel log;
    private Login login;
    private JButton exitLog;
    private JButton exitType;
    private GameType type;
    private JPanel type1;
    private JButton logButton;
    private JButton regButton;
    private JButton offlButton;

    private connectLocal connLC;
    private JButton exitConnLC;
    private JButton join;
    private JPanel connPane;

    private Connect connGame;
    private JPanel conn;
    private JComboBox parties;
    private JButton exitConn;

    private JButton newGameButton;
    private JButton connect;
    private JButton exitNEWGAME;

    private GameType typeOFF;
    private JPanel typeLC;
    private JButton newGameButton1;
    private JButton connect1;
    private JButton exitNEWGAME1;

    private NewLocalGame lcParty;
    private JPanel lcGame;
    private JButton exitLC;
    private JButton createLoc;

    private JPanel newGame;
    private NewGame newParty;
    private JButton create;

    public Menu(){

        connLC = new connectLocal();
        connPane = connLC.getPanel();
        exitConnLC = connLC.getButton1();
        exitConnLC.addActionListener(this);
        join = connLC.getJOINButton();
        join.addActionListener(this);

        connGame = new Connect();
        conn = connGame.getPanel();
        parties = connGame.getComboBox1();
        exitConn = connGame.getButton1();
        parties.addActionListener(this);
        exitConn.addActionListener(this);

        typeOFF = new GameType();
        typeLC = typeOFF.getPanel();
        newGameButton1 = typeOFF.getNEWGAMEButton();
        connect1 = typeOFF.getCONNECTTOSERVERButton();
        exitNEWGAME1 = typeOFF.getExit();
        typeLC.setVisible(false);
        newGameButton1.addActionListener(this);
        connect1.addActionListener(this);
        exitNEWGAME1.addActionListener(this);

        lcParty = new NewLocalGame();
        lcGame = lcParty.getPanel();
        lcGame.setVisible(false);
        createLoc = lcParty.getCREATEGAMEButton();
        exitLC = lcParty.getButton1();
        createLoc.addActionListener(this);
        exitLC.addActionListener(this);

        newParty = new NewGame();
        newGame = newParty.getPanel();
        newGame.setVisible(false);
        create = newParty.getCREATEGAMEButton();
        create.addActionListener(this);
        exitNEWGAME = newParty.getButton1();
        exitNEWGAME.addActionListener(this);

        type = new GameType();
        type1 = type.getPanel();
        type1.setVisible(false);
        exitType = type.getExit();
        exitType.addActionListener(this);
        newGameButton = type.getNEWGAMEButton();
        connect = type.getCONNECTTOSERVERButton();
        newGameButton.addActionListener(this);
        connect.addActionListener(this);

        window = new GameWindow();
        gameWindow = window.getPanel();
        gameWindow.setVisible(false);
        exit1 = window.getExit();

        login = new Login();
        log = login.getPanel();
        log.setVisible(false);
        exitLog = login.getExit();
        exitLog.addActionListener(this);
        logButton = login.getLoginButton();
        regButton = login.getREGISTERButton();
        offlButton = login.getSTAYOFFLINEButton();
        logButton.addActionListener(this);
        offlButton.addActionListener(this);
        regButton.addActionListener(this);

        exit1.addActionListener(this);
        frame = new JFrame("Perudo game");
        msg = new JOptionPane();
        btn1 = new JButton("Login");
        btn3 = new JButton("Rules");
        btn4 = new JButton("Authors");
        btn5 = new JButton("Quit");

        btn1.setForeground(Color.RED);
        btn3.setForeground(Color.RED);
        btn4.setForeground(Color.RED);
        btn5.setForeground(Color.RED);

        btn1.setBorderPainted(false);
        btn3.setBorderPainted(false);
        btn4.setBorderPainted(false);
        btn5.setBorderPainted(false);
        btn1.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);

        btn1.setFont(new Font("Serif", Font.PLAIN, 30));
        btn1.setContentAreaFilled(false);
        btn3.setFont(new Font("Serif", Font.PLAIN, 30));
        btn3.setContentAreaFilled(false);
        btn4.setContentAreaFilled(false);
        btn4.setFont(new Font("Serif", Font.PLAIN, 30));
        btn5.setFont(new Font("Serif", Font.PLAIN, 30));
        btn5.setContentAreaFilled(false);


        panel = new JPanel(new GridBagLayout());
        cst = new GridBagConstraints();

        cst.fill = GridBagConstraints.VERTICAL;
        cst.gridwidth = 3;
        cst.gridx = 0;
        cst.gridy = 0;
        panel.add(btn1,cst);

        cst.gridx = 0;
        cst.gridy = 2;
        panel.add(btn3, cst);

        cst.fill = GridBagConstraints.VERTICAL;
        cst.gridwidth = 3;
        cst.gridx = 0;
        cst.gridy = 3;
        panel.add(btn4,cst);

        cst.fill = GridBagConstraints.VERTICAL;
        cst.gridx = 2;
        cst.gridwidth = 1;
        cst.gridy = 4;

        panel.add(btn5,cst);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.getContentPane().add(panel);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    }
    @Override
    public void actionPerformed(ActionEvent evt)
    {
        Object src = evt.getSource();
        if(src == newGameButton){
            type1.setVisible(false);
            newGame.setVisible(true);
            frame.add(newGame);
            frame.setSize(200, 200);

        }
        if(src == exitNEWGAME){
            type1.setVisible(true);
            newGame.setVisible(false);
            frame.add(type1);
            frame.setSize(200, 200);
        }
        if(src == create){
            newGame.setVisible(false);
            gameWindow.setVisible(true);
            frame.add(gameWindow);
            frame.setSize(900 , 900);
        }

        if(src == connect){
            conn.setVisible(true);
            type1.setVisible(false);
            frame.add(conn);
            frame.setSize(400, 400);
        }
        if(src == connect1){
            connPane.setVisible(true);
            typeLC.setVisible(false);
            frame.add(connPane);
            frame.setSize(400, 400);
        }
        if(src == exitConnLC){
            connPane.setVisible(false);
            typeLC.setVisible(true);
            frame.add(connPane);
            frame.setSize(200, 200);
        }
        if(src == join){
            connPane.setVisible(false);
            gameWindow.setVisible(true);
            frame.add(gameWindow);
            frame.setSize(900 , 900);
        }
        if(src == exitConn){
            type1.setVisible(true);
            conn.setVisible(false);
            frame.add(type1);
            frame.setSize(200, 200);
        }
        if(src == offlButton){
            log.setVisible(false);
            typeLC.setVisible(true);
            frame.add(typeLC);
            frame.setSize(200, 200);
        }

        if(src == newGameButton1){
            typeLC.setVisible(false);
            lcGame.setVisible(true);
            frame.add(lcGame);
            frame.setSize(200, 200);
        }
        if(src == exitNEWGAME1){
            typeLC.setVisible(false);
            log.setVisible(true);
            frame.add(log);
            frame.setSize(400 , 400);
        }
        if(src == exitLC){
            lcGame.setVisible(false);
            typeLC.setVisible(true);
            frame.add(typeLC);
            frame.setSize(200, 200);
        }
        if(src == regButton){
            log.setVisible(false);
            type1.setVisible(true);
            frame.add(type1);
            frame.setSize(200, 200);
        }
        if(src == createLoc){
            lcGame.setVisible(false);
            gameWindow.setVisible(true);
            frame.add(gameWindow);
            frame.setSize(900 , 900);
        }
        if(src == logButton){
            log.setVisible(false);
            type1.setVisible(true);
            frame.add(type1);
            frame.setSize(200, 200);
        }

        if(src == exitType){
            type1.setVisible(false);
            log.setVisible(true);
            frame.add(log);
            frame.setSize(400, 400);
        }

        if (src == btn5)
        {
            System.exit(0);

        }
        if (src == btn3)
        {
            msg.showMessageDialog(frame, "Each player starts having five dice.\n" +
                    "Then the players shake their dice, and then each player looks at their own dice, keeping them dice concealed from other players. \n" +
                    "Then, the first player makes a bid about how many dice of a certain value are showing among all players, at a minimum. \n" +
                    "Aces (dice showing a one) are wild, meaning that they count as every number.\nThe player challenges the next player (moving clockwise) to raise the bid or call dudo to end the round.\n" +
                    "\n" +
                    "Raise\n" +
                    "Also known as \"bid\" in most versions, a player can increase the quantity of dice (e.g. from \"five threes\" to \"six threes\") or the die number (e.g. \"five threes\" to \"five sixes\") or both." +
                    "\n" +
                    "If a player increases the quantity, they can choose any number e.g. a bid may increase from \"five threes\" to \"six twos.\n\n" +
                    "Bidding aces\n" +
                    "A player who wishes to bid aces can halve the quantity of dice, rounding upwards.\nIf the current bid is aces, the next player can call dudo or increase the quantity.\n" +
                    "Also player can bid a different number, in which case the lower bound on the quantity is one more than double the previous quantity.\n\n" +
                    "Call\n" +
                    "Also known as dudo, if the player calls, it means that they do not believe the previous bid was correct.\nThe dice are shown and, if the guess is not correct, the previous player (the player who made the bid) loses a die.\nIf it is correct, the player who called loses a die. A player with no dice remaining is eliminated from the game.\nAfter calling, a new round starts with the player that lost a die making the first bid, or (if that player was eliminated) the player to that player's left.\n\n" +
                    "Spot On\n" +
                    "Also known as \"calza\" in some versions, if the number is higher or lower, the player loses to the previous bidder, but if they are correct, they win.\nA \"spot-on\" claim typically has a lower chance of being correct than a challenge, so a correct \"spot on\" call sometimes has a greater reward, such as the player regaining a previously lost die.\nThe Spot On call can only be made by a player who is not the caller.\n" +
                    "When a player first reaches one die (i.e. loses a round and goes from two dice to one), a Palifico round is played.\nDuring this round, the player makes an opening bid and their choice of die number cannot be changed. Aces are not wild during the round.\n" +
                    "\n" +
                    "The game ends when only one player has dice remaining; that player is the winner. ", "Perudo game - Rules", 1);
        }
        if (src == btn4)
        {
            msg.showMessageDialog(frame, " Vladimir Markovskiy \n Dmitriy Zykov\n\n 2018 SUAI", "Perudo game - Authors", 1);
        }
        if(src == btn1){
            log.setVisible(true);
            panel.setVisible(false);
            frame.add(log);
            frame.setSize(400, 400);
        }
        if(src == exit1){
            gameWindow.setVisible(false);
            panel.setVisible(true);
            frame.add(panel);
            frame.setSize(500, 500);
        }
        if(src == exitLog){
            log.setVisible(false);
            panel.setVisible(true);
            frame.add(panel);
            frame.setSize(500, 500);
        }

    }
    @Override
    public void mousePressed(MouseEvent evt)
    {

    }
    @Override
    public void mouseReleased(MouseEvent evt)
    {

    }
    @Override
    public void mouseClicked(MouseEvent evt)
    {

    }
    @Override
    public void mouseEntered(MouseEvent evt)
    {

    }
    @Override
    public void mouseExited(MouseEvent evt)
    {

    }

}