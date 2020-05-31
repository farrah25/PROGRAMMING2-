public class Digi extends MobileTelecommunication{
    String monthly, speed;
    private String name;
    private String midnight;
    int age = 21;
    String nama;
    
    //@encapsulation
    public void setName(String newName){
       name = newName;
   }
    
    public String getName(){
        return name;
    }    
    
    //@encapsulation
    public void setMidnight(String newMidnight){
       midnight= newMidnight;
   }
    
    public String getMidnight(){
        return midnight;
    }
    
    //@Override  
    public void setMonthly(){
       System.out.println("RM30 with 10GB High-Speed data internet and free call to Digi network");
   }
    
    //@Override
    public void setSpeed(){
       System.out.println("10.7Mpbs");
   } 
    
    //@overloading
    public void user(String nama){
        System.out.println("Ask data user: "+nama);
    }
    
    public void user(int age){
        System.out.println("Ask data user: my age is "+age);
    }
    
    public void user(String nama, int age){
        System.out.println("Ask data user: "+nama+" , my age is "+age);
    }


}
