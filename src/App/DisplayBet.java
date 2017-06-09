package App;

import javax.swing.*;

/**
 * Created by Leon Chen on 6/9/2017.
 */
public class DisplayBet {

    public void BasketBet(String gameNum){
        if(gameNum.equals("1")){
            Run obj = new Run("Bet Window");
            JPanel betPane = new JPanel();
            JTextArea showGame = new JTextArea("Test");
            betPane.add(showGame);
            obj.add(betPane);
            obj.setVisible(true);
            obj.pack();
            obj.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
        else if(gameNum.equals("2")){
            Run obj = new Run("Bet Window");
            JPanel betPane = new JPanel();
            JTextArea showGame = new JTextArea("Test");
            betPane.add(showGame);
            obj.add(betPane);
            obj.setVisible(true);
            obj.pack();
            obj.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
        else if(gameNum.equals("3")){
            Run obj = new Run("Bet Window");
            JPanel betPane = new JPanel();
            JTextArea showGame = new JTextArea("Test");
            betPane.add(showGame);
            obj.add(betPane);
            obj.setVisible(true);
            obj.pack();
            obj.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
        else if(gameNum.equals("4")){

        }
    }
}
