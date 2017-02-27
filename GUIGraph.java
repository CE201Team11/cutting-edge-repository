import javax.swing.*;
import java.awt.*;

/**
 * Created by jsmithaf on 06/02/2017.
 */
public class GUIGraph extends JFrame {

    JButton temp1, temp2, temp3, temp4;
    JPanel top,mid,bot;
    JLabel graphDisp;



    public GUIGraph(){
        top = new JPanel();
        top.setBackground(Color.darkGray);

        mid = new JPanel();
        mid.setBackground(Color.lightGray);

        bot = new JPanel();
        bot.setBackground(Color.darkGray);


        temp1 = new JButton("temp button 1");
        bot.add(temp1);
        temp1.setBackground(Color.white);
        temp2 = new JButton("temp button 2");
        bot.add(temp2);
        temp3 = new JButton("temp button 3");
        bot.add(temp3);
        temp4 = new JButton("temp button 4");
        bot.add(temp4);

        graphDisp = new JLabel("Place Holder");
        mid.add(graphDisp);


        add(mid, BorderLayout.CENTER);
        add(bot, BorderLayout.SOUTH);
    }
}
