// Java program to implement  VC
// a Simple Registration Form 
// using Java Swing 
//Credit to : www.geeksforgeeks.org/java-swing-simple-user-registration-form/
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

class Mobile_Telecom extends JFrame implements ActionListener { 

   // Components of the Form 
   private Container c; 
   private JLabel title; 
   private JLabel name; 
   private JTextField tname; 
   private JLabel ic;  
   private JTextField tic;
   private JLabel num;
   private JTextField tnum;
   private JLabel typ;
   private JTextField ttyp;
   private JRadioButton cl;
   private JRadioButton dg;
   private JRadioButton mx;
   private ButtonGroup typgp; 
   private JLabel add; 
   private JTextArea tadd; 
   private JCheckBox term; 
   private JButton y; 
   private JButton n; 
   private JTextArea tout; 
   private JLabel res; 
   private JTextArea resadd; 

   // constructor, to initialize the components 
   // with default values. 
   public Mobile_Telecom() 
   { 

      setTitle("MOBILE TELECOMMUNICATION");
      setBounds(300, 90, 900, 600);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setResizable(false);

      c = getContentPane(); 
      c.setLayout(null); 

      title = new JLabel("MOBILE TELECOMMUNICATION"); 
      title.setFont(new Font("Calibri;.", Font.PLAIN, 30)); 
      title.setSize(500, 30); 
      title.setLocation(200, 30); 
      c.add(title); 

      name = new JLabel("Name"); 
      name.setFont(new Font("Calibri", Font.PLAIN, 20)); 
      name.setSize(100, 20); 
      name.setLocation(100, 100); 
      c.add(name); 

      tname = new JTextField(); 
      tname.setFont(new Font("Calibri", Font.PLAIN, 15)); 
      tname.setSize(190, 20); 
      tname.setLocation(200, 100); 
      c.add(tname); 

      ic = new JLabel("Ic Num"); 
      ic.setFont(new Font("Calibri", Font.PLAIN, 20)); 
      ic.setSize(100, 20); 
      ic.setLocation(100, 150); 
      c.add(ic);  
      
      tic = new JTextField(); 
      tic.setFont(new Font("Calibri", Font.PLAIN, 15)); 
      tic.setSize(190, 20); 
      tic.setLocation(200, 150); 
      c.add(tic); 
      
      num = new JLabel("Phone Num"); 
      num.setFont(new Font("Calibri", Font.PLAIN, 20)); 
      num.setSize(100, 20); 
      num.setLocation(100, 200); 
      c.add(num);  

      tnum = new JTextField(); 
      tnum.setFont(new Font("Calibri", Font.PLAIN, 15)); 
      tnum.setSize(190, 20); 
      tnum.setLocation(200, 200); 
      c.add(tnum); 

      add = new JLabel("Address"); 
      add.setFont(new Font("Calibri", Font.PLAIN, 20)); 
      add.setSize(100, 20); 
      add.setLocation(100, 250); 
      c.add(add); 

      tadd = new JTextArea(); 
      tadd.setFont(new Font("Calibri", Font.PLAIN, 15)); 
      tadd.setSize(200, 60); 
      tadd.setLocation(200, 250); 
      tadd.setLineWrap(true); 
      c.add(tadd); 

      typ = new JLabel("Please select type of Mobile Telecommunication"); 
      typ.setFont(new Font("Calibri", Font.PLAIN, 20)); 
      typ.setSize(400, 20); 
      typ.setLocation(100, 320); 
      c.add(typ);  
      
      cl = new JRadioButton("CELCOM"); 
      cl.setFont(new Font("Calibri", Font.PLAIN, 15));
      cl.setSelected(true); 
      cl.setSize(100, 20); 
      cl.setLocation(120, 350);  
      c.add(cl);
      
      dg = new JRadioButton("DIGI"); 
      dg.setFont(new Font("Calibri", Font.PLAIN, 15)); 
      dg.setSelected(false);
      dg.setSize(100, 20); 
      dg.setLocation(230, 350); 
      c.add(dg);
      
      mx = new JRadioButton("MAXIS"); 
      mx.setFont(new Font("Calibri", Font.PLAIN, 15)); 
      mx.setSelected(false);
      mx.setSize(100, 20); 
      mx.setLocation(320, 350); 
      c.add(mx);
      
      typgp = new ButtonGroup(); 
      typgp.add(cl); 
      typgp.add(dg);
      typgp.add(mx);
      

      term = new JCheckBox("Accept Terms And Conditions."); 
      term.setFont(new Font("Calibri", Font.PLAIN, 15)); 
      term.setSize(250, 20); 
      term.setLocation(150, 400); 
      c.add(term); 

      y = new JButton("YES"); 
      y.setFont(new Font("Calibri", Font.PLAIN, 15)); 
      y.setSize(100, 20); 
      y.setLocation(150, 450); 
      y.addActionListener(this); 
      c.add(y); 

      n = new JButton("NO"); 
      n.setFont(new Font("Calibri", Font.PLAIN, 15)); 
      n.setSize(100, 20); 
      n.setLocation(270, 450); 
      n.addActionListener(this); 
      c.add(n); 

      tout = new JTextArea(); 
      tout.setFont(new Font("Calibri", Font.PLAIN, 15)); 
      tout.setSize(360, 400); 
      tout.setLocation(500, 100); 
      tout.setLineWrap(true); 
      tout.setEditable(false); 
      c.add(tout); 

      res = new JLabel(""); 
      res.setFont(new Font("Calibri", Font.PLAIN, 20)); 
      res.setSize(500, 25); 
      res.setLocation(100, 500); 
      c.add(res); 

      resadd = new JTextArea(); 
      resadd.setFont(new Font("Calibri", Font.PLAIN, 15)); 
      resadd.setSize(200, 75); 
      resadd.setLocation(580, 175); 
      resadd.setLineWrap(true); 
      c.add(resadd); 

      setVisible(true); 
   } 

   // method actionPerformed() 
   // to get the action performed 
   // by the user and act accordingly 
   public void actionPerformed(ActionEvent e) 
   { 
      if (e.getSource() == y) { 
         if (term.isSelected()) { 
            String data2; 
            String data 
               = "Name : "
               + tname.getText() + "\n"
               + "Ic Num: "
               + tic.getText()+ "\n" 
               + "Phone Num: "
               + tnum.getText() + "\n";           
          
            if (cl.isSelected()) {
               data2 = "Type of mobile:CELCOM"
                     + "\nRM3:"+"1GB(daily)"
                     + "\nRM10:"+"5GB(weekly)"
                     + "\n10GB free basic internet every month"
                     + "\n1GB free data internet at 8am until 6pm! #StayAtHome"
                     + "\n1.Speed:14.7Mpbs"
                     + "\n2.HotspotAddOn:RM1 with 1GB in one days & RM3 with 5GB in three days"
                     + "\n3.MonthlyInternet:RM30 with 10GB High-Speed internet & free call to all network"; }
                     
            else if(dg.isSelected()) {
               data2 = "Type of mobile : DIGI"
                     + "\nRM3:"+"1GB(daily)"
                     + "\nRM10:"+"5GB(weekly)"
                     + "\n10GB free basic internet every month"
                     + "\n1GB free data internet at 8am until 6pm! #StayAtHome"
                     + "\n1.Speed:10.7Mpbs"
                     + "\n2.Midnight:RM2 with 10GB High-Speed internet for only six hour"
                     + "\n3.MonthlyInternet:RM30 with 10GB High-Speed internet & free call to Digi network"; }
                     
            else  {
               data2 = "Type of mobile : MAXIS"
                     + "\nRM3:"+"1GB(daily)"
                     + "\nRM10:"+"5GB(weekly)"
                     + "\n10GB free basic internet every month"
                     + "\n1GB free data internet at 8am until 6pm! #StayAtHome"
                     + "\nSpeed:17.9Mpbs"
                     + "\nPriceHotDeals:"
                     + "\n1.RM3:10GB with 1am until 7am"
                     + "\n2.RM5:Youtube pass unlimited for 1 day"
                     + "\n3.RM6:Music unlimited pass for 1 day"; }
                        
            String data1 = "Address: " + tadd.getText() + "\n";        
            tout.setText(data + data1 + data2); 
            tout.setEditable(false); 
            res.setText("Successful Registered..."); 
         } 
         else { 
            tout.setText(""); 
            resadd.setText(""); 
            res.setText("Please accept the"
                     + " terms & conditions.."); 
         } 
      } 

      else if (e.getSource() == n) { 
         String def = ""; 
         tname.setText(def); 
         tadd.setText(def); 
         tic.setText(def);
         tnum.setText(def);
         res.setText(def); 
         tout.setText(def); 
         term.setSelected(false); 
         resadd.setText(def); 
      } 
   } 
} 

// Driver Code 
class Registration { 

   public static void main(String[] args) 
   { 
      Mobile_Telecom f = new Mobile_Telecom(); 
   } 
} 
