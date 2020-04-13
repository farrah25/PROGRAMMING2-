//java program to demonstrate random number generate
import java.util.Random;
public class Random2{
   public static void main (String []args){
      
      //to create instance of Random class
      Random rd = new Random ();
      
      //Generate random integers in range 0 to 100
      int firstNum = rd.nextInt(100);
      int secondNum = rd.nextInt(100);
      int largestNum = Math.max(firstNum,secondNum);
      
      //display random integers
      System.out.println("Value of first number:" + firstNum);
      System.out.println("Value of second number:" + secondNum);
      System.out.println("The largest number is:" + largestNum);
      }
   }
 
 