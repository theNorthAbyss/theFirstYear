//Student Name: Christopher Bowen
//Submision Time: 5:52
package carsproject;

/**
 *
 * @author cbowe13
 */
public class Car {
    
    //variables of a car object
    private long VINnumber;
    private String model;
    private int year; 
    private double mileage;
    
    //constructor for a car object
    
    public Car(long VINnumber, int year,String model){
        this.VINnumber= VINnumber;
        this.model= model;
        this.year= year;
        
    }
    
    //setter method that sets a mileage of a car 
    
    public void setMileage(int mileage){
        this.mileage = mileage;
    }
    
    //method that returns the info of a car object
    
      public String getInfo(){ 
        return String.format("%d %s (VIN: %d, Mileage: %,.1f miles)",year,model,VINnumber,mileage);
    }
}
