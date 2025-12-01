import java.awt.*;
import java.awt.event.*;
public class AWT10 extends Frame implements MouseListener
{
    Label l;
    AWT10()
    {
        addMouseListener(this);
        
        l=new Label();
        l.setBounds(20,50,100,20);
        add(l);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e)
    {
        l.setText("Mouse Clicked");
        setBackground(Color.green);

    }
    public void mouseEntered(MouseEvent e)
    {
        l.setText("Mouse Entered");
        setBackground(Color.red);
    }
    public void mouseExited(MouseEvent e)
    {
        l.setText("Mouse Exited");
        setBackground(Color.yellow);
    }
    public void mousePressed(MouseEvent e)
    {
        l.setText("Mouse Pressed");
        setBackground(Color.blue);
    }
    public void mouseReleased(MouseEvent e)
    {
        l.setText("Mouse Released");
        setBackground(Color.pink);
    }
    public static void main(String args[])
    {
        new AWT10();
    }
}
