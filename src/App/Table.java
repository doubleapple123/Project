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

        String [] col = {"Number","Game","Date", "Time", "Network"};
        Object [][] data = {{"0","Thunder at 76ers","10/26/16","8:00 PM","ESPN"}
        ,{"1","Rockets at Lakers", "10/26/16","10:30", "ESPN"}
        ,{"2","Cavaliers at Raptors", "10/28/16", "7:00 PM", "ESPN"}
        ,{"2","Warriors At Pelican", "10/28/16", "9:30PM", "ESPN"}
        ,{"3","Bulls at Celtics","11/2/16","8:00 PM","ESPN"}
        ,{"4","Thunder at Clippers","11/2/16","10:30 PM","ESPN"}
        ,{"5","Knicks at Bulls","11/4/16","8:00 PM","ESPN"}
        ,{"6","Warriors at Lakers",	"11/4/16","10:30 PM","ESPN"}
        ,{"7","Nets at Knicks","11/9/16","7:00 PM","ESPN"}
        ,{"8","Rockets at Spurs","11/9/16","9:30 PM","ESPN"}};

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
        Object [][] data = {{"Chiefs at Patriots","9/7/17","8:30 PM","NBC"}
        ,{"Saints at Vikings","9/11/17","7:10 PM",}
        ,{"Lions at Giants","9/18/17","8:30 PM","ESPN"}
        ,{"Cowboys at Cardinals","9/25/17","8:30 PM","ESPN"}
        ,{"Washington at Chiefs","10/2/17","8:15 PM","ESPN"}
        ,{"Vikings at Bears","10/9/17","8:30 PM","ESPN"}
        ,{"Colts at Titans","10/16/17","8:30 PM","ESPN"}
        ,{"Washington at Eagles","10/23/17","8:30 PM","ESPN"}
        ,{"Broncos at Chiefs","10/30/17","8:15 PM","ESPN"}
        ,{"Lions at Packers","11/6/17","8:30 PM","ESPN"}
        ,{"Dolphins at Panthers","11/13/17","8:30 PM","ESPN"}
        ,{"Falcons at SeaHawks","11/20/17","8:30 PM","ESPN"}
        ,{"Texans at Ravens","11/27/17","8:30 PM","ESPN"}
        ,{"Steelers at Bengals","12/4/17","8:30 PM","ESPN"}
        ,{"Patriots at Dolphins","12/11/17","8:30 PM","ESPN"}
        ,{"Falcons at Bucaneers","12/18/17","8:30 PM","ESPN"}
        ,{"Raiders at Eagles","12/25/17","8:30 PM","ESPN"}};

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
        ,{"Angels at Tigers","6/8/17","1:10 PM","MLBN"}
        ,{"Giants at Brewers","6/8/17","2:10 PM","MLBN-O"}
        ,{"Padres at DBacks","6/8/17","3:40 PM","MLBN"}
        ,{"Red Sox at Yankees","6/8/17","7:05 PM","ESPN"}
        ,{"Orioles at Nationals","6/8/17","7:05 PM","MLBN-O"}
        ,{"Rockies at Cubs","6/9/17","2:20 PM","MLBN-O"}
        ,{"Tigers at Red Sox","6/9/17","7:10 PM","MLBN-O"}
        ,{"Orioles at Yankees","6/9/17","7:35 PM","MLBN-O"}
        ,{"Rangers at Nationals","6/10/17","12:05 PM","MLBN-O"}};

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
