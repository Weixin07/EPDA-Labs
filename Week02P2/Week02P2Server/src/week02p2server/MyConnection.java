package week02p2server;
import database.DataIO;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import model.Customer;
public class MyConnection implements Runnable{
    private Socket s;
    private Customer loginUser;
    private BufferedReader input;
    private BufferedWriter output;
    public MyConnection (Socket x){
        s = x;
    }
    @Override
    public void run() {
        try{
            input = new BufferedReader(
                new InputStreamReader(s.getInputStream()));
            output = new BufferedWriter(
                new OutputStreamWriter(s.getOutputStream()));  

            String s = null;
            while((s=input.readLine())!=null){
                System.out.println(s);
                switch(s){
                    case "R": register(); break;
                    case "S": stop(); break;
                }
            }
        }catch(Exception s){
            System.out.println("Error in run method ...");
            s.printStackTrace();
        }        
    }
    public void stop() throws Exception{
        if(Integer.parseInt(input.readLine())==12345){
            output.write("VA\n");
            output.flush();
        } else{
            output.write("IA\n");
            output.flush();
        }        
    }    
    public void register() throws Exception{
        String s = input.readLine();
        Customer found = DataIO.checkName(s);
        if(found == null){
            output.write("VU\n");
            output.flush();
            int pin = Integer.parseInt(input.readLine());
            char gender = input.readLine().charAt(0);
            double balance = Double.parseDouble(input.readLine());
            DataIO.allCustomers.add(new Customer(s,pin,gender,balance));
            DataIO.write();
        } else{
            output.write("IU\n");
            output.flush();
        }        
    }    
}
