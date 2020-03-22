//Student Name: Christopher Bowen
//Student ID: 898737154
//Lab Section: good question
//Submision Time: 5:38
package cake;

/**
 *
 * @author cbowe13
 */
// a wedding cake object 
public class WeddingCake extends Cake{
    private String bridesFirstName, groomsFirstName;
    
// a constructor for a weddind cake that inheritance the super constructor and adds two variables
    public WeddingCake(String flavor, int tiers, double price,String bridesFirstName,String groomsFirstName ){
        super(flavor,tiers,price);
        this.bridesFirstName= bridesFirstName;
        this.groomsFirstName=groomsFirstName;
    }
// output method for the user to see the orders
    @Override
    public void printCard(){
    System.out.println("Happy Wedding to "+bridesFirstName + "and"+ groomsFirstName);
    super.printCard();
    
}
    
}
