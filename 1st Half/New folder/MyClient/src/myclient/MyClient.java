package myclient;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {
    public static void main(String[] args) {
        Socket s;
        BufferedReader input;
        BufferedWriter output;
        try{
            s = new Socket("127.0.0.1",25000);
            input = new BufferedReader(new InputStreamReader(s.getInputStream()));
            output = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            
            System.out.println(input.readLine());
            System.out.println(input.readLine());
            
            Scanner a = new Scanner(System.in);
            System.out.print("Enter your name: ");
                
            output.write(a.nextLine()+"!\n");
            output.flush();
            
            System.out.print("Enter your TP number: ");
            output.write(a.nextLine()+"!\n");
            output.flush();                
        }catch(Exception e){
            System.out.println("Error ..........");
            e.printStackTrace();
        }
    }    
}
