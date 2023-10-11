package controller;
//import database.DataIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import week02p2client.Week02P2Client;
//import week01laboodj.Week01LabOODJ;
public class StopController implements ActionListener{
    public void actionPerformed(ActionEvent e){
        try{
            Week02P2Client.output.write("S\n");
            Week02P2Client.output.flush();
            String input = JOptionPane.showInputDialog("Enter admin password:");
            Week02P2Client.output.write(input+"\n");
            Week02P2Client.output.flush();
        } catch(Exception ex){
            System.out.println("Error in stop ...");
        }
//        String input = JOptionPane.showInputDialog("Enter admin password:");
//        if(input.equals("12345")){
//            DataIO.write();
//            System.exit(0);
//        } else{
//            JOptionPane.showMessageDialog(Week01LabOODJ.first.getStop(), "Wrong admin password!");
//        }
    }
}
