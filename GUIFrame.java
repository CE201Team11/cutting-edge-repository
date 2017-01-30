import javax.swing.*;
import java.awt.*;

/**
 * Created by jsmithaf on 30/01/2017.
 */
public class GUIFrame extends JFrame {

    JButton temp1, temp2, temp3, temp4;
    JPanel top,mid,bot;

    public GUIFrame(){
        top = new JPanel();
        mid = new JPanel();
        bot = new JPanel();

        temp1 = new JButton("temp button 1");
        bot.add(temp1);
        temp2 = new JButton("temp button 2");
        bot.add(temp2);
        temp3 = new JButton("temp button 3");
        bot.add(temp3);
        temp4 = new JButton("temp button 4");
        bot.add(temp4);

        temp1.addActionListener(new ButtonHandler(this, 'A'));
        temp2.addActionListener(new ButtonHandler(this, 'B'));
        temp3.addActionListener(new ButtonHandler(this, 'C'));
        temp4.addActionListener(new ButtonHandler(this, 'D'));

        add(bot, BorderLayout.SOUTH);
    }

}

//Stop... Hammertime
