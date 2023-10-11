package view;
import controller.LoginController;
import controller.RegisterController;
import controller.StopController;
import java.awt.Button;
import java.awt.FlowLayout;
import javax.swing.JFrame;
public class Page1 {
    private Button register, login, stop;
    private JFrame x;   
    public Button getStop(){
        return stop;
    }
    public Button getLogin(){
        return login;
    }
    public JFrame getJFrame(){
        return x;
    }
    public Page1(){
        x = new JFrame("Home Page");
        x.setSize(400, 100);
        x.setLocation(1000, 200);
        //x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x.setLayout(new FlowLayout());
        register = new Button("Register");
        login = new Button("Login");
        stop = new Button("Stop");
        register.addActionListener(new RegisterController());
        login.addActionListener(new LoginController());
        stop.addActionListener(new StopController());
        x.add(register);
        x.add(login);
        x.add(stop);
        x.setVisible(true);
    }      
}
