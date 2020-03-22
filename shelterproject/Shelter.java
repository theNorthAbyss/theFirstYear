/*
    Student Name: Christopher Bowen
    ID Number: 898737154
 */
package shelterproject;
import java.util.*;
/**
 *
 * @author cbowe13
 */
public class Shelter {
     //variables of a Shelter object
    
    private String name;
    private ArrayList<Animal> animals;
    
    //constructor for a Shelter object
    
    public Shelter(String name){
        this.name= name;    
        animals = new ArrayList<>();
    }
    //method to add an animal to the arraylist
    
    public void addAnimal(Animal a){
        animals.add(a);
    }
    
    //method visual output the the users 
    
     public void listAnimals(){
        
        Collections.sort(animals);
        
        System.out.println("Welcome to "+name);
        System.out.println("===================================");
        System.out.printf("%s \t %s \t\t %s \t", "Kind", "Age", "Name"); 
        System.out.println();
        System.out.println("-----------------------------------");
        
        for(Animal t: animals)
        {   
            System.out.println(t.getInfo());
        
        }
        
        System.out.println("-----------------------------------");
    }
    }


