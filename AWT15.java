import java.awt.*;    
import java.awt.event.*;    
  
public class AWT15 extends WindowAdapter {    
    Frame f;    
    AWT15() {    
        f = new Frame();    
        f.addWindowListener (this);    
        
        f.setSize (400, 400);    
        f.setLayout (null);    
        f.setVisible (true);    
    }    
  
public void windowClosing (WindowEvent e) {    
    f.dispose();    
}    
public static void main(String[] args) {    
    new AWT15();    
}    
}