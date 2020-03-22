
/**
 * Student Name: Christopher John Bowen
 * LSU ID: 898737154 
 * Lab Section:?
 * Assignment: Lab Assignment 5 
 *
 * @author cbowe13
 */

package bookstore;
import java.util.ArrayList;
import java.util.*;

public class Publication implements Citable ,Comparable<Publication> {
   
    private ArrayList<Author> author;
    private Publisher publisher;
    private String venue;
    private String title;
    protected int startingPage;
    protected int endPage;
    protected int year;
    
    //the default object (super class) constructor
    public Publication( ArrayList<Author> author,Publisher publisher,String venue,String title,int startingPage,int endPage,int year){
        this.author= author;
        this.publisher= publisher;
        this.venue=venue;
        this.title=title;
        this.startingPage=startingPage;
        this.endPage=endPage;
        this.year=year;
    }
    
    //Overrides the compare to method to allow the sort() method to work
    @Override
    public int compareTo(Publication other){
       Collections.sort(author);
       Collections.sort(other.author);
        if(author.get(0).lastName.compareTo(other.author.get(0).lastName)!=0){
            return author.get(0).lastName.compareTo(other.author.get(0).lastName);
        }else
               if(venue.compareTo(other.venue)!=0){
                   return venue.compareTo(other.venue);
               }
               else{
                   return Integer.compare(year,other.year);
                    }
    }      
    
    //the output method to the user (acts as getInfo()) 
    @Override
    public String Cite(){
        String s = "";
        Collections.sort(author);
       if(author.size() ==2){
           s+= author.get(0).firstName.charAt(0) +". "+author.get(0).lastName 
                   +" and "+author.get(1).firstName.charAt(0) +". "+
                   author.get(1).lastName+",";
       }
       else {
           for(int i =0; i< author.size();i++ ){
              if(i != author.size()-1){
               s+=author.get(i).firstName.charAt(0) +". "+author.get(i).lastName 
                   +", ";
              } 
              else{
                 s+="and "+author.get(i).firstName.charAt(0) +". "+author.get(i).lastName 
                   +", ";
              } 
           }
       }
         s+="\"" +title+"\", "+ venue
                 + Author.getAbv(venue)+", "+publisher+",";
       return s;
    }
            
}
