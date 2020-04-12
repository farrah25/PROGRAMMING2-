package triangle_q1;

/**
 *
 * @author A C E R
 */
import java.util.Scanner;
public class Triangle_q1 {
    
    public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
       double height, base;
       
       System.out.print("Enter the height: ");
       height = scan.nextDouble();
       System.out.print("Enter the base: ");
       base = scan.nextDouble(); 
       
       Triangle tr = new Triangle();
       tr.set(height, base);
       tr.calculateArea();
       tr.displayTotalArea();
    }
    
}

class Triangle {
     private double height;
     private double base;
     private double totalArea;
     
     // The setHeight method accepts an argument which is    
     //stored in the height field.

     public void setHeight(double len)
     {
          height = len;
     }

     // The setBase method accepts an argument which is 
     //stored in the base field. 
    
     public void setBase(double b)
     {
          base = b;
     }

     //The set method accepts two arguments which are 
     //stored in the height and base fields.
  
     public void set(double len, double b)
     {
          height = len;
          base = b;
     }

    // The getHeight method returns the value stored in the 
    //  height field.

     public double getHeight()
     {
          return height;
     }
    
     
     // The getBase method returns the value stored in the   
     //base field

     public double getBase()
     {
          return base;
     }

     // The getArea method returns the value of area
    // with formula : 0.5 * height * base

     public double getArea()
     {
          return totalArea ;
     }
     
     public void calculateArea(){
          totalArea = 0.5 * height * base;
      }
     
     public void displayTotalArea(){
         System.out.println( "The area of triangle is :" + totalArea );
      } 
}