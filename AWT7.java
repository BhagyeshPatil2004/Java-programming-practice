import java.awt.*;
import java.awt.event.*;
public class AWT7 
{
    private static Dialog d;
    AWT7()
    {
        Frame f = new Frame();
        d = new Dialog(f,"Akira",true);
        d.setLayout(new FlowLayout());
        Button b = new Button("Ok");
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                AWT7.d.setVisible(false);
            }
        });

        d.add(new Label("Click button to contine.."));
        d.add(b);
        d.setSize(300,300);
        d.setVisible(true);
    }
    public static void main(String[] args) 
    {
        new AWT7();
        
    }
}
