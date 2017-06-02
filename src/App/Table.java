package App;

import javax.swing.*;

import java.awt.*;

//https://stackoverflow.com/questions/13833688/adding-jbutton-to-jtable
/**
 * Created by Leon Chen on 5/26/2017.
 */
public class Table{
    public static void DisBasketTab(){
        Run obj = new Run("TableTest");

        String [] col = {"Game","Date", "Time", "Network"};
        Object [][] data = {{"Thunder at 76ers","10/26/16","8:00 PM","ESPN"}
        ,{"Rockets at Lakers", "10/26/16","10:30", "ESPN"}, {"Cavaliers at Raptors", "10/28/16", "7:00 PM", "ESPN"}};

        JTable tab = new JTable(data,col);

        JPanel pane = new JPanel();

        tab.setFillsViewportHeight(true);
        pane.setLayout(new BorderLayout());
        pane.add(tab.getTableHeader(), BorderLayout.PAGE_START);
        pane.add(tab, BorderLayout.CENTER);
        obj.add(pane);
        obj.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        obj.setVisible(true);

        obj.pack();
    }
    public static void DisFootTab(){
        //Shows football table
    }
    public static void DisBaseTab(){
        //Shows Baseball table
    }
}
