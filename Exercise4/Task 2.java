
import java.util.Scanner;
public class TestStaff {

    public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    
    //declare input as a string name,staffid, int workingDay, double salary;
    String name, staffID;
    int workingDay;
    double salary;

    Staff s1 = new Staff();   //object
         System.out.print("Name:");
         name = console.nextLine();
         System.out.print("Staff ID:");
         staffID = console.nextLine();
         System.out.print("workingDay:");
         workingDay = console.nextInt();

         //display staff info
         s1.setStaffInfo(name,staffID,workingDay);
         s1.calculateSalary();
         System.out.println("************************");
         System.out.println("STAFF INFORMATION");
         System.out.println("************************"); 
         System.out.println("Staff Name: " + s1.getName());
         System.out.println("Staff ID: " + s1.getStaffID());
         System.out.println("Staff working per day: " + s1.getWorkingDay() + "days");
         System.out.println("Staff salary:" + "RM" + s1.getSalary());
      }
}//end main

class Staff {
    private String name, staffID;
    private double salary;
    private int workingDay;
    private double calculateSalary;
            
    public void setStaffInfo(String nm, String id, int wDay){
    name = nm;
    staffID = id;
    workingDay = wDay;

	}
    public void setName(String nm){
        name = nm;
    }
    public void setStaffID(String id){
        staffID = id;
    }
    public void setWorkingDay(int wDay){
        workingDay = wDay;
    }
    public void calculateSalary(){
        salary = workingDay * 35.0;
        }
	
    public double getSalary(){
        return salary;
	}
    public String getName(){
	return name;
	}
	
    public String getStaffID(){
	return staffID;
	}
    public int getWorkingDay() {
        return workingDay;
        }
   
} //end class staff