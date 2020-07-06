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
public class Cat extends Animal {
    String cat;

    public Cat(String cat){
        this.cat = cat;
    }
    public void introduceYourself() {
        System.out.println("Meow. I am a cat. My name is " + cat);
    }
}