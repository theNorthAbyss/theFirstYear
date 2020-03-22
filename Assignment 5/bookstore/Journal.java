
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

public class Journal extends Publication implements Citable{
    private int volume;
    private int number;
    
    //creates an object of a journal (a sub class of publication) ... calls the super constructor
    public Journal(ArrayList<Author> author,Publisher publisher,String venue,String title,int startingPage,int endPage,int year,int volume,int number){
    super(author,publisher,venue,title,startingPage,endPage,year);
    this.volume=volume;
    this.number=number;
    }
    
    //the output method to the user (acts as getInfo()) also calls the super Cite method from publication
    @Override
    public String Cite(){
        String s = super.Cite();
        s+= volume+"("+number+")"+":"+startingPage+"-"+endPage+","+year;
        return s;
    }
  
}
