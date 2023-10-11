package controller;
import database.DataIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Customer;
public class RegisterController implements ActionListener{
    public void actionPerformed(ActionEvent e){
        String input = JOptionPane.showInputDialog("Enter username:");
        Customer found = DataIO.checkName(input);
        if(found == null){
            int password = Integer.parseInt(JOptionPane.showInputDialog("Enter password:"));
            char gender = JOptionPane.showInputDialog("Enter gender:").charAt(0);
            double balance = Double.parseDouble(JOptionPane.showInputDialog("Enter balance:"));
            Customer c = new Customer(input,password,gender,balance);
            DataIO.allCustomers.add(c);
            DataIO.write();
        } else{
            JOptionPane.showMessageDialog(null, "The username has been used!");
        }
    }
}
