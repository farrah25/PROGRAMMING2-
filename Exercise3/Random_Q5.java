 
import java.util.Random;
public class Random_Q5{
   public static void main (String []args){
   
      Random random = new Random();
      double d = Math.round ( 2.5 + random.nextInt(1) );
      System.out.println("The value is" + " " + d);
   }
}