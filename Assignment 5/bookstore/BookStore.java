
/**
 * Student Name: Christopher John Bowen
 * LSU ID: 898737154 
 * Lab Section:?
 * Assignment: Lab Assignment 5 
 *
 * @author cbowe13
 */
package bookstore;

import java.io.FileNotFoundException;
import java.util.Scanner;

//given class from teacher

public class BookStore {
    
    //main method (outputs to the user)
     public static void main(String[] args) throws FileNotFoundException{
         
         DigitalLibrary DL = new DigitalLibrary();
         Scanner in = new Scanner(System.in);
         
         int choice;
         
         while(true)
         {
            System.out.print("Please select one of the following:\n\t 1- Load all publications\n\t 2- Save publications\n\t 3- List publications\n\t\n");
            choice = in.nextInt();
            
            switch(choice)
            {
                case 1: { DL.loadPublications(); break;} //Loads the list of publications from the file publications.txt into the ArrayList publications 

                case 2: {
                       System.out.println("Please enter your file name");  
                       String fileName = in.next(); 
                       DL.saveCitations(fileName); //Saves the citations into a file. The file's name is supplied by the user
                       break;
                }

                case 3: {DL.listPublications(); break;} //Prints all the publications in their scientific citation format

                default: {System.out.println("Invalid choice. Please pick a number between 1 - 3."); break;}    
            }
            
            
            System.out.println("Press 0 to exit. Press any other letter to continue");
            if(in.next().charAt(0) == '0')
                break; 

         }
         
     }
     
         
}
