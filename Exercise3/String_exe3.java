public class String_exe3{
   public static void main (String []args){
   
      //declare the String as an object text1, text2,text3.
      String text1 = "School of Computing";
      String text2 = "College of Arts and Sciences";
      String text3 = "UUM Sintok";
      
      //length() method of String returns the length
      System.out.println("Total length of a String is:" + (text1.length() + text2.length() + text3.length()));    
      System.out.println(" ");
      System.out.println(text2.substring(0,20) + text1.substring(10,19)); 
   }
}