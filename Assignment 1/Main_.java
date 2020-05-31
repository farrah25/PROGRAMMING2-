public class Main_ {
   public static void main(String[] args) {

       MobileTelecommunication mt = new MobileTelecommunication ();
       Celcom c = new Celcom();
       Digi d = new Digi();
       Maxis m = new Maxis();
       
       System.out.println("___________________________~MOBILE TELECOMMUNICATION~_____________________________");
       mt.setDaily();
       mt.setWeekly();   
       mt.setFreeBasic();
       mt.setFreeDaily();
       
      System.out.println("\n********************************FEATURES OF CELCOM******************************");
       c.setName("Celcom");
       System.out.println(c.getName());
       c.setSpeed();
       c.setDaily();
       c.setWeekly();
       c.setFreeBasic();
       c.setFreeDaily();
       c.setHotspotAddOn();
       c.setMonthly(); 
       c.promoRaya("Enjoy Mega Unlimited Internet Plan from just RM" +"18");
      
       System.out.println("\n*******************************FEATURES OF DIGI********************************");
       d.setName("Digi");
       System.out.println(d.getName());
       d.setSpeed();
       d.setDaily();
       d.setWeekly();
       d.setFreeBasic();
       d.setFreeDaily();
       d.setMonthly(); 
       d.setMidnight("RM2 with 10GB High-Speed data internet for only six hour");    
       System.out.println(d.getMidnight());
       d.user("Farrah" ,21);
       
       System.out.println("\n*******************************FEATURES OF MAXIS******************************");
       m.setName("Maxis");
       System.out.println(m.getName());
       m.setSpeed();
       m.setDaily();
       m.setWeekly();
       m.getPriceHotDeals(6);
       m.setFreeBasic();
       m.setFreeDaily();
       m.setMonthly();  

   }}
