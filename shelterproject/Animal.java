/*
 *
 */
package shelterproject;

/**
 *
 * @author cbowe13
 */
public class Animal implements Comparable<Animal>{
        
    //variables of a animal object
    private String name;
    private String kind;
    private double age; 
   
    
    //constructor for a animal object
    
    public Animal(String name, String kind,Double age){
        this.name= name;
        this.kind= kind;
        this.age= age;
        
    }
    
    //method that returns the info of a animal object
    
      public String getInfo(){ 
          if (age <1 ){
        return String.format("%s\t%.1f months\t %s",kind, age*12, name);
          } else{
              
        return String.format("%s\t%.1f years\t %s",kind, age, name);
              
    }
          
}
      // overriding the compareTo method to sort by the values 
    public int compareTo(Animal other)
    {
        if(kind.compareTo(other.kind)!= 0)
            return kind.compareTo(other.kind);   
     else
        if(Double.compare(this.age, other.age) != 0)
            return Double.compare(other.age, age); 
    else
            return name.compareTo(other.name); 
    
}
}
