package Building;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by Leon Chen on 5/18/2017.
 */
public class Starting extends Run {

    public static void main(String[] args) {
        Run obj = new Run("Window");
        JButton button1 = new JButton("Basketball");
        JButton button2 = new JButton("Football");
        JButton button3 = new JButton("Boxing");
        JPanel pane = new JPanel();

        button1.setPreferredSize(new Dimension(150,50));
        button2.setPreferredSize(new Dimension(150,50));
        button3.setPreferredSize(new Dimension(150,50));

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Run obj1 = new Run("New Window");
                obj1.setDefaultCloseOperation(EXIT_ON_CLOSE);
                obj1.setSize(640,640);
                obj1.setVisible(true);

            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Run obj2 = new Run("New Window");
                obj2.setDefaultCloseOperation(EXIT_ON_CLOSE);
                obj2.setSize(640,640);
                obj2.setVisible(true);

            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Run obj3 = new Run("New Window");
                obj3.setDefaultCloseOperation(EXIT_ON_CLOSE);
                obj3.setSize(640,640);
                obj3.setVisible(true);

            }
        });
        JPanel pane1 = new JPanel();
        pane1.setLayout(new BorderLayout());
        for(int x = 0; x < 10; x++){
            JTextField text = new JTextField();
            text.setPreferredSize(new Dimension(70,30));
            pane1.add(text);
        }
        pane.add(button1);
        pane.add(button2);
        pane.add(button3);

        obj.add(pane1, BorderLayout.SOUTH);
        obj.add(pane, BorderLayout.NORTH);
        obj.setVisible(true);
        obj.setSize(640, 500);
        obj.setLocationRelativeTo(null);

    }
}
