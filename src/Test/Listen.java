package Test;

import App.Run;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by chenl9645 on 5/12/2017.
 */
public class Listen extends Run {
    public static void main(String[] args) {
        JFrame frame = new JFrame("");
        JPanel pane = new JPanel();
        Action action = new AbstractAction()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("some action");
            }
        };

        JTextField textField = new JTextField(10);
        textField.addActionListener( action );

        pane.add(textField);
        frame.add(pane);
        frame.setVisible(true);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
