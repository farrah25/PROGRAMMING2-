import java.util.Scanner; //need scanner
public class FunnyString{  //declare class
public static void main(String[] args)
 
 {
  String colour, food, animal, nameFriend; //declare string
  Scanner input= new Scanner(System.in);
  
  System.out.println("--------Enter Your Details-------- "); 
 
  System.out.print("Enter your fav colour:");  //ask user to input fav colour
  colour = input.nextLine();   //use input.nextLine bcs declare as a string 
  System.out.println("Colour: " + colour);  
  System.out.print("Enter your fav food:");
  food = input.nextLine();   
  System.out.println("Food: " + food);
  System.out.print("Enter your fav animal:");
  animal = input.nextLine();   
  System.out.println("Animal: " + animal);
  System.out.print("Enter your first name of a friend:");
  nameFriend = input.nextLine();   
  System.out.println("nameFriend: " + nameFriend);
  input.close();  // input.close bcs dont want to return back
   
  System.out.println("I had a dream that" +" "+ nameFriend +" " + "ate a" + " " + colour +" "+ animal +"  "+ "and said it tasted like" +" "+ food +"!");


   }
 }