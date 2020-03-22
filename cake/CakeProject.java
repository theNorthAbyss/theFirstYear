//Student Name: Christopher Bowen
//Student ID: 898737154
//Lab Section: good question
//Submision Time: 5:38
package cake;

/**
 *
 * @author cbowe13
 */
public class CakeProject {
   
    //this is the main method... in this we create two objects a weddingcake and a birthdaycake
    public static void main(String Args[]){
        
       WeddingCake wedCK = new WeddingCake("Chocolate",3,355.0,"Sarah","John");
       wedCK.printInvoice();
       wedCK.printCard();
       
       System.out.println();
       
       BirthDayCake bdCK = new BirthDayCake("Vanilla",1,20.0,"Alan",15);
       bdCK.printInvoice();
       bdCK.printCard();
    
    }
}
