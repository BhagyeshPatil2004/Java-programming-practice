import java.awt.*;
import java.awt.event.*;

public class AWT12 implements ItemListener
{
    Checkbox checkbox1,checkbox2;
    Label label;
    AWT12()
    {
        Frame f = new Frame("CheckBox");
        label = new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(400,100);
        checkbox1 = new Checkbox("Mr.Nice");
        checkbox1.setBounds(100,100,55,50);
        checkbox2 = new Checkbox("Mr.Bad");
        checkbox2.setBounds(100,150,50,50);

        f.add(checkbox1);
        f.add(checkbox2);
        f.add(label);
        checkbox1.addItemListener(this);
        checkbox2.addItemListener(this);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void itemStateChanged(ItemEvent e)
    {
        if(e.getSource()==checkbox1)
            label.setText("Mr.Nice Checkbox:" + (e.getStateChange()==1?"checked":"unchecked"));
        if (e.getSource()==checkbox2)
            label.setText("Mr.Bad Checkbox:" + (e.getStateChange()==1?"checked":"unchecked"));
    }
    public static void main(String[] args) 
    {
        new AWT12();    
    }
}
