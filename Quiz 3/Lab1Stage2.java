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
public class Lab1Stage2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


    Animal kurre = new Cat("Kurre");
    Animal vilma = new Dog("Vilma");
    
    kurre.age = 6;
    vilma.age = 3;
    
    kurre.introduceYourself();
    vilma.introduceYourself();
    }
}
        

