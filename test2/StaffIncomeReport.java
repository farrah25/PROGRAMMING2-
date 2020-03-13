
import java.util.Scanner;
public class StaffIncomeReport {

  public static void main (String [] args) {
  Scanner sc = new Scanner(System.in);
     
     String name, id, incomeType;
     double incomeAmount, incomeTax;
      
      System.out.println("****~~~STAFF INFORMATION~~~****");
      System.out.print("Please Enter Staff Name: ");
      name = sc.nextLine();
      System.out.print("Please Enter Staff ID: ");
      id = sc.nextLine();
      System.out.print("Please Enter Income Type: ");
      incomeType = sc.nextLine();
      System.out.print("Please Enter Income ammount: ");
      incomeAmount = sc.nextDouble();
      System.out.print("Please Enter Income Tax Percentage: ");
      incomeTax = sc.nextDouble();
      
      System.out.println(" " );
      Income income = new Income(incomeType,incomeAmount,incomeTax);
      Staff info = new Staff(name,id,income);  

      info.displayStaffInfo();
      info.displayIncomeInfo();
    }

}

    class Staff {
      private String name;
      private String id;
      private Income income;
   
   public Staff(String name, String id, Income income){
      this.name = name;
      this.id = id;
      this.income = income;
      }
      
   public String getName(){
      return name;
      }
      
   public String getId(){
      return id;
      }
      
   public double calculateNetIncome(){
      return income.getAmount() - income.getTotalTax();
      }
     
   public void displayStaffInfo(){
      System.out.println("************Staff Info*************");
      System.out.println("Staff name: " + this.name);
      System.out.println("Staff ID: " + this.id);
      }
          
   public void displayIncomeInfo(){
      System.out.println(" " );
      System.out.println("************Income Info************");
      System.out.println("Income Type: " + income.getIncomeType());
      System.out.println("Income Amount: " + "RM" + income.getAmount());
      System.out.println("Tax: " + income.getTax() + "%");
      System.out.println("Total Tax Paid: " + "RM" + income.getTotalTax());
      System.out.println("Total Net Income: " + "RM" + calculateNetIncome());
      }
      
   }
   
   class Income {
      private String incomeType;
      private double amount;
      private double tax;
      private double totalTax;
   
   public Income(String incomeType, double amount, double tax) {
      this.incomeType = incomeType;
      this.amount = amount;
      this.tax = tax;
      this.totalTax = (tax/100)*this.amount;
      }
    
   public String getIncomeType(){
      return incomeType;
      }
    
   public double getAmount(){
      return amount;
      }
      
    public double getTax(){
      return tax;
      }
      
    public double getTotalTax(){
      return totalTax;
      }
  
   }
    
