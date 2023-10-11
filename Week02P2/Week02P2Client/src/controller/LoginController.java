//package controller;
//import database.DataIO;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import javax.swing.JOptionPane;
//import model.Customer;
//import week01laboodj.Week01LabOODJ;
//public class LoginController implements ActionListener{
//    public void actionPerformed(ActionEvent e){
//        if(e.getSource() == Week01LabOODJ.first.getLogin()){
//            String input = JOptionPane.showInputDialog("Enter username:");
//            Customer found = DataIO.checkName(input);
//            if(found != null){
//                int password = Integer.parseInt(JOptionPane.showInputDialog("Enter password:"));
//                if(found.getPassword() == password){
//                    Week01LabOODJ.loginUser = found;
//                    Week01LabOODJ.first.getJFrame().setVisible(false);
//                    Week01LabOODJ.second.getJFrame().setVisible(true);
//                } else{
//                    JOptionPane.showMessageDialog(null, "Wrong password!");
//                }
//            } else{
//                JOptionPane.showMessageDialog(null, "You have not registered!");
//            }
//        } else if(e.getSource() == Week01LabOODJ.second.getLogout()){
//            Week01LabOODJ.loginUser = null;
//            Week01LabOODJ.first.getJFrame().setVisible(true);
//            Week01LabOODJ.second.getJFrame().setVisible(false);
//        }
//    }    
//}
