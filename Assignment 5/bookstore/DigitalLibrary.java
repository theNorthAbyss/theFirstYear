
/**
 * Student Name: Christopher John Bowen
 * LSU ID: 898737154 
 * Lab Section:?
 * Assignment: Lab Assignment 5 
 *
 * @author cbowe13
 */
package bookstore;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList; 
import java.util.Collections;
import java.util.Scanner;
import java.io.PrintWriter;

//Enumeration with all allowed publisher names
enum Publisher{ELSEVIER, SPRINGER, IEEE, TAYLORFRANCIS, WILEY, ACM}; 



public class DigitalLibrary { 
    
   private ArrayList<Publication> publications = new ArrayList<>();
   
   //method to load publications and correctly split up the field[0]- string into author objects
   //if the data is not a Proceeding or a Journal a error is thrown
   public void loadPublications() throws FileNotFoundException
    {
        
        File input = new  File("publications.txt"); 
        Scanner in = new Scanner(input);
        
        while(in.hasNext())
        {
            String[] fields = in.nextLine().split(";");
            String[] PartialNames = fields[0].split("\\s+|,");
     
                //code for creating author objects
                ArrayList<String> PartialNames2 =new ArrayList<>();
                for(int i = 0; i<PartialNames.length;i++){
                    PartialNames2.add(PartialNames[i]);
                }
                ArrayList<Author> authors = new ArrayList<>();
                for(int i = 0; i< PartialNames2.size()-1;i+=2 ){
                    authors.add(new Author(PartialNames2.get(i),PartialNames2.get(i+1),"N/A" ));
                }
                
                
                //checks the length of fields and then decides what object to create
                if(fields.length == 8){
                  
                    publications.add(new Proceeding(authors,
                                                    getPublisher(fields[3].toUpperCase()),
                                                    fields[2],
                                                    fields[1],
                                                    Integer.parseInt(fields[5]) ,
                                                    Integer.parseInt(fields[6]),
                                                    Integer.parseInt(fields[7]),
                                                    fields[4])
                                                        );
                    } else{
                    publications.add(new Journal( 
                                                 authors,
                                                 getPublisher(fields[3].toUpperCase()),
                                                 fields[2],
                                                 fields[1],
                                                 Integer.parseInt(fields[6]) ,
                                                 Integer.parseInt(fields[7]),
                                                 Integer.parseInt(fields[8]),
                                                 Integer.parseInt(fields[4]),
                                                 Integer.parseInt(fields[5])
                    
                    ));
            }

        }
    }
   
   
   //method to output the Publications to the User
   public void listPublications(){
       
	   Collections.sort(publications);
           for(int i =0; i<publications.size();i++){
               System.out.println("["+(i+1)+"]"+publications.get(i).Cite());
              
    }
   }
   
   //if not a value of the enum Publisher throws and error
   private Publisher getPublisher(String pub){
       try{return Publisher.valueOf(pub);}
       catch(IllegalArgumentException e){
               throw e;
               }
       }
   
   
   //Ask the user for a file name and saves the publications to a text file (and creates the file) 
   public void saveCitations(String fileName) throws FileNotFoundException{
       int number=publications.size();
       String filePath= fileName+".txt";
       PrintWriter prw = new PrintWriter(fileName + ".txt");
       listPublications();
       prw.close();
         
       System.out.println(number + " citations have been saved to the file " + filePath);
       
   }
   
   
   
   
}