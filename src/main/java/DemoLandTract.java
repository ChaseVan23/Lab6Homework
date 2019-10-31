
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chasec
 */
public class DemoLandTract {
    
    private static double landLength; 
    
    public static void main(String[] args) {
          
       double landLength1;
       double landLength2;
       double landWidth1;
       double landWidth2;
       boolean equals; 
       
      
       Scanner keyboard = new Scanner(System.in);
      
       //user input for land tract 1
       System.out.print("Please enter Length for land tract 1: ");
       landLength1 = keyboard.nextDouble();
       
       System.out.print("Please enter Width for land tract 1: ");
       landWidth1 = keyboard.nextDouble();
          
       LandTract landTract1 = new LandTract(landLength1, landWidth1);
       
       
      
       //user input for land tract 2
       System.out.print("\nPlease enter Length for land tract 2: ");
       landLength2 = keyboard.nextDouble();
       
       System.out.print("Please enter Width for land tract 2: ");
       landWidth2 = keyboard.nextDouble();
    
       LandTract landTract2 = new LandTract(landLength2, landWidth2);
 
       
       System.out.println("\nThe length and width of the first land tract is: " + landTract1.toString());
       System.out.println("The area of the first land tract: " + landTract1.getLandTractArea() + "\n");
       System.out.println("The length and width of the first land tract is: " + landTract2.toString());
       System.out.println("The area of the first land tract: " + landTract2.getLandTractArea() + "\n");
        
       equals = landTract1.equals(landTract2); 
       if(equals)
            System.out.println("\nThe first and second tracts are of equal size");
       else
            System.out.println("\nThe first and second tracts are not of equal size");
        }
    }

