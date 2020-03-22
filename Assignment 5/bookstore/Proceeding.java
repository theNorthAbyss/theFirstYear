
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
import java.util.Collections;

public class Proceeding extends Publication implements Citable{
    private String City;
    
    //creates an object of a proceeding (a sub class of publication) ... calls the super constructor and adds city parameter
    public Proceeding(ArrayList<Author> author,Publisher publisher,String venue,String title,int startingPage,int endPage,int year,String City){
        super(author,publisher,venue,title,startingPage,endPage,year);
        this.City=City;
    }
    
     //the output method to the user (acts as getInfo()) also calls the super Cite method from publication
    @Override
    public String Cite(){
           String s= super.Cite();
           s+= " "+City+", "+year+", pp:"+startingPage
                   +"-"+endPage;
           return s;
               
    }
}
