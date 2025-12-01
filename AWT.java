//by extending Frame class
import java.awt.*;

class AWT extends Frame
{
    AWT()
    {
        Label l =new Label("Name");
        l.setBounds(100,100,100,100);
        Button b = new Button("Submit");
        b.setBounds(100, 180, 40, 15);

        add(b);
        add(l);
        setSize(400,600);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) 
    {
        AWT a = new AWT();
    }
}
