package App;

import javax.swing.*;


/**
 * Created by chenl9645 on 5/12/2017.
 */
public class Run extends JFrame {
    public Run(){
        super("Default");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public Run(String title){
        super(title);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public Run(String title, Boolean isTrue){
        super(title);
        if(isTrue == true){
            super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
