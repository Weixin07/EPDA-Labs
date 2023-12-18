package database;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import model.Customer;
public class DataIO {
    public static ArrayList<Customer> allCustomers = new ArrayList<Customer>(); //[]
    public static void read(){
        try{
            ObjectInputStream a = new ObjectInputStream(
                new FileInputStream("data.txt"));
            if(a != null){
                allCustomers = (ArrayList<Customer>)a.readObject();
            }
            if(allCustomers == null){
                allCustomers = new ArrayList<Customer>();
            }
            for(Customer c : allCustomers){
                System.out.println(c);
            }
            a.close();
        }catch(Exception e){
            System.out.println("Error in read method ...");
            //e.printStackTrace();
        }        
    }
    public static void write(){
        try{
            ObjectOutputStream a = new ObjectOutputStream(
                new FileOutputStream("data.txt"));
            a.writeObject(allCustomers);
            for(Customer c : allCustomers){
                System.out.println(c);
            }
            a.close();
        }catch(Exception e){
            System.out.println("Error in write method ...");
            e.printStackTrace();
        }
    }    
    public static Customer checkName(String x){
        Customer found = null;
        for(Customer c : allCustomers){
            if(x.equals(c.getName())){
                found = c;
                break;
            }
        }
        return found;
    }    
}
