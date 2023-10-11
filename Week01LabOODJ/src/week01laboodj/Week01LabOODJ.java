package week01laboodj;
import database.DataIO;
import model.Customer;
import view.Page1;
import view.Page2;
public class Week01LabOODJ {
    public static Page1 first;
    public static Page2 second;
    public static Customer loginUser = null;
    public static void main(String[] args) {
        DataIO.read();
        first = new Page1();
        second = new Page2();
    }    
}
