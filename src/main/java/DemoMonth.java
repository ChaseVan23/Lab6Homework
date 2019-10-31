/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chasec
 */
public class DemoMonth {
    public static void main(String[] args) {
        
    
    Month m1 = new Month();

    System.out.println(m1.toString());
    System.out.println(m1.getMonthName(3));
    System.out.println(m1.getMonthNumber());
 
      
    Month m2 = new Month(3);
    
    System.out.println(m1.equals(m2));
    System.out.println(m1.greaterThan(m2));
    System.out.println(m1.lessThan(m2));
 }
}