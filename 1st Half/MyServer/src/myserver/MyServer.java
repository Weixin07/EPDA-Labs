package myserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) {
        ServerSocket ss;
        Socket s;
        BufferedReader input;
        BufferedWriter output;
        try{
            ss = new ServerSocket(25000);
            while(true){
                s = ss.accept();
                input = new BufferedReader(new InputStreamReader(s.getInputStream()));
                output = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
                
                output.write("Welcome to APU!\n");
                output.flush();
                output.write("Send me your name and TP number!\n");
                output.flush();
                
                System.out.println(input.readLine());
                System.out.println(input.readLine());
            }
        }catch(Exception e){
            System.out.println("Error ..........");
//            e.printStackTrace();
        }
    }    
}
