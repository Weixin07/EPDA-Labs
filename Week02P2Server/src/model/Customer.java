package model;
import java.io.Serializable;
public class Customer implements Serializable{
    private String name;
    private int password;
    private char gender;
    private double balance;
    public Customer(String name, int password, char gender, double balance) {
        this.name = name;
        this.password = password;
        this.gender = gender;
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPassword() {
        return password;
    }
    public void setPassword(int password) {
        this.password = password;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String toString(){
        return name+"\t"+password+"\t"+gender+"\t"+balance;
    }
}
