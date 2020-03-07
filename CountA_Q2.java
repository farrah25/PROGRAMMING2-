  
import java.util.Scanner;  //import scanner
public class CountA_Q2  //object class
{
    public static void main(String[] args)  //main class
    {
        Scanner sc = new Scanner(System.in);  //use scanner bcs have import java
        String b;
        int i, num;  //initialize string b and int i,num;
         
        System.out.print("Please enter a string: ");   //print to input a string
        b = sc.nextLine();
        
        num = 0;
        for (i=0; i<b.length(); i++)   //looping 
        {
        
            if (b.charAt(i) == 'A')  
            
        {
           num++;
           
           }
       
        }
        System.out.print("The number of times character 'A' that found is:" + num);  //print num of times that character A have 
        
        } //end main
     } //end class