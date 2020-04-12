import java.util.Scanner;
public class TestMyFCStaff_Q4{

    private static double salary;
    private static double sales;
    
    public static void main(String[] args) {
        /*String name,staffID;
        int hourWorks;*/
        MyFCStaff staff1 = new MyFCStaff();
        

     Scanner scan = new Scanner (System.in);
        System.out.print("Enter staff name: ");
        String nm = scan.nextLine();
        System.out.print("Enter staff ID:");
        String id = scan.nextLine();
        System.out.print("Enter staff sales:");
        double sale = scan.nextDouble();
        System.out.print("Enter hour works:");
        int hWorks = scan.nextInt();
     
        staff1.setStaff(nm, id, hWorks, sale, salary);
        staff1.calculateSalary();
        staff1.calculateCommission();
        System.out.println(staff1.toString()); 

    }
}

class MyFCStaff {

    private String name,staffID;
    private int totalHourWorks;
    private double sales, salary, commission, totalSales;
  
    public void setStaff(String nm, String id, int hWorks, double sale, double sala){
        name = nm;
        staffID = id;
        totalHourWorks = hWorks;
        this.sales = sale;
        this.salary = sala;
    }
    
    public void setName(String nm){
        name = nm;
    }
    
    public void setStaffID(String id){
         staffID = id;
    }
    public void setHourWorks(int hWorks){
        totalHourWorks = hWorks;
    }
   
    public String getName() {
        return name;
    }
    
    public String getStaffID(){
        return staffID;
    }
    
    public int getTotalHourWorks() {
        return totalHourWorks;
    }
    
    public void calculateSalary() {
        salary = (totalHourWorks * 8 ) + commission;
    }
    
    public double getSalary(){
        return salary;
    }
    
    public void calculateCommission() {
        if (sales >= 150 && sales <= 300)
            commission = (sales * 0.05);
        else if (sales >= 301 && sales <= 500)
            commission = (sales * 0.10);
        else if (sales > 500)
            commission = (sales * 0.15);
        else 
            commission = 0;
    }
    
    public double getTotalSales(){
        return commission;
    }
    
    public String toString() { 
        return "\nStaff Name : " +name + " " +"\nStaffID : " + staffID + " " +"\nHours Work : " + totalHourWorks + " " +"\nTotal sales : " + "RM" + sales * commission + " " +"\nTotal Salary : " + "RM" + salary; 
    }
 }