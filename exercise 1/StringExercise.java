// **************************************************
// StringExercise.java
//
// Play with String objects
// **************************************************
public class StringExercise   //an obj
{
public static void main (String[] args)
{
String college = new String ("College of Arts and Sciences");
String town = "UUM Sintok"; // part (a)
int stringLength;  //declare as an int
String change1, change2, change3;
stringLength= college.length(); // part (b)
System.out.println (college + " contains " + stringLength + "characters.");
change1 = college.toUpperCase(); // part (c)
System.out.println ("The string is all in upper case: " + change1);
change2 = college.replace("O","*"); // part (d)
System.out.println ("All capital O's are replaced with the asterisk character: " + change2);
change3 = college.concat(town); // part (e)
System.out.println ("The final string is " + change3);

  }
}