/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.ejb.Stateful;
import javax.ejb.LocalBean;

/**
 *
 * @author guan.kiat
 */
@Stateful
@LocalBean
public class StatefulSB {
    private int counter;
    private double total;
    public void add(double input){
        total = total+input;
        counter++;
    }    
    public double getAverage(){
        return total/counter;
    }
    public double getTotal(){
        return total;
    }
    public int getCounter(){
        return counter;
    }
}
