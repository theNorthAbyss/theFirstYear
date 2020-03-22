//Student Name: Christopher Bowen
//Student ID: 898737154
//Lab Section: 1
//Submision Time: 5:44
package cake;

/**
 *
 * @author cbowe13
 */
public class BirthDayCake extends Cake{
        private String firstName; 
        private int age;
    
// a constructor for a weddind cake that inheritance the super constructor and adds two variables        
    public BirthDayCake(String flavor, int tiers, double price,String firstName,int age )
    {
        super(flavor,tiers,price);
        this.firstName= firstName;
        this.age=age;
    }
// output method for the user to see the orders
@Override
    public void printCard(){
    System.out.println("Happy Birthday to "+firstName + "! You just turned "+ age+":)");
    super.printCard();
    
}
    
}
