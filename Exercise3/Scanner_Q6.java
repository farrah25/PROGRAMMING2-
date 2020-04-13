
import java.util.Scanner;
public class Scanner_Q6{
   public static void main (String []args){
   
      Scanner console =new Scanner (System.in);
      int x,y;
      System.out.print("Enter value of x:");
      x = console.nextInt();
      
      System.out.print("Enter value of y:");
      y = console.nextInt();
      
      System.out.println(" ");
      System.out.println((int)Math.pow(x,y));
      
    }
 }