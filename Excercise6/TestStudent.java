//package teststudent;

/**
 *
 * @author A C E R
 */
import java.util.Scanner;
public class TestStudent {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         Scanner scan= new Scanner(System.in);
         String header1 = "MatricNo";
         String header2 = "AverageMark";
         String[] matricNo = new String[3];
         double[] test1 = new double[3];
         double[] test2 = new double[3];
         double[] averageMark = new double[3];
         
         Student s1 = new Student();
         Student [] studDegree = new Student[3];
         for (int i = 0; i < 3; i++){
         System.out.print("Matric No:");  
         matricNo[i] = sc.nextLine();
         System.out.print("Test 1:");
         test1[i] = scan.nextDouble();
         System.out.print("Test 2:");
         test2[i] = scan.nextDouble();
         averageMark[i]= (test1[i] + test2[i]) / 2;
         }
         
         s1.calculateAverage();
         s1.getStudentInfo();
         System.out.println("************************");
         System.out.println("  STUDENT INFORMATION  ");
         System.out.println("************************"); 
         System.out.printf("%-10s%-10s%n", header1, header2);
           for(int i=0; i<3; i++){
           System.out.printf("%-10s%-10.2f%n", matricNo[i], averageMark[i]);
           }
      }
  }

    class Student {
        private String matricNo;
        private double test1, test2, averageMark;
        
        //constructor
        public void setStudent(String matric, double ts1, double ts2 ){

        matricNo = matric;
        test1 = ts1;
        test2 = ts2;
        }

    public void setMatricNo(String matricNo) {
        this.matricNo = matricNo;
    }

    public void setTest1(double test1) {
        this.test1 = test1;
    }

    public void setTest2(double test2) {
        this.test2 = test2;
    }
    
    //method that returns some of students’ info
    public String getStudentInfo()
    {
        return "\t"+matricNo+"\t\t"+averageMark;
    }
    
    //method that calculates the average of 2 tests
    public void calculateAverage()
    {
        averageMark = (test1 + test2)/2;
    }   
}
