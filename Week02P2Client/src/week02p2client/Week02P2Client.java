package week02p2client;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import javax.swing.JOptionPane;
import view.Page1;
import view.Page2;
public class Week02P2Client {
    public static Page1 firstPage;
    public static Page2 secondPage;
    public static BufferedReader input;
    public static BufferedWriter output;
    public static void main(String[] args) {
        firstPage = new Page1();
        secondPage = new Page2();
        
        Socket s;  
        try{
            s = new Socket("127.0.0.1",25000);
            input = new BufferedReader(
                new InputStreamReader(s.getInputStream()));
            output = new BufferedWriter(
                new OutputStreamWriter(s.getOutputStream()));
            
            String a = null;
            while((a=input.readLine())!=null){
                System.out.println(a);
                switch(a){
                    case "VA":
                        System.exit(0);
                    case "IA":
                        JOptionPane.showMessageDialog(firstPage.getStop(),
                        "Wrong password!");
                        break;
                    case "VU":
                        String x = JOptionPane.showInputDialog("Pin:");
                        output.write(x+"\n");
                        output.flush();
                        x = JOptionPane.showInputDialog("Gender:");
                        output.write(x+"\n");
                        output.flush();
                        x = JOptionPane.showInputDialog("Initial balance:");
                        output.write(x+"\n");
                        output.flush();
                        break;
                    case "IU":
                        JOptionPane.showMessageDialog(null,
                        "Invalid username!"); break;
                }
            }
        } catch(Exception e){
            System.out.println("Error in main method ...");
        } 
    }    
}
