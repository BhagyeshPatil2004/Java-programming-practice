import java.awt.*;
import java.awt.event.*;
public class AWT11 extends Frame implements MouseMotionListener
{
    AWT11()
    {
        addMouseMotionListener(this);

        setSize(800,400);
        setLayout(null);
        setVisible(true);
    }
    public void mouseDragged(MouseEvent e)
    {
        Graphics g = getGraphics();
        g.setColor(new Color(148,0,211));
        g.fillOval(e.getX(),e.getY(),10,10);
    }
    public void mouseMoved(MouseEvent e) {}

    public static void main(String[] args)
    {
        new AWT11();
    }
}
