import javax.swing.*;
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
                String test = JOptionPane.showInputDialog("Button 1");
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
