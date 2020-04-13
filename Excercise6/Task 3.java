import java.util.Scanner;
public class Average{  //class main method
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
  
    int a,b,c,d;    
    
    System.out.println("******************************");
    System.out.print("Enter the integer 1? :");
    a =in.nextInt();
    System.out.print("Enter the integer 2? :");
    b =in.nextInt();
    System.out.print("Enter the integer 3? :");
    c =in.nextInt();   
    System.out.printf("\nThe average for 3 integers: %.2f%n", average(a,b,c));

    System.out.print("Please enter one more integer here: ");
    d = in.nextInt();
    System.out.printf("The average for 4 integers: %.2f",average(a,b,c,d));
    }

    public static double average(int a,int b,int c){      
          double average = ((double)(a+b+c))/3;
          return average;
    }   

    public static double average(int a,int b,int c,int d){  
          double average = ((double)(a+b+c+d))/4;
          return average;
    }
    
  }  // main method ends here   

        