/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shelterproject;

/**
 *
 * @author cbowe13
 */
public class ShelterProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Shelter shltr = new Shelter("Pet Haven");
        
        shltr.addAnimal(new Animal("Muffins", "Dog", 5.0));
        shltr.addAnimal(new Animal("Charlie", "Cat", 1.5));
        shltr.addAnimal(new Animal("Spot", "Rabbit", 3.5));
        shltr.addAnimal(new Animal("Dexter", "Rabbit", 0.75));
        shltr.addAnimal(new Animal("Bluex", "Dog", 0.5));
        
        shltr.listAnimals();
    }
    
}
