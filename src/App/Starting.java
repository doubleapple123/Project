package App;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by chenl9645 on 5/16/2017.
 */
public class Starting extends Run {

    public static void main(String[] args) {

        //create needed frame objects
        DisplayBet betObj = new DisplayBet();
        Starting objMain = new Starting();
        Table objT = new Table();
        Run obj = new Run("Window");
        JPanel pane = new JPanel();

        JButton basketball = new JButton("Basketball");
        JButton football = new JButton("Football");
        JButton baseball = new JButton("Baseball");
        JButton BetBasketball = new JButton("BetBasketball");
        JButton BetFootball = new JButton("BetFootball");
        JButton BetBaseball = new JButton("BetBaseball");
        JButton StatBasket= new JButton("Basketball Statistics");
        JButton StatBase= new JButton("Baseball Statistics");
        JButton StatFoot= new JButton("Football Statistics");


        basketball.setPreferredSize(new Dimension(150,50));
        football.setPreferredSize(new Dimension(150,50));
        baseball.setPreferredSize(new Dimension(150,50));
        BetBasketball.setPreferredSize(new Dimension(250,60));
        BetFootball.setPreferredSize(new Dimension(250,60));
        BetBaseball.setPreferredSize(new Dimension(250,60));
        StatBasket.setPreferredSize(new Dimension(150,50));
        StatBase.setPreferredSize(new Dimension(150,50));
        StatFoot.setPreferredSize(new Dimension(150,50));


        basketball.setBackground(Color.WHITE);
        football.setBackground(Color.WHITE);
        baseball.setBackground(Color.WHITE);

        //does stuff when buttons are clicked
        basketball.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                objT.DisBasketTab();

            }
        });
        football.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                objT.DisFootTab();

            }
        });
        baseball.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                objT.DisBaseTab();

            }
        });

        //Bet buttons

        BetBasketball.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Run textFrameB = new Run("Betting");
                JPanel textPane = new JPanel();
                JTextField betField = new JTextField();
                JTextArea betArea = new JTextArea();
                betArea.setText("Input the game number");
                betField.setPreferredSize(new Dimension(100,40));

                textPane.add(betArea);
                textPane.add(betField);
                Action action = new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                       betObj.BasketBet(betField.getText());

                    }
                };
                betField.addActionListener(action);
                textFrameB.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                textFrameB.add(textPane);
                textFrameB.setSize(400,100);
                textFrameB.setVisible(true);
            }
        });
        BetBaseball.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        BetFootball.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        //Stat buttons

        StatBasket.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                objT.DisStatBasketTab();
            }
        });
        StatBase.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                objT.DisStatBaseTab();
            }
        });
        StatFoot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                objT.DisStatFootTab();
            }
        });


        //adds buttons to panel
        pane.add(basketball);
        pane.add(football);
        pane.add(baseball);
        pane.add(BetBasketball);
        pane.add(BetBaseball);
        pane.add(BetFootball);
        pane.add(StatBasket);
        pane.add(StatBase);
        pane.add(StatFoot);
        pane.setBackground(Color.DARK_GRAY);

        //adds panel to frame
        obj.add(pane);
        obj.setVisible(true);
        obj.pack();
        obj.setLocationRelativeTo(null);
    }
}
