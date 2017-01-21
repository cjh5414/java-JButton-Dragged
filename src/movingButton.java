/**
 * Created by jihun on 2017. 1. 18..
 */
import javax.swing.*;
import java.awt.event.*;

public class movingButton extends JFrame{

    private JButton button ;

    private movingButton ()
    {
        super("Position helper");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(500,520);
        super.setVisible(true);
        super.setLayout(null);
        button = new JButton ("drag me ");
        add(button);
        button.setBounds(100, 100, 150, 40);
        button.addMouseMotionListener(new MouseAdapter(){

            public void mouseDragged(MouseEvent E)
            {
                int X=E.getX()+button.getX();
                int Y=E.getY()+button.getY();
                button.setBounds(X,Y,150,40);
            }
        });
    }

    public static void main (String x[])
    {
        new movingButton();
    }
}