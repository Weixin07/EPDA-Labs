package controller;
import database.DataIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import week01laboodj.Week01LabOODJ;
public class StopController implements ActionListener{
    public void actionPerformed(ActionEvent e){
        String input = JOptionPane.showInputDialog("Enter admin password:");
        if(input.equals("12345")){
            DataIO.write();
            System.exit(0);
        } else{
            JOptionPane.showMessageDialog(Week01LabOODJ.first.getStop(), "Wrong admin password!");
        }
    }
}
