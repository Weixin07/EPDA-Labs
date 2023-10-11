package week02p2server;
import database.DataIO;
import java.net.ServerSocket;
import java.net.Socket;
public class Week02P2Server {
    public static void main(String[] args) {
        DataIO.read();
        ServerSocket ss;
        Socket s;   
        try{
            ss = new ServerSocket(25000);
            while(true){
                s = ss.accept();
                MyConnection c = new MyConnection(s);
                Thread t = new Thread(c);
                t.start();      //c.run();
            }
        }catch(Exception e){
            System.out.println("Error ..........");
            e.printStackTrace();
        }finally{
            DataIO.write();
        }                
    }    
}
