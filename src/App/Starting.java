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
        Table objT = new Table();
        Run obj = new Run("Window");
        JButton basketball = new JButton("Basketball");
        JButton football = new JButton("Football");
        JButton boxing = new JButton("Boxing");
        JPanel pane = new JPanel();

        basketball.setPreferredSize(new Dimension(150,50));
        football.setPreferredSize(new Dimension(150,50));
        boxing.setPreferredSize(new Dimension(150,50));

        basketball.setBackground(Color.WHITE);
        football.setBackground(Color.WHITE);
        boxing.setBackground(Color.WHITE);

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
        boxing.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                objT.DisBaseTab();

            }
        });


        //adds buttons to panel
        pane.add(basketball);
        pane.add(football);
        pane.add(boxing);
        pane.setBackground(Color.DARK_GRAY);

        //adds panel to frame
        obj.add(pane);
        obj.setVisible(true);
        obj.pack();
        obj.setLocationRelativeTo(null);
    }
}
