import javax.swing.*;
import java.awt.*;

/**
 * Created by jsmithaf on 30/01/2017.
 */
public class GUIFrame extends JFrame {

    JButton viewGraph, temp2, temp3, temp4;
    JPanel top,mid,bot;

    public GUIFrame(){
        top = new JPanel();
        top.setBackground(Color.darkGray);

        mid = new JPanel();
        mid.setBackground(Color.darkGray);

        bot = new JPanel();
        bot.setBackground(Color.darkGray);


        viewGraph = new JButton("View Graph");
        viewGraph.setBackground(Color.white);
        bot.add(viewGraph);
        temp2 = new JButton("temp button 2");
        temp2.setBackground(Color.white);
        bot.add(temp2);
        temp3 = new JButton("temp button 3");
        temp3.setBackground(Color.white);
        bot.add(temp3);
        temp4 = new JButton("temp button 4");
        temp4.setBackground(Color.white);
        bot.add(temp4);

        viewGraph.addActionListener(new ButtonHandler(this, 'A'));
        temp2.addActionListener(new ButtonHandler(this, 'B'));
        temp3.addActionListener(new ButtonHandler(this, 'C'));
        temp4.addActionListener(new ButtonHandler(this, 'D'));

        add(bot, BorderLayout.SOUTH);
    }




}
