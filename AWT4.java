import java.awt.*;

class AWT4 extends Frame {

    AWT4() {
        Label l = new Label("Name:");  // Name.......
        l.setBounds(50, 80, 100, 25);

        TextField t = new TextField();
        t.setBounds(140, 80, 250, 30);

        Label l2 = new Label("Address: ");  // Address.....
        l2.setBounds(50, 125, 100, 25);

        TextArea ta = new TextArea();
        ta.setBounds(140, 125, 250, 60);

        Label l3 = new Label("Language:");  // Language.......
        l3.setBounds(50, 230, 100, 25);

        Checkbox cb1 = new Checkbox("Java");
        cb1.setBounds(200, 230, 150, 50);

        Checkbox cb2 = new Checkbox("Python");
        cb2.setBounds(250, 230, 150, 50);

        Checkbox cb3 = new Checkbox("C");
        cb3.setBounds(300, 230, 150, 50);

        Checkbox cb4 = new Checkbox("CPP");
        cb4.setBounds(350, 230, 150, 50);

        Label l4 = new Label("Payment:");  // Payment.....
        l4.setBounds(50, 280, 100, 25);

        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox c1 = new Checkbox("Money", cbg, true);
        c1.setBounds(140, 300, 150, 50);

        Checkbox c2 = new Checkbox("Honey", cbg, false);
        c2.setBounds(140, 330, 150, 50);

        Label l5 = new Label("Cars");
        l5.setBounds(50, 370, 100, 25);

        List li1 = new List(7); // Nmber rows
        li1.setBounds(150,400,150,50);
        li1.add("Mclaren");
        li1.add("BMW");
        li1.add("Porsche");
        li1.add("Bentley");
        li1.add("Mercedes");
        li1.add("Lamborghini");
        li1.add("Ferrari");


        Button b = new Button("Submit");
        b.setBounds(200, 550, 100, 30);

        add(li1);
        add(c2);
        add(c1);
        add(cb4);
        add(cb3);
        add(cb2);
        add(cb1);
        add(ta);
        add(t);
        add(l5);
        add(l4);
        add(l3);
        add(l2);
        add(l);
        add(b);

        setSize(555, 777);
        setLayout(null);

        setVisible(true);
        setTitle("Demo");

    }

    public static void main(String args[]) {
        AWT4 a = new AWT4();
    }
}
