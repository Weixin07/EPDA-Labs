package week08lec07;
import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Panel;
import javax.swing.JFrame;
public class Exe1 {
    public static void main(String[] args) {
        new Exe1();
    }   
    private JFrame x;
    private Panel c, s;
    private Checkbox r, g, b;
    public Checkbox getRed(){
        return r;
    }
    public Checkbox getGreen(){
        return g;
    }
    public Checkbox getBlue(){
        return b;
    }
    public Panel getPanel(){
        return c;
    }
    public Exe1(){
        x = new JFrame("Lab08 - Exe1");
        x.setSize(500, 300);
        x.setLocation(1000, 200);
        x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = new Panel();
        c.setBackground(Color.black);
        x.add(c,BorderLayout.CENTER);
        r = new Checkbox("RED");
        g = new Checkbox("GREEN");
        b = new Checkbox("BLUE");
        r.addItemListener(new Sample(this));
        g.addItemListener(new Sample(this));
        b.addItemListener(new Sample(this));
        s = new Panel();
        s.add(r);
        s.add(g);
        s.add(b);
        x.add(s,BorderLayout.SOUTH);
        x.setVisible(true);
    }
}
