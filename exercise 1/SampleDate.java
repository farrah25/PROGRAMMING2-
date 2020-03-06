import java.text.SimpleDateFormat; //import java text class object
import java.util.Date;
public class SampleDate{  //declare class 
public static void main(String[]args){

Date date= new Date(); //declare object
String SimpleDateFormat;
SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); //input DD/MM/YY
String strDate = formatter.format(date);
System.out.println(strDate);
System.out.println(" ");
SimpleDateFormat f = new SimpleDateFormat("dd.MM.yyyy"); //use string  method new SimpleDateFormat to replace 
System.out.println(f.format(new Date()));



   }
}