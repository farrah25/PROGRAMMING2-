public class Celcom extends MobileTelecommunication {
    
    private String name;
    String megaUnimited;
    int price;
    
    public void setHotspotAddOn(){
       System.out.println("RM1 with 1GB in one days & RM3 with 5GB in three days ");
   }
    //@Overide
    public void setMonthly(){
       System.out.println("RM30 with 10GB High-Speed data internet and free call to all network");
   }
    
    //@Override
    public void setSpeed(){
       System.out.println("14.7Mpbs");
   }
    
    //@encapsulation
    public void setName(String newName){
       name = newName;
   }
    
    public String getName(){
        return name;
    }
    
    //@overloading
    public void promoRaya(String megaUnlimited){
        System.out.println("PromotionHariRaya: "+megaUnlimited);
    }
    
    public void promoRaya(int price){
        System.out.println("PromotionHariRaya: RM" +price);
    }
    
    public void promoRaya(String megaUnlimited, int price ){
        System.out.println("PromotionHariRaya: "+megaUnlimited+" , RM"+price);
    }
    
    
}
