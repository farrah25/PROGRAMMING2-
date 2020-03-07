import java.util.Scanner;   //import scanner
public class Exercise2_Q1{  //
public static void main(String[] args) //main clss 
{
    

    int num;
    int square;   //declare int num,sqr,cube;
    int cube;
    
    System.out.println("Number\t\tSquare\t\tCube");  //display the words num, square, and cube
    System.out.printf("****************************\n");
    

    for(int i=0; i<=10; i++)  // process from numbers 0 to 10
    {
       System.out.println(i+"\t\t"+(int)Math.pow(i,2)+"\t\t"+(int)Math.pow(i,3));  // calculate cube and square of the numbers

    }
  }
}