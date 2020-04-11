//package payrolldemo;

/**
 *
 * @author A C E R
 */
import java.util.Scanner;
public class PayrollDemo {

  public static void main(String[] a){
  Scanner input = new Scanner (System.in);  
    
    String employeeID;
    int grossPay, stateTax, federalTax;  
    
    System.out.print("Enter your employee ID Number:");
    employeeID = input.nextLine();
    System.out.print("Enter your  Gross Pay:" + "RM");
    grossPay = input.nextInt();
    System.out.print("Enter your State Tax:" + "RM");
    stateTax = input.nextInt();
    System.out.print("Enter your Federal Tax:" + "RM");
    federalTax = input.nextInt();

    
    //to create an object
    Employee em = new Employee();
    Payroll p = new Payroll(employeeID, grossPay, stateTax, federalTax);
    
    //use to display output
    em.Employee(employeeID,federalTax,stateTax,grossPay);
    em.calculateNetPay();
    p.printOutput();
    p.calculateNetPay();
    
    }
    
}

class Employee {
    private String  employeeID;
    private double grossPay, stateTax, federalTax, netPay;
    
    public void Employee (String idNum ,double gPay,double staTax,double fedTax){
        this.employeeID =idNum;
        this.federalTax = fedTax;
        this.stateTax = staTax;
        this.grossPay = gPay;        
    }
    public String getEmployeeID(){
        return employeeID;
    }
    public double getGrossPay(){
        return grossPay;
    }
    public double getStateTax(){
        return stateTax;
    }
    public double getFederalTax(){
        return federalTax;
    }
        public void calculateNetPay(){
        netPay = grossPay - (stateTax + federalTax);
    }
    
    public double getTotalNetPay(){
        return netPay;
    }
    
    public void printOutput(){
        System.out.println(" ");
        System.out.println("**********INFORMATION*********");
        System.out.println("Employee ID Number :" + this.employeeID);
        System.out.println("Gross pay :" + "RM" + this.grossPay);
        System.out.println("State tax :" + "RM" + this.stateTax);
        System.out.println("Federal tax :" + "RM" + this.federalTax);
        System.out.println("******************************");
    }
}

class Payroll {
    
   public String employeeID;
   public double grossPay, stateTax, federalTax, netPay;
   
    public Payroll(String idNum, double gPay,double staTax,double fedTax)
    {
        this.employeeID =idNum;
        this.grossPay = gPay;
        this.stateTax = staTax;
        this.federalTax = fedTax;
    }

    public double calculateNetPay()
    {
        return grossPay - (stateTax + federalTax);
    }
    
        public double getTotalNetPay(){
        return netPay;
    }
    
    
    public void printOutput(){
        System.out.println(" ");
        System.out.println("**********INFORMATION*********");
        System.out.println("Employee ID Number :" + this.employeeID);
        System.out.println("Gross pay :" + "RM" + this.grossPay);
        System.out.println("State tax :" + "RM" + this.stateTax);
        System.out.println("Federal tax :" + "RM" + this.federalTax);
        System.out.println("Net pay is : RM " + calculateNetPay());
        System.out.println("******************************");
    }
}
