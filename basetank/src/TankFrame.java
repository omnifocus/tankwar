import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame extends Frame {
    int x = 10,y=10,w=50,h=50;
    public TankFrame() {
        setResizable(false);
        setSize(800,600);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
               System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
       g.fillRect(x,y,w,h);
       x += 10;
       y += 10;
    }



}
