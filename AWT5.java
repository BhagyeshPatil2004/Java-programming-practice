import java.awt.*;

class AWT5 extends Frame
{
    AWT5()
    {
        MenuBar mb =new MenuBar();
        Menu m = new Menu("File");

        MenuItem i1 = new MenuItem("Save");
        MenuItem i2 = new MenuItem("New");
        MenuItem i3 = new MenuItem("SaveAs");

        Menu subMenu = new Menu("Edit");
        MenuItem i4 = new MenuItem("Crop");
        MenuItem i5 = new MenuItem("Rename");

        m.add(i1);
        m.add(i2);
        m.add(i3);

        subMenu.add(i4);
        subMenu.add(i5);

        m.add(subMenu);
        mb.add(m);

        setBackground(Color.green);
        setMenuBar(mb);
        setSize(555,777);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        AWT5 a = new AWT5();
    }
}
