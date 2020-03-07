import java.util.Scanner;   //assumes import scanner
import java.util.concurrent.ThreadLocalRandom;  //assumes concurrent.ThreadLocalRandom
public class RandomInRange   // initialize class RandomInRange
{ 
   public static void main (String []args){   //main method
      Scanner scan = new Scanner(System.in);  
      int num1,num2;   //declare num1 and num2 as an integer
      int count =0;    //declare count is integer and value is 0  
     
      System.out.print("Please enter the first number:");
      num1=scan.nextInt();
      System.out.print("Please enter the second number:"); //input num1 and num2 
      num2=scan.nextInt();
      
     //display zero if num1 greater than num2
      if (num1 > num2)
      {
         count =0; 
      }
       else {
         count = ThreadLocalRandom.current().nextInt(num1-1, num2+1);
       }
           
      System.out.print("The random integer is:" + count);  //display random integer between num1 and num2   
    }//end main
  } //end class