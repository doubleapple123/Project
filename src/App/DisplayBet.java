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
                        JTextArea wonField = new JTextArea("thunder by 9");
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
                JTextField betField = new JTextField();
                JTextArea showGame = new JTextArea("Rockets at Lakers, Place bet");
                betField.setPreferredSize(new Dimension(100,40));

                Action action = new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Run obj1 = new Run("Won",true);
                        JTextArea wonField = new JTextArea("Lakers by 3");
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

            case "2": {
                Run obj = new Run("Bet Window");
                JPanel betPane = new JPanel();
                JTextField betField = new JTextField();
                JTextArea showGame = new JTextArea("Cavaliers at Raptors, Place bet");
                betField.setPreferredSize(new Dimension(100,40));

                Action action = new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Run obj1 = new Run("Won",true);
                        JTextArea wonField = new JTextArea("no data");
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

            case "3":{
                Run obj = new Run("Bet Window");
                JPanel betPane = new JPanel();
                JTextField betField = new JTextField();
                JTextArea showGame = new JTextArea("Warriors at Pelicans, Place bet");
                betField.setPreferredSize(new Dimension(100,40));

                Action action = new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Run obj1 = new Run("Won",true);
                        JTextArea wonField = new JTextArea("Warriors by 22");
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

            case "4":{
                Run obj = new Run("Bet Window");
                JPanel betPane = new JPanel();
                JTextField betField = new JTextField();
                JTextArea showGame = new JTextArea("Bulls at Celtics, Place bet");
                betField.setPreferredSize(new Dimension(100,40));

                Action action = new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Run obj1 = new Run("Won",true);
                        JTextArea wonField = new JTextArea("Clippers by 5");
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

            case"5":{
                Run obj = new Run("Bet Window");
                JPanel betPane = new JPanel();
                JTextField betField = new JTextField();
                JTextArea showGame = new JTextArea("Bulls at Clippers, Place bet");
                betField.setPreferredSize(new Dimension(100,40));

                Action action = new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Run obj1 = new Run("Won",true);
                        JTextArea wonField = new JTextArea("Bulls by 3");
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

            case"6":{
                Run obj = new Run("Bet Window");
                JPanel betPane = new JPanel();
                JTextField betField = new JTextField();
                JTextArea showGame = new JTextArea("Knicks at Bulls, Place bet");
                betField.setPreferredSize(new Dimension(100,40));

                Action action = new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Run obj1 = new Run("Won",true);
                        JTextArea wonField = new JTextArea("no data");
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
                break;

            }
            case"7":{
                Run obj = new Run("Bet Window");
                JPanel betPane = new JPanel();
                JTextField betField = new JTextField();
                JTextArea showGame = new JTextArea("Warriors at Lakers, Place bet");
                betField.setPreferredSize(new Dimension(100,40));

                Action action = new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Run obj1 = new Run("Won",true);
                        JTextArea wonField = new JTextArea("Lakers by 20");
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
                break;

            }
            case"8":{
                Run obj = new Run("Bet Window");
                JPanel betPane = new JPanel();
                JTextField betField = new JTextField();
                JTextArea showGame = new JTextArea("Nets at Knicks, Place bet");
                betField.setPreferredSize(new Dimension(100,40));

                Action action = new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Run obj1 = new Run("Won",true);
                        JTextArea wonField = new JTextArea("Knicks by 9");
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
                break;

            }
            case"9":{
                Run obj = new Run("Bet Window");
                JPanel betPane = new JPanel();
                JTextField betField = new JTextField();
                JTextArea showGame = new JTextArea("Rockets at Spurs, Place bet");
                betField.setPreferredSize(new Dimension(100,40));

                Action action = new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Run obj1 = new Run("Won",true);
                        JTextArea wonField = new JTextArea("Spurs by 17");
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
                break;

            }
            case"10":{
                Run obj = new Run("Bet Window");
                JPanel betPane = new JPanel();
                JTextField betField = new JTextField();
                JTextArea showGame = new JTextArea("Warrios at Raptors");
                betField.setPreferredSize(new Dimension(100,40));

                Action action = new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Run obj1 = new Run("Won",true);
                        JTextArea wonField = new JTextArea("Warriors by 13");
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
                break;

            }
        }
    }
}
