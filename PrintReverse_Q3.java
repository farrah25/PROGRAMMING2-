import java.util.*; //assumes import scanner
class PrintReverse_Q3  //declare name class
{
  public static void main(String args[]) //main method
  {
    String original, reverse = "";  
    Scanner in = new Scanner(System.in);

    System.out.println("Enter a string to reverse"); //input a string to reverse
    original = in.nextLine();

    int length = original.length();

    for (int i = length - 1 ; i >= 0 ; i--)
      reverse = reverse + original.charAt(i);  //use to reverse from original 

    System.out.println("Reverse of the string: " + reverse);  //use to print reverse of the string
  }
}