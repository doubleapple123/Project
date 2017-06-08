package App;

import javax.swing.*;
import java.awt.*;

//https://stackoverflow.com/questions/13833688/adding-jbutton-to-jtable
/**
 * Created by Leon Chen on 5/26/2017.
 */
public class Table{
    public void DisBasketTab(){
        Run obj = new Run("BasketBall Table");

        String [] col = {"Game","Date", "Time", "Network"};
        Object [][] data = {{"Thunder at 76ers","10/26/16","8:00 PM","ESPN"}
        ,{"Rockets at Lakers", "10/26/16","10:30", "ESPN"}
        ,{"Cavaliers at Raptors", "10/28/16", "7:00 PM", "ESPN"}
        ,{"Warriors At Pelican", "10/28/16", "9:30PM", "ESPN"}
        ,{"Bulls at Celtics","11/2/16","8:00 PM","ESPN"}
        ,{"Thunder at Clippers","11/2/16","10:30 PM","ESPN"}
        ,{"Knicks at Bulls","11/4/16","8:00 PM","ESPN"}
        ,{"Warriors at Lakers",	"11/4/16","10:30 PM","ESPN"}
        ,{"Nets at Knicks","11/9/16","7:00 PM","ESPN"}
        ,{"Rockets at Spurs","11/9/16","9:30 PM","ESPN"}};

        JTable tab = new JTable(data,col);

        JPanel pane = new JPanel();

        tab.setFillsViewportHeight(true);

        pane.setBackground(Color.DARK_GRAY);
        pane.setLayout(new BorderLayout());
        pane.add(tab.getTableHeader(), BorderLayout.PAGE_START);
        pane.add(tab, BorderLayout.CENTER);

        obj.add(pane);
        obj.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        obj.setVisible(true);
        obj.pack();
    }
    public void DisFootTab(){
        Run obj = new Run("FootBall Table");
        String [] col = {"Game","Date","Time","Network"};
        Object [][] data = {};

        JTable tab = new JTable(data,col);

        JPanel pane = new JPanel();

        tab.setFillsViewportHeight(true);

        pane.setBackground(Color.DARK_GRAY);
        pane.setLayout(new BorderLayout());
        pane.add(tab.getTableHeader(), BorderLayout.PAGE_START);
        pane.add(tab, BorderLayout.CENTER);

        obj.add(pane);
        obj.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        obj.setVisible(true);
        obj.pack();
    }
    public void DisBaseTab(){
        Run obj = new Run("BaseBall Table");
        String [] col = {"Game","Date","Time","Network"};
        Object [][] data = {{"Cardinals at Reds","6/8/17","12:35 PM","MLBN"}
        ,{"Angels at Tigers","6/8/17","1:10 PM","MLBN"},{"Giants at Brewers","6/8/17","2:10 PM","MLBN-O"}
        ,{"Padres at DBacks","6/8/17","3:40 PM","MLBN"},{"Red Sox at Yankees","7:05 PM","ESPN"},
                {"Orioles at Nationals","6/8/17","7:05 PM","MLBN-O"},{"Rockies at Cubs","6/9/17","2:20 PM","MLBN-O"},
                {"Tigers at Red Sox","6/9/17","7:10 PM","MLBN-O"},{"Orioles at Yankees","6/9/17","7:35 PM","MLBN-O"},
                {"Rangers at Nationals","6/10/17","12:05 PM","MLBN-O"}};

        JTable tab = new JTable(data,col);

        JPanel pane = new JPanel();

        tab.setFillsViewportHeight(true);

        pane.setBackground(Color.DARK_GRAY);
        pane.setLayout(new BorderLayout());
        pane.add(tab.getTableHeader(), BorderLayout.PAGE_START);
        pane.add(tab, BorderLayout.CENTER);

        obj.add(pane);
        obj.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        obj.setVisible(true);
        obj.pack();
    }
}
