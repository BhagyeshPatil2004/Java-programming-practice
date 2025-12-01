import java.awt.*;

public class AWT3 extends Frame
{
    AWT3()
    {
        Label l = new Label("Name");
        l.setBounds(80,80,60,25);

        TextField t = new TextField();
        t.setBounds(140,80,250,30);

        Label l2 = new Label("Address");
        l2.setBounds(80,125,60,25);

        TextArea ta = new TextArea();
        ta.setBounds(145,125,250,60);
        
        Button b = new Button("Submit");
        b.setBounds(200,370,100,30);

        add(l);
        add(t);
        add(l2);
        add(ta);
        add(b);

        setSize(500,500);
        setLayout(null);
        setVisible(true);
        setTitle("Demo");
    }
    public static void main(String[] args) 
    {
        AWT3 a =new AWT3();
    }
}
