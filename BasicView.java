import javax.swing.*;
import java.awt.*;

/**
 * Created by jsmithaf on 06/02/2017.
 */

//this class is for graphic objects (PLACEHOLDER for now)
public class BasicView extends JComponent{

    private GUIFrame frame;

    public BasicView(GUIFrame frame){this.frame = frame;}

    @Override
    public void paintComponent(Graphics g0) { //this is a place holder for now if we need to add and graphics objects to the frame
        Graphics2D g = (Graphics2D) g0;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // paint the background
        Color c1 = Color.darkGray;
        Color c2 = Color.black;
        GradientPaint gp = new GradientPaint(0,0,c1,getWidth(),getHeight(),c2);
        g.setPaint(gp);
        g.fillRect(0, 0, getWidth(), getHeight());



    }

}
