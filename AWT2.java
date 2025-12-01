//by creating Frame object
import java.awt.*;
public class AWT2 
{
    Frame f =new Frame();

    AWT2()
    {
        Label l = new Label("ASD");
        l.setBounds(100,100,100,100);
        Button b = new Button("Submit");
        b.setBounds(100, 180, 40, 15);

        f.add(b);
        f.add(l);
        f.setSize(400,800);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) 
    {
        AWT2 a = new AWT2();
    }
}
