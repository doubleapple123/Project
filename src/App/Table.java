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

        String [] col = {"Number","Game","Date", "Time", "Network","Spread","Expert Pick"};
        Object [][] data = {{"0","Thunder at 76ers","10/26/16","8:00 PM","ESPN","Thunder -8.5, Sixers +9.5","Thunder"}
        ,{"1","Rockets at Lakers", "10/26/16","10:30", "ESPN","Rockets -5.5, Lakers +6.5","Rockets"}
        ,{"2","Cavaliers at Raptors", "10/28/16", "7:00 PM", "ESPN","Cavaliers -2, Raptors +3.5","Raptors"}
        ,{"2","Warriors At Pelicans", "10/28/16", "9:30PM", "ESPN","Warriors -11.5, Pelicans +12.5","Raptors"}
        ,{"3","Bulls at Celtics","11/2/16","8:00 PM","ESPN","Celtics -2.5, Bulls +3.5","Celtics"}
        ,{"4","Thunder at Clippers","11/2/16","10:30 PM","ESPN","Clippers -7, Thunder +7.5","Clippers"}
        ,{"5","Knicks at Bulls","11/4/16","8:00 PM","ESPN","Bulls -7, Knicks +8","Knicks"}
        ,{"6","Warriors at Lakers",	"11/4/16","10:30 PM","ESPN","Warriors -11.5, Lakers +12.5","Warriors"}
        ,{"7","Nets at Knicks","11/9/16","7:00 PM","ESPN","Knicks -7.5, Nets +8","Knicks"}
        ,{"8","Rockets at Spurs","11/9/16","9:30 PM","ESPN","Spurs -8, Rockets +9","Spurs"}
        ,{"9","Warriors at Raptors","11/16/16","8:00 PM","ESPN","Warriors -7.5, Raptors +8","Warriors"}
        ,{"10","Grizzlies at Clippers","11/16/16","10:30 PM","ESPN","Clippers -3.5, Grizzlies +5","Grizzlies"}};

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
        String [] col = {"Number","Game","Date","Time","Network"};
        Object [][] data = {{"0","Chiefs at Patriots","9/7/17","8:30 PM","NBC"}
        ,{"1","Saints at Vikings","9/11/17","7:10 PM","ESPN"}
        ,{"2","Lions at Giants","9/18/17","8:30 PM","ESPN"}
        ,{"3","Cowboys at Cardinals","9/25/17","8:30 PM","ESPN"}
        ,{"4","Washington at Chiefs","10/2/17","8:15 PM","ESPN"}
        ,{"5","Vikings at Bears","10/9/17","8:30 PM","ESPN"}
        ,{"6","Colts at Titans","10/16/17","8:30 PM","ESPN"}
        ,{"7","Washington at Eagles","10/23/17","8:30 PM","ESPN"}
        ,{"8","Broncos at Chiefs","10/30/17","8:15 PM","ESPN"}
        ,{"9","Lions at Packers","11/6/17","8:30 PM","ESPN"}
        ,{"10","Dolphins at Panthers","11/13/17","8:30 PM","ESPN"}
        ,{"11","Falcons at SeaHawks","11/20/17","8:30 PM","ESPN"}
        ,{"12","Texans at Ravens","11/27/17","8:30 PM","ESPN"}
        ,{"13","Steelers at Bengals","12/4/17","8:30 PM","ESPN"}
        ,{"14","Patriots at Dolphins","12/11/17","8:30 PM","ESPN"}
        ,{"15","Falcons at Bucaneers","12/18/17","8:30 PM","ESPN"}
        ,{"16","Raiders at Eagles","12/25/17","8:30 PM","ESPN"}};

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
    public void DisBaseTab()
    {
        Run obj = new Run("BaseBall Table");
        String [] col = {"Number","Game","Date","Time","Network"};
        Object [][] data = {{"0","Cardinals at Reds","6/8/17","12:35 PM","MLBN"}
        ,{"1","Angels at Tigers","6/8/17","1:10 PM","MLBN"}
        ,{"2","Giants at Brewers","6/8/17","2:10 PM","MLBN-O"}
        ,{"3","Padres at DBacks","6/8/17","3:40 PM","MLBN"}
        ,{"4","Red Sox at Yankees","6/8/17","7:05 PM","ESPN"}
        ,{"5","Orioles at Nationals","6/8/17","7:05 PM","MLBN-O"}
        ,{"6","Rockies at Cubs","6/9/17","2:20 PM","MLBN-O"}
        ,{"7","Tigers at Red Sox","6/9/17","7:10 PM","MLBN-O"}
        ,{"8","Orioles at Yankees","6/9/17","7:35 PM","MLBN-O"}
        ,{"9","Rangers at Nationals","6/10/17","12:05 PM","MLBN-O"}};

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

    //not used methods
    /*public void DisBetBasketTab()
    {

    }

    public void DisBetBaseTab()
    {

    }

    public void DisBetFootTab()
    {

    }*/

    public void DisStatBasketTab()
    {
        Run obj = new Run("Basketball Stats");
        String [] col = {"Team","Projected Wins"};
        String [][] data = {{"Golden State Warriors","72"}
        ,{"Houston Rockets","56"},{"Denver Nuggets","42"}
        ,{"Cleveland Cavliers","50"},{"Washington Wizards","46"}
        ,{"LA Clippers","54"},{"Boston Celtics","47"}
        ,{"Portland Trail Blazers","48"},{"Phoenix Suns","26"}
        ,{"Toronto Raptors","53"},{"Oklahoma City Thunder","42"}
        ,{"Brooklyn Nets","23"},{"Minnesota Timberwolves","38"}
        ,{"San Antonio Spurs","57"},{"Indiana Pacers","39"}
        ,{"Charlotte Hornets","41"},{"LA Lakers","22"}
        ,{"New Orleans Pelicans","35"},{"New York Knicks","31"}
        ,{"Milwaukee Bucks","42"},{"Miami Heat","44"}
        ,{"Atlanta Hawks","38"},{"Chicago Bulls","42"}
        ,{"Sacramento Kinds","30"},{"Philadephia 76ers","26"}
        ,{"Detroit Pistons","38"},{"Orlando Magic","23"}
        ,{"Utah Jazz","50"},{"Memphis Grizzlies","42"}
        ,{"Dallas Mavericks","33"}};

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
    public void DisStatBaseTab()
    {
        Run obj = new Run("Baseball Stats");
        String [] col = {"Team","Projected Wins"};
        String [][] data ={{"CHC","111"},{"TEX","81"},{"WSN","98"},{"CLE","92"},{"BOS","99"},{"LAD","93"}
        ,{"TOR","92"},{"BAL","85"},{"SFG","91"},{"NYM","87"},{"DET","85"},{"SEA","86"},{"STL","79"},{"HOU","77"}
        ,{"NYY","79"},{"KCR","77"},{"MIA","79"},{"PIT","77"},{"CHW","79"},{"COL","79"},{"LAA","73"},{"MIL","61"}
        ,{"PHI","67"},{"ARI","68"},{"OAK","66"},{"ATL","70"},{"SDP","70"},{"TBR","75"},{"CIN","66"},{"MIN","64"}};

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
    public void DisStatFootTab()
    {
        Run obj = new Run("Football Stats");
        String [] col = {"Team","Projected Wins"};
        String [][] data= {{"Atlanta","11"},{"New Orleans","8"},{"New England","13"},{"Green Bay","9"}
        ,{"Dallas","11"},{"Arizona","9"},{"Indianapolis","8"},{"San Diego","8"}
        ,{"Oakland","8"},{"Buffalo","9"},{"Washington","8"},{"Pittsburgh","10"}
        ,{"Kansas City","10"},{"Tennessee","10"},{"Carolina","7"},{"Philadelphia","9"}
        ,{"Seattle","10"},{"Tampa Bay","8"},{"Miami","7"},{"Baltimore","9"},{"Denver","9"}
        ,{"Detroit","7"},{"Minnesota","9"},{"Cincinnati","8"},{"Jacksonville","6"}
        ,{"San Francisco","4"},{"NY Giants","8"},{"Houston","7"},{"Chicago","5"}
        ,{"NY Jets","4"},{"Cleveland","3"},{"Los Angeles","3"}};
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
