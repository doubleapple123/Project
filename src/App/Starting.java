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


        Run obj = new Run("Window");
        JButton basketball = new JButton("Basketball");
        JButton football = new JButton("Football");
        JButton boxing = new JButton("Boxing");
        JPanel pane = new JPanel();

        basketball.setPreferredSize(new Dimension(150,50));
        football.setPreferredSize(new Dimension(150,50));
        boxing.setPreferredSize(new Dimension(150,50));

        basketball.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Run obj1 = new Run("BasketBall");
                obj1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                obj1.setSize(640,640);
                obj1.setVisible(true);

            }
        });
        football.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Run obj2 = new Run("FootBall");
                obj2.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                obj2.setSize(640,640);
                obj2.setVisible(true);

            }
        });
        boxing.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Run obj3 = new Run("BaseBall");
                obj3.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                obj3.setSize(640,640);
                obj3.setVisible(true);

            }
        });
        /*JPanel pane1 = new JPanel();
        pane1.setLayout(new BorderLayout());
        for(int x = 0; x < 10; x++){
            JTextField text = new JTextField();
            text.setPreferredSize(new Dimension(70,30));
            pane1.add(text);
        }*/
        pane.add(basketball);
        pane.add(football);
        pane.add(boxing);

        //obj.add(pane1, BorderLayout.SOUTH);
        //obj.add(pane, BorderLayout.NORTH);
        obj.add(pane);
        obj.setVisible(true);
        obj.setSize(640, 500);
        obj.setLocationRelativeTo(null);

    }
}
