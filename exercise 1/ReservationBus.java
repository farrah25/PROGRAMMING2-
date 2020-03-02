import java.util.Scanner;
public class ReservationBus{
static Scanner keyboard = new Scanner (System.in);
 public static void main (String [] args)
 {
 System.out.println("Welcome to AirAsia Airlines!");
 String [] destination = new String [100];
 String [] passengers = new String [100];
 String [] date = new String [100];
 int [] seat = new int [100];
 String [] time = new String [100];
 int count = 0;
 int choice;
 do{
   int menu;
   menu();
   System.out.print("Enter your choice: ");
   choice = keyboard.nextInt();
   if (choice == 0){
     System.out.println("Thank you and Good bye.");
     break;
   }
   else
   count = processChoice(destination, passengers, date, seat, time, choice, count);

   }while (choice != 0);
 }//main

 static void menu(){
  System.out.println (" ");
  System.out.println("::::::::MENU::::::::\n"
                     + "1. Add Info\n"
                     + "2. Edit Info\n"
                     + "3. Remove Info\n"
                     + "4. Display\n"
                     + "5. Search\n"
                     + "0. EXIT");
 }//menu
 
 static int processChoice(String [] destination, String [] passengers, String [] date, 
 int [] seat, String [] time, int choice, int count){
  switch(choice){
    case 1: count = addInfo(destination, passengers, date, seat, time, count); break;
    case 2: editInfo(destination, count); break; 
    case 3: count = removeInfo(destination, passengers, date, seat, time, count); break;
    case 4: display(destination, passengers, date, seat, time, count); break;
    case 5: search(destination, count); break;
    default: System.out.println("Sorry, your choice is out of the list. Please choose again.");
    }//switch(choice)
    return count;

 }//processChoice
 
 static void search(String [] destination, int count){
  String name;
  boolean list = false;
  if (count == 0)
    System.out.println("Sorry, list not found.");
  else {
    System.out.print("Search any destination? : ");
    name=keyboard.next()+keyboard.nextLine();
    for (int i = 0; i<count; i++){
     if (destination[i].equals(name)){
      list = true;
      System.out.println("Your search destination is at index " + (i+1) + " in the list.");
      break;
     }
    }
    if (list==false)
     System.out.println("Sorry, your search value is not in the list.");
  }
 }//search

 static void display (String [] destination, String [] passengers, String [] date,  
 int [] seat, String [] time, int count){
  if (count==0)
   System.out.println("Sorry, list not found.");
  else
    System.out.printf ("%-15s%-15s%-10s%-15s%-13s%n", "DESTINATION", "PASSENGERS", "DATE", "SEAT", "TIME");
    for (int i=0; i<count; i++)
    System.out.printf ("%-15s%-15s%-10s%-15s%-13s%n", destination[i], passengers[i], date[i], seat[i], time[i]);
    
 }//display
 
 static void editInfo(String [] destination, int count){
  String name;
  boolean list=false;
  if (count==0)
   System.out.println("Sorry, list not found");
  else {
   System.out.print("Edit destination? : ");
   name =keyboard.next()+keyboard.nextLine();
   for (int i=0; i<count; i++){
     if (destination[i].equals(name)){
      System.out.print("Enter new destination : ");
      name =keyboard.next()+keyboard.nextLine();
      destination[i] = name; 
      list=true;
      break;
      }
     }
     if (list==false)
     System.out.println("Sorry, your name is not in the list.");
    }
 }//editInfo
 
 static int addInfo(String [] destination, String [] passengers, String [] date, 
 int [] seat, String [] time, int count){
 
  if (count < destination.length){
   System.out.print("Passengers Data : ");
   int data = keyboard.nextInt();
    for (int i = 0; i < data; i++){
    System.out.print ("Enter destination : ");
    destination[count] = keyboard.nextLine()+keyboard.next();
    System.out.print ("Enter passengers : ");
    passengers[count] = keyboard.nextLine()+keyboard.next();
    System.out.print ("date : ");
    date[count] = keyboard.nextLine()+keyboard.next();
    System.out.print ("Enter seat : ");
    seat[count] = keyboard.nextInt();
    System.out.print ("Enter time : ");
    time[count] = keyboard.nextLine()+keyboard.next();
    count++;
    }
   }
   else
    System.out.println("List is FULL.");
   return count;
   
 }//addInfo

 static int removeInfo(String [] destination, String [] passengers, String [] date, 
 int [] seat, String [] time, int count){
  int i,j,nom;
  String name;
  boolean delete = false;
  if (count==0)
   System.out.println("Sorry list not found.");
  else{
  System.out.print("Destination should be deleted? : ");
  name=keyboard.next()+keyboard.nextLine();
   for (i=0; i<count; i++)
    if (destination[i].equals(name)){
     for(j=i; j<count-1; j++){
      destination[j] = destination[j+1];
      passengers[j] = passengers[j+1];
      date[j] = date[j+1];
      seat[j] = seat[j+1];
      time[j] = time[j+1];
     }//for
    --count;
    delete = true;
    break;
   }//if
  }
  if (delete==false)
   System.out.println("Sorry, destination is not in the list.");
  return count;
 }//removeInfo

}//main