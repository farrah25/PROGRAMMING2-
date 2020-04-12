import java.util.Scanner;
public class TestBook{   // class with main method
  public static void main(String[] args) {
  
  int n;
  String title, hpBook= " ";  //hpBook=highestPriceBook
  double price, hp=0;
  
    Scanner input = new Scanner(System.in);
    System.out.println("***********GET YOUR BOOK NOW************"); 
    System.out.print(" Enter number of books :");  // read integer n
    n = input.nextInt();
    
    Book myLibrary[] = new Book[n]; 
    
    for (int i=0; i<myLibrary.length; i++){  // loop of the array myLibrary
      input.nextLine();
      System.out.print("Title of the book :");
      title = input.nextLine();
      System.out.print("Price of the book : RM ");
      price = input.nextDouble();
   
   System.out.println("*****************************************"); 
   
      myLibrary[i] = new Book(title,price);
      
   if (myLibrary[i].getPrice() > hp) {
         hp = myLibrary[i].getPrice();
         hpBook = myLibrary[i].getTitle(); }
         
    } // end of loop
   
   // the book with the highest price
   System.out.printf("The most expensive book here is: " + hpBook + " of RM%.2f", hp);
                     
   System.out.printf("\n-------------------------------");
   System.out.println("-------------------------------");
  
   // the books with the term "Java" in their title
   System.out.println("The book(s) with word 'Java' in their title(s):"); 
  /* String ff="Books that contain the term “Java” in their title:";
   String ee="There are no books that contain the term “Java” in their title";

        for(int i=0;i<n;i++) {

            if (myLibrary[i].getTitle().indexOf("Java") != -1)
                ee=ff;
        }
            System.out.println(ee);*/

      
   for (int j=0; j < n; j++) {
       if (myLibrary[j].getTitle().indexOf("Java") != -1) 
          System.out.println(" - " + myLibrary[j].getTitle()); 
     }
   }
 }
 
 
class Book {
 private String title;      //book’s title
 private double price;      //book’s price

 public Book(String t, double p) {
   title = t;
   price = p;
 }
 
 public String getTitle() {
   return title;
 }

 public double getPrice() {
   return price;
 }
}
