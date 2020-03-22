/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cake;
import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter;


/**
 *
 * @author cbowe13
 */
public class Cake {
    private String flavor;
    private int tiers;
    private double price;
    
// constuctor for a cake object
    
public Cake(String flavor, int tiers, double price){
    this.flavor=flavor; 
    this.tiers = tiers;
    this.price = price;
}
// a void method that outputs a invoice for each cake (used later for child classes

public void printInvoice(){
  System.out.printf("A %d tier %s cake. The price is $ %.2f.Issued on: %s \n",tiers,flavor,price,(java.time.LocalDate.now()) );
}

// original method for printing out to the user

public void printCard(){
    System.out.println("Thank you for choosing us!");
    
}


}
