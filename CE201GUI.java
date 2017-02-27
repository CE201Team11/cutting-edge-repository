import javax.swing.*;
import java.awt.*;

/**
 * Created by jsmithaf on 30/01/2017.
 */
public class CE201GUI {



    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            try {
                // 0 => "javax.swing.plaf.metal.MetalLookAndFeel"
                // 3 => the Windows Look and Feel
                String name = UIManager.getInstalledLookAndFeels()[4].getClassName();
                UIManager.setLookAndFeel(name);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            GUIFrame myFrame = new GUIFrame();

            ImageIcon img = new ImageIcon("M:\\CE201 GUI\\src\\stackoverflow-4-xxl.png");



            //myFrame.setUndecorated(true);
            myFrame.setIconImage(img.getImage());
            myFrame.setTitle("Place holder title");
            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            myFrame.getContentPane().setBackground(Color.lightGray);

            myFrame.setVisible(true);
            myFrame.setSize(800, 600);


        });
    }

}
