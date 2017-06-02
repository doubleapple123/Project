package App;

import App.Run;

import javax.swing.*;
import java.awt.*;


/**
 * Created by Leon Chen on 5/26/2017.
 */
public class Table {
    public static void main(String[] args) {
        Run obj = new Run("TableTest");

        String [] col = {"Utensil","Price"};
        Object [][] data = {{"Fork", new Integer(5)}
        ,{"Pencil", new Integer(1)}};

        JTable tab = new JTable(data,col);

        JPanel pane = new JPanel();
        tab.setFillsViewportHeight(true);
        pane.setLayout(new BorderLayout());
        pane.add(tab.getTableHeader(), BorderLayout.PAGE_START);
        pane.add(tab, BorderLayout.CENTER);
        obj.add(pane);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setVisible(true);
        obj.pack();
    }
}
