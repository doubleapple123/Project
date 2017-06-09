package App;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by Leon Chen on 6/9/2017.
 */
public class DisplayBet {

    public void BasketBet(String gameNum){
        switch(gameNum) {
            case "0":{
                Run obj = new Run("Bet Window");
                JPanel betPane = new JPanel();
                JTextField betField = new JTextField();
                JTextArea showGame = new JTextArea("Thunders at 76ers, Place bet");
                betField.setPreferredSize(new Dimension(100,40));

                Action action = new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Run obj1 = new Run("Won",true);
                        JTextArea wonField = new JTextArea("thunder win by 9");
                        JPanel wonPane = new JPanel();
                        wonPane.add(wonField);

                        obj1.add(wonPane);
                        obj1.setVisible(true);
                        obj1.pack();
                    }
                };
                betField.addActionListener(action);
                betPane.add(showGame);
                betPane.add(betField);

                obj.add(betPane);
                obj.setVisible(true);
                obj.pack();
                obj.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                break;}

            case "1": {
                Run obj = new Run("Bet Window");
                JPanel betPane = new JPanel();
                JTextArea showGame = new JTextArea("Rockets at lakers, Place bet");
                JTextField betField = new JTextField();

                betPane.add(showGame,betField);
                obj.add(betPane);
                obj.setVisible(true);
                obj.pack();
                obj.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                break;}

            case "2": {
                Run obj = new Run("Bet Window");
                JPanel betPane = new JPanel();
                JTextArea showGame = new JTextArea("Warriors at Pelicans");
                JTextField betField = new JTextField();

                betPane.add(showGame,betField);
                obj.add(betPane);
                obj.setVisible(true);
                obj.pack();
                obj.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                break;}

            case "3":{
                Run obj = new Run("Bet Window");
                JPanel betPane = new JPanel();
                JTextArea showGame = new JTextArea("Test");
                betPane.add(showGame);
                obj.add(betPane);
                obj.setVisible(true);
                obj.pack();
                obj.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                break;}
        }
    }
}
