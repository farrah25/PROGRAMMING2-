public class Maxis extends MobileTelecommunication{

    int price;
    double speed;
    String montly;
    private String name;

    public int getPriceHotDeals(int amount){
       if (amount <=3){
       System.out.println("10GB with 1am until 7am");
       }  
       
       else if (amount >= 4 && amount <= 5){
       System.out.println("Youtube pass unlimited for 1 day");
       }  
 
       else {
       System.out.println("Music unlimited pass for 1 day");
       } 
       amount = price;
       return price;
       }
       
    //@Override
    public void setSpeed(){
       System.out.println("17.9Mpbs");
    } 
    
    //@Override  
    public void setMonthly(){
       System.out.println("RM34 with 8GB High-Speed data internet and free non-stop RED Social/Chat/Video");
   }
    
    //@encapsulation
    public void setName(String newName){
       name = newName;
   }
    
    public String getName(){
        return name;
    }
   
}