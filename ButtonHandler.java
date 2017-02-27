import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by jsmithaf on 30/01/2017.
 */
public class ButtonHandler implements ActionListener {
    GUIFrame theApp;
    char choice;

    ButtonHandler(GUIFrame app, char c){
        theApp = app;
        choice = c;
    }

    @Override
    public void actionPerformed(ActionEvent e){

        switch (choice){

            case 'A':
                //String test = JOptionPane.showInputDialog("Button 1");
                GUIGraph graphFrame = new GUIGraph();
                graphFrame.setTitle("Graph Frame");
                graphFrame.getContentPane().setBackground(Color.lightGray );

                graphFrame.setVisible(true);
                graphFrame.setSize(800,600);
                break;
            case 'B':
                String test2 = JOptionPane.showInputDialog("Button 2");
                break;
            case 'C':
                String test3 = JOptionPane.showInputDialog("Button 3");
                break;
            case 'D':
                String test4 = JOptionPane.showInputDialog("Button 4");
                break;

        }
    }
}
