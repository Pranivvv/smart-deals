package smart_deals;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Regiration_page {
    
    boolean bool;
    String uid, name, e_mail, pass, cpass, mbl, empty;
	
	ImageIcon image = new ImageIcon("Smart_Deals_225.jpg");
	
	JFrame Reg = new JFrame();
	
	JLabel Lname = new JLabel("NAME *");
	JLabel Lmbl = new JLabel("MOBILE NO. *");
	JLabel Lmail = new JLabel("E-MAIL *");
	JLabel Lusername = new JLabel("USERNAME *");
	JLabel Lpass = new JLabel("PASSWORD *");
	JLabel Lcpass = new JLabel("CONFIRM PASSWORD *");

	JTextField Tname = new JTextField();
	JTextField Tmbl = new JTextField();
	JTextField Tmail = new JTextField();
	JTextField Tusername = new JTextField();
	JPasswordField Tpass = new JPasswordField();
	JPasswordField Tcpass = new JPasswordField();
	
	JButton regbtn = new JButton("REGISTER");
	
	JPanel p2 = new JPanel();
	
	JLabel blank = new JLabel();
    
    JLabel mismatch = new JLabel();
    
    JLabel print = new JLabel("fill all the fields with *");
    
    JLabel sucess = new JLabel();
	

    public void Regiration() {
        
        p2.setBackground(Color.white);
        p2.setBounds(0, 0, 1600, 1000);
        
        print.setBounds(100, 25, 300, 50);
        
        blank.setBounds(100, 375, 300, 50);
        blank.setFont(new Font("PLAIN",Font.BOLD, 17));
        blank.setText("Fill all fields with * mark");
        blank.setVisible(false);
        mismatch.setBounds(100, 375, 300, 50);
        mismatch.setFont(new Font("PLAIN",Font.BOLD, 17));
        sucess.setBounds(100, 375, 300, 50);
        sucess.setFont(new Font("PLAIN",Font.BOLD, 17));
        

		Lname.setBounds(100, 80, 200, 40);
		Lname.setFont(new Font("serif", Font.BOLD, 18));
		Lmbl.setBounds(100, 130, 200, 40);
		Lmbl.setFont(new Font("serif", Font.BOLD, 18));
		Lmail.setBounds(100, 180, 200, 40);
		Lmail.setFont(new Font("serif", Font.BOLD, 18));
		Lusername.setBounds(100, 230, 200, 40);
		Lusername.setFont(new Font("serif", Font.BOLD, 18));
		Lpass.setBounds(100, 280, 200, 40);
		Lpass.setFont(new Font("serif", Font.BOLD, 18));
		Lcpass.setBounds(100, 330, 300, 40);
		Lcpass.setFont(new Font("serif", Font.BOLD, 18));
		
		Tname.setBounds(400, 80, 300, 40);
		Tname.setFont(new Font("serif", Font.BOLD, 18));
		Tmbl.setBounds(400, 130, 300, 40);
		Tmbl.setFont(new Font("serif", Font.BOLD, 18));
		Tmail.setBounds(400, 180, 300, 40);
		Tmail.setFont(new Font("serif", Font.BOLD, 18));
		Tusername.setBounds(400, 230, 300, 40);
		Tusername.setFont(new Font("serif", Font.BOLD, 18));
		Tpass.setBounds(400, 280, 300, 40);
		Tpass.setFont(new Font("serif", Font.BOLD, 18));
		Tcpass.setBounds(400, 330, 300, 40);
		Tcpass.setFont(new Font("serif", Font.BOLD, 18));
		empty = Tname.getText();
		
		regbtn.setBackground(new Color(0, 230, 180));
		regbtn.setBounds(300, 430, 200, 70);
		regbtn.addActionListener(new ActionListener() {
		    @Override
            public void actionPerformed(ActionEvent e) {
    		      uid = Tusername.getText();
    		      pass = Tpass.getText();
    		      cpass = Tcpass.getText();
    		      name = Tname.getText();
    		      mbl = Tmbl.getText();
    		      e_mail = Tmail.getText();   
        		  
    		      if(uid.isEmpty() || pass.isEmpty() || cpass.isEmpty() || name.isEmpty() || mbl.isEmpty() || e_mail.isEmpty()) {
    		          blank.setVisible(true);
    		      }
    		      else {
    		          if(Tpass.getText().equals(Tcpass.getText())){
                          Database d = new Database();
                          
                          bool = d.add_data( uid, pass, name, mbl, e_mail);
                          if(bool) {
                              sucess.setText("registration successful");
                              
                          }else {
                              sucess.setText("registration unsuccessful try again");
                          }
    		          }else {
    		              mismatch.setText("passwords dose not match ");
                    }
    		      }
    		      
    		      Tname.setText("");
                  Tmbl.setText("");
                  Tmail.setText("");
                  Tusername.setText("");
                  Tpass.setText("");
                  Tcpass.setText("");
    		      
               }
    		    
    	});
		
		
		
		
		Reg.add(blank);
		Reg.add(regbtn);
		Reg.add(print);
		Reg.add(mismatch);
		Reg.add(sucess);
		Reg.add(Lname);
		Reg.add(Lmbl);
		Reg.add(Lmail);
		Reg.add(Lusername);
		Reg.add(Lpass);
		Reg.add(Lcpass);
		Reg.add(Tname);
		Reg.add(Tmbl);
		Reg.add(Tmail);
		Reg.add(Tusername);
		Reg.add(Tpass);
		Reg.add(Tcpass);
		
		Reg.setSize(800,650);
		Reg.setIconImage(image.getImage());
        Reg.setResizable(false);
        Reg.setAlwaysOnTop(true);
        Reg.setTitle("REGISTRATION PAGE");
        Reg.setLocationRelativeTo(null);
        Reg.setLayout(null);
        Reg.setVisible(true);
        Reg.setDefaultCloseOperation(2);
        
        Reg.add(p2);
             
    }
	

}






///////put all this in register button  action listnere

//uid = Tusername.getText();
//pass = Tpass.getText();
//cpass = Tcpass.getText();
//name = Tname.getText();
//mbl = Integer.parseInt(Tmbl.getText());
//e_mail = Tmail.getText();

//public static boolene is_added = false;
//if(uid != null && name!=null && mbl != 0 && e_mail != null && pass != null && cpass != null) {
//if(pass == cpass) {
////connection to add data into data base
//
//try {
//
//Connection con = Create_Connection.Cret_conn();
//String quire = "insert into users(user_id varchar(45),password varchar(45), name varchar(45), mbl_no int, e-mail varchar(45)) values(?,?,?,?,?)";
//
//PreparedStatement register = con.prepareStatement(quire);
//register.setString(1, uid);
//register.setString(2, pass);
//register.setString(3, name);
//register.setString(4, mbl);
//register.setString(5, e_mail);
//
//register.executeUpdate();
//
//is_added=true;
//
//
//}catch(Exception e){
//e.printStackTrace();
//}
//
//}
//else {
//Reg.add(mismatch);
//}
//}else {
//JLabel print = new JLabel("fill all the fields with *");
//print.setBounds(100, 375, 300, 50);
//Reg.add(print);
//}
//
//if(is_added) {
//JLabel sucess = new JLabel("registration ssuccessful");
//sucess.setBounds(300, 500, 200, 50);
//sucess.setFont(new Font("PLAIN",Font.BOLD, 17));
//Reg.add(sucess);
//}









//uid = Tusername.getText();
//pass = Tpass.getText();
//cpass = Tcpass.getText();
//name = Tname.getText();
//mbl = Tmbl.getText();
//e_mail = Tmail.getText();
//
//Boolean is_added = false;
//if(uid != null && name!=null && mbl != null && e_mail != null && pass != null && cpass != null) {
//    if(pass == cpass) {
//      //connection to add data into data base
//      
//      try {
//          
//          Connection con = Create_Connection.Cret_conn();
//          String quire = "insert into users(user_id varchar(45),password varchar(45), name varchar(45), mbl_no varchar(45), e-mail varchar(45)) values(?,?,?,?,?)";
//          
//          PreparedStatement register = con.prepareStatement(quire);
//          register.setString(1, uid);
//          register.setString(2, pass);
//          register.setString(3, name);
//          register.setString(4, mbl);
//          register.setString(5, e_mail);
//          
//          register.executeUpdate();
//          
//          is_added=true;
//          
//          
//      }catch(Exception ae){
//          ae.printStackTrace();
//      }
//      
//    }
//    else {
//      Reg.add(mismatch);
//    }
//}else {
//JLabel print = new JLabel("fill all the fields with *");
//print.setBounds(100, 375, 300, 50);
//Reg.add(print);
//}
//
//if(is_added) {
//JLabel sucess = new JLabel("registration ssuccessful");
//sucess.setBounds(300, 500, 200, 50);
//sucess.setFont(new Font("PLAIN",Font.BOLD, 17));
//Reg.add(sucess);
//}
