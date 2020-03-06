import java.util.*;  //import scanner class
public class DigitExercise {  //class name
static Scanner keyboard = new Scanner (System.in);//ini adalah create new obj sbg new scanner and system.in adlh method dlm scanner
 public static void main (String [] args)
 {
 
  number();
  }  
     public static void number(){//parameter 
      String number = "";
      int j = 0;
      
      System.out.printf("Enter 4 digit number\t:");  //declre to print enter four digit number
      String digit = keyboard.nextLine();  //use keyboard scanner to input data
      
      for(int i = 0 ; i<4; i++){//condition
      
         System.out.println(digit.charAt(i)); //declare variables of char data type and use String method char charAt(int index)
         number = String.valueOf(digit.charAt(i));    
         j += Integer.parseInt(number);
         
         }
            System.out.println(j); //
       }
   }
   
