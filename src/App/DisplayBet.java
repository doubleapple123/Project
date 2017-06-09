package App;

import javax.swing.*;

/**
 * Created by Leon Chen on 6/9/2017.
 */
public class DisplayBet {

    public void BasketBet(String gameNum){
        switch(gameNum) {
            case "0":{
                Run obj = new Run("Bet Window");
                JPanel betPane = new JPanel();
                JTextArea showGame = new JTextArea("Thunders at 76ers");
                betPane.add(showGame);
                obj.add(betPane);
                obj.setVisible(true);
                obj.pack();
                obj.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                break;}

            case "1": {
                Run obj = new Run("Bet Window");
                JPanel betPane = new JPanel();
                JTextArea showGame = new JTextArea("Rockets at lakers");
                betPane.add(showGame);
                obj.add(betPane);
                obj.setVisible(true);
                obj.pack();
                obj.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                break;}

            case "2": {
                Run obj = new Run("Bet Window");
                JPanel betPane = new JPanel();
                JTextArea showGame = new JTextArea("Test");
                betPane.add(showGame);
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
