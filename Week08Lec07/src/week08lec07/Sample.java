package week08lec07
        ;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
public class Sample implements ItemListener{
    public void itemStateChanged(ItemEvent e){
        int r=0, g=0, b=0;
        if(gui.getRed().getState()){
            r=255;
        }
        if(gui.getGreen().getState()){
            g=255;
        }
        if(gui.getBlue().getState()){
            b=255;
        }
        gui.getPanel().setBackground(new Color(r,g,b));
    }
    private Exe1 gui;
    public Sample(Exe1 x){
        gui = x;
    }
}
