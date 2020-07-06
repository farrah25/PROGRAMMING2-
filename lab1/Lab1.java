/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author A C E R
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               Animal[] allAnimals;
        int i;

        allAnimals = new Animal[3];

        allAnimals[0] = new Cat("Kurre");
        allAnimals[1] = new Dog("Vilma");
        allAnimals[2] = new Cat("Bamse");

        i = 0;
        while (i < allAnimals.length){
            allAnimals[i].introduceYourself();
            i = i + 1;
        }
    }
        
}
