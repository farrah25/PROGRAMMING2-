import java.util.Scanner;
public class DigitExercise{
static Scanner keyboard = new Scanner (System.in);//ini adalah create new obj sbg new scanner and system.in adlh method dlm scanner
 public static void main (String [] args)
 {
 
 String Number="";  //declare string
 System.out.print("Enter four digit number:");  //declre to print enter four digit number
 number= keyboard.nextLine();  //use keyboard scanner to input data
 char ch1 = number.charAt(0);
 char ch2 = number.charAt(1);
 char ch3 = number.charAt(2);
 char ch4 = number.charAt(3);
 
 System.out.println(ch1);
 System.out.println(ch2);
 System.out.println(ch3);
 System.out.println(ch4);
 System.out.println(" ");
 int result = Integer.parseInt(number);
 System.out.println(result);
 }
 
  int sumDigit=0;   //declare int as a sumDigit=0
  String stringNum= "";
  for(int i =0;i< number.length();i++){ // loop ni utk declre stringnumber.length fr size;
  System.out.println(stringNumber.charAt(i));
  stringNum=String.valueOf(stringNumber.charAt(i));
  sumDigit=sumDigit+Integer.parseInt(stringNum);
  
  }

 System.out.println("the sum of the digits is "+sumDigit);
   }
 