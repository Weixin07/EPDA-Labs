package view;
import controller.LoginController;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import week01laboodj.Week01LabOODJ;
public class Page2 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        double amount = Double.parseDouble(JOptionPane.showInputDialog("Enter amount:"));
        Week01LabOODJ.loginUser.setBalance(Week01LabOODJ.loginUser.getBalance()+amount);
        JOptionPane.showMessageDialog(null, "Now you have RM"+Week01LabOODJ.loginUser.getBalance()+"!");
    }
    private Button deposit, withdraw, update, logout;
    private JFrame x;    
    public Button getLogout(){
        return logout;
    }
    public Button getDeposit() {
        return deposit;
    }    
    public JFrame getJFrame(){
        return x;
    }
    public Page2(){
        x = new JFrame("My Page");
        x.setSize(400, 100);
        x.setLocation(1000, 400);
        //x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x.setLayout(new FlowLayout());
        deposit = new Button("Deposit");
        withdraw = new Button("Withdraw");
        update = new Button("Update Password");
        logout = new Button("Logout");
        deposit.addActionListener(this);    //second = new Page2();
        logout.addActionListener(new LoginController());
        x.add(deposit);
        x.add(withdraw);
        x.add(update);
        x.add(logout);
        //x.setVisible(true);
    }    
}

