
/**
 * Student Name: Christopher John Bowen
 * LSU ID: 898737154 
 * Lab Section:?
 * Assignment: Lab Assignment 5 
 *
 * @author cbowe13
 */
package bookstore;
import java.util.*;

public class Author implements Comparable<Author>{
    protected String firstName;
    protected String lastName;
    protected String institution;
    
    //Constructor for an author object
    public Author(String firstName, String lastName, String institution){
        this.firstName=firstName;
        this.lastName=lastName;
        this.institution=institution;
    }
    
    //method to grab the abbreviation of a string
    public static String getAbv(String institutions) {
    String abv="";
    char a;
    String[] myName = institutions.split(" ");
    for (int i = 0; i < myName.length; i++) {
        String s = myName[i];
        a= s.charAt(0);
        abv= abv+a;
    }
    return " ("+abv.toUpperCase()+")";
    
   
}
    //setter method for the Institution parameter in author
    public void setInstitution(String institution){
        this.institution=institution;
        
    }
    
    //Compare to method for the object of an author (compares lastname then firstname)
    public int compareTo(Author other){
        if(lastName.compareTo(other.lastName)!= 0)
            return lastName.compareTo(other.lastName);   
    else
            return firstName.compareTo(other.firstName);
    }
    
    
}
