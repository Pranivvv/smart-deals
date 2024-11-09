package smart_deals;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;

public class First_page extends Smart_deals implements ActionListener{

	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
    ImageIcon image = new ImageIcon("Smart_Deals_225.jpg");
    String Prod_Searched;
    
  //get all values from database
    int items[] = {1,2,3,4,5,6,7,8};          ///use this index to get data....
    String[] img = new String[8];
    String[] Prod_name = new String[8];
    String prod_name = "samsung glaxy s22 ultra";
    String i1 = "gals22.jpg";
    int Aprice = 999999;
    int Fprice = 999999;
    int Cprice = 999999;
    int Prod_count = Database.count();                      ///take this only once......
    
    
    String prod_name1 = Prod_name[0];
    String prod_name2 = Prod_name[1];
    String prod_name3 = Prod_name[2];
    String prod_name4 = Prod_name[3];
    String prod_name5 = Prod_name[4];
    String prod_name6 = Prod_name[5];
    String prod_name7 = Prod_name[6];
    String prod_name8 = Prod_name[7];
    
    
    
    ImageIcon image1 = new ImageIcon(img[0]);
    ImageIcon image2 = new ImageIcon(img[1]);
    ImageIcon image3 = new ImageIcon(img[2]);
    ImageIcon image4 = new ImageIcon(img[3]);
    ImageIcon image5 = new ImageIcon(img[4]);
    ImageIcon image6 = new ImageIcon(img[5]);
    ImageIcon image7 = new ImageIcon(img[6]);
    ImageIcon image8 = new ImageIcon(img[7]);
    
    
    JFrame myframe = new JFrame();
    
	JPanel p = new JPanel();
	JLabel logo = new JLabel();
    JPanel top = new JPanel();
    
    JButton lgin = new JButton(button1); //Login button
    JLabel user = new JLabel();
    JButton signup = new JButton(button2); //signup button
    JButton Logout = new JButton("Logout");
    JButton src = new JButton("search"); //search button
    JTextField search = new JTextField("Search Product"); //search bar
    
    
  //icons
    JButton item1 = new JButton(image1);
    JButton item2 = new JButton(image2);  
    JButton item3 = new JButton(image3);
    JButton item4 = new JButton(image4);
    JButton item5 = new JButton(image5);
    JButton item6 = new JButton(image6);
    JButton item7 = new JButton(image7);
    JButton item8 = new JButton(image8);
    
  //product names
    JLabel litem1 = new JLabel(prod_name1);
    JLabel litem2 = new JLabel(prod_name2);
    JLabel litem3 = new JLabel(prod_name3);
    JLabel litem4 = new JLabel(prod_name4);
    JLabel litem5 = new JLabel(prod_name5);
    JLabel litem6 = new JLabel(prod_name6);
    JLabel litem7 = new JLabel(prod_name7);
    JLabel litem8 = new JLabel(prod_name8);
    

    JButton fwd = new JButton(">"); // Forword button
    JButton bkwd = new JButton("<"); //Backword button
    
    void Prod_Data() {
        int j = items[0]-1;
        
            
            try {
                Connection con = Create_Connection.Cret_conn();
                    while(j<=Prod_count) {
                        if(j>items[7]) {
                            break;
                        }
                        Statement stmt = con.createStatement();
                        String q = "select * from products where prod_id ="+items[j%8];
                        ResultSet r =  stmt.executeQuery(q);
                        
                        while(r.next()) {
                            
                            Prod_name[j%8] = r.getString(2);
                            img[j%8] = r.getString(3);
//                            System.out.println(Prod_name[j%8]);
//                            System.out.println(img[j%8]);
//                            System.out.println(items[j%8]);
                            
                        }
                        j++;
                    }
                
            }catch(Exception e){
                e.printStackTrace();
            }
            
        
    }
    
    void First_page1(boolean vis){
        
        isLogin = vis;
        
        Prod_Data();
        
        prod_name1 = Prod_name[0];
        prod_name2 = Prod_name[1];
        prod_name3 = Prod_name[2];
        prod_name4 = Prod_name[3];
        prod_name5 = Prod_name[4];
        prod_name6 = Prod_name[5];
        prod_name7 = Prod_name[6];
        prod_name8 = Prod_name[7];
        
        image1 = new ImageIcon(img[0]);
        image2 = new ImageIcon(img[1]);
        image3 = new ImageIcon(img[2]);
        image4 = new ImageIcon(img[3]);
        image5 = new ImageIcon(img[4]);
        image6 = new ImageIcon(img[5]);
        image7 = new ImageIcon(img[6]);
        image8 = new ImageIcon(img[7]);
        
      
        
      
    	
    	//top cyan panal
        JPanel top =new JPanel();
        top.setBounds(00, 00, 1530, 90);
        top.setBackground(Color.cyan);

        //Login button
       
        
        lgin.setBounds(1245 ,30, 100,30);
        lgin.setVisible(!isLogin);
//      
        //lgin.setFont(new Font("sien", Font.BOLD, 25));
        
        //signup button
        signup.setBounds(1400, 30, 100, 30);
        signup.setVisible(!isLogin);
        //signup.setFont(new Font("sien", Font.BOLD, 25));
        
        Logout.setBounds(1400, 30, 100, 30);
        Logout.setVisible(isLogin);
        
        user.setBounds(1245 ,30, 100,30);
        user.setFont(new Font("sien", Font.BOLD, 20));
        user.setVisible(isLogin);

        // search bar
        search.setBounds(180, 30, 700, 30);
        
        
        
        //search button
        src.setBounds(880, 30, 80, 30);

      //icons && labels for products..
        
        
            item1.setBounds(105, 140, 225, 225);
            item1.setBackground(Color.white);
            litem1.setBounds(105, 275, 225, 225);  
            litem1.setFont(new Font("sien", Font.BOLD, 17));
            
            item2.setBounds(455, 140, 225, 225);
            item2.setBackground(Color.white);
            litem2.setBounds(455, 275, 225, 225);  
            litem2.setFont(new Font("sien", Font.BOLD, 17));
            
            item3.setBounds(785, 140, 225, 225);
            item3.setBackground(Color.white);
            litem3.setBounds(785, 275, 225, 225);  
            litem3.setFont(new Font("sien", Font.BOLD, 17));
            
            item4.setBounds(1125, 140, 225, 225);
            item4.setBackground(Color.white);
            litem4.setBounds(1125, 275, 225, 225);  
            litem4.setFont(new Font("sien", Font.BOLD, 17));
            
            item5.setBounds(105, 450, 225, 225);
            item5.setBackground(Color.white);
            litem5.setBounds(105, 585, 225, 225);  
            litem5.setFont(new Font("sien", Font.BOLD, 17));
            
            item6.setBounds(455, 450, 225, 225);
            item6.setBackground(Color.white);
            litem6.setBounds(455, 585, 225, 225);  
            litem6.setFont(new Font("sien", Font.BOLD, 17));
            
            item7.setBounds(785, 450, 225, 225);
            item7.setBackground(Color.white);
            litem7.setBounds(785, 585, 225, 225);  
            litem7.setFont(new Font("sien", Font.BOLD, 17));
            
            item8.setBounds(1125, 450, 225, 225);
            item8.setBackground(Color.white);
            litem8.setBounds(1125, 585, 225, 225);  
            litem8.setFont(new Font("sien", Font.BOLD, 17));
            

            litem8.setText(prod_name8);
            item8.setIcon(image8);
            litem7.setText(prod_name7);
            item7.setIcon(image7);
            litem6.setText(prod_name6);
            item6.setIcon(image6);
            litem5.setText(prod_name5);
            item5.setIcon(image5);
            litem4.setText(prod_name4);
            item4.setIcon(image4);
            litem3.setText(prod_name3);
            item3.setIcon(image3);
            litem2.setText(prod_name2);
            item2.setIcon(image2);
            litem1.setText(prod_name1);
            item1.setIcon(image1);
        
                
        //forword and backword button

        fwd.setBounds(1440,405,75,75);
        fwd.setFont(new Font("serif", Font.BOLD, 35));

        bkwd.setBounds(15,405,75,75);
        bkwd.setFont(new Font("serif", Font.BOLD, 35));
        bkwd.setVisible(false);

        //white panel
        JPanel p2 = new JPanel();
        p2.setBackground(Color.white);
        p2.setBounds(0, 0, 1600, 1000);
        
                
        myframe.add(user);
        myframe.add(Logout);
        myframe.add(fwd);
        myframe.add(bkwd);
        myframe.add(litem1);
        myframe.add(litem2);
        myframe.add(litem3);
        myframe.add(litem4);
        myframe.add(litem5);
        myframe.add(litem6);
        myframe.add(litem7);
        myframe.add(litem8);
        
        myframe.add(item1);
        myframe.add(item2);
        myframe.add(item3);
        myframe.add(item4);
        myframe.add(item5);
        myframe.add(item6);
        myframe.add(item7);
        myframe.add(item8);
        
        myframe.add(src);
        myframe.add(search);
        myframe.add(signup);
        myframe.add(lgin);
        myframe.add(top);
        myframe.add(p2); //keep it last to make sure it appairs below every thing//

        myframe.setExtendedState(JFrame.MAXIMIZED_BOTH);

        myframe.setIconImage(image.getImage());
        myframe.setTitle("SMART DEALS");
        myframe.setLocationRelativeTo(null);
        myframe.setLayout(null);
        myframe.setVisible(true);
        myframe.setDefaultCloseOperation(3);
        
        
    }
    
    public void setactions() {
        
        ActionListener action = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Object butn = e.getSource();
                if(butn == lgin) {
                    Login_page l = new Login_page();
                    l.Log.dispose();
                    l.Login();
                }
                else if(butn == signup) {
                    Regiration_page r = new Regiration_page();
                    r.Reg.dispose();
                    r.Regiration();
                }
                else if(butn == fwd || butn == bkwd) {
                    if(butn == fwd) {
                        for(int i=0; i<8; i++) {
                            items[i] += 8;    
//                            System.out.println(items[i]);
                        }
                    }else {
                        for(int i=0; i<8; i++) {
                            items[i] -= 8;       
//                            System.out.println(items[i]);
                        }
                    }
                    
                    
                    
                    if(items[0]> 2) {
                        bkwd.setVisible(true);
                    }else {
                        bkwd.setVisible(false);
                    }
                    if(items[7]<= Prod_count) {
                        fwd.setVisible(true);
                    }else {
                        fwd.setVisible(false);
                    }
                    
                    if(Prod_count >= items[0]) {
                        item1.setVisible(true);
                        litem1.setVisible(true);
                    }else {
                        item1.setVisible(false);
                        litem1.setVisible(false);
                    }
                    
                    if(Prod_count >= items[1]) {
                        item2.setVisible(true);
                        litem2.setVisible(true);    
                    }else {
                        item2.setVisible(false);
                        litem2.setVisible(false);
                    }
                    
                    if(Prod_count >= items[2]) {
                        item3.setVisible(true);
                        litem3.setVisible(true);
                    }else {
                        item3.setVisible(false);
                        litem3.setVisible(false);
                    }
                    
                    if(Prod_count >= items[3]) {
                        item4.setVisible(true);
                        litem4.setVisible(true);
                    }else {
                        item4.setVisible(false);
                        litem4.setVisible(false);
                    }
                    
                    if(Prod_count >= items[4]) {
                        item5.setVisible(true);
                        litem5.setVisible(true);
                    }else {
                        item5.setVisible(false);
                        litem5.setVisible(false);
                    }
                    
                    if(Prod_count >= items[5]) {
                        item6.setVisible(true);
                        litem6.setVisible(true);
                    }else {
                        item6.setVisible(false);
                        litem6.setVisible(false);
                    }
                    
                    if(Prod_count >= items[6]) {
                        item7.setVisible(true);
                        litem7.setVisible(true);
                    }else {
                        item7.setVisible(false);
                        litem7.setVisible(false);
                    }
                    
                    if(Prod_count >= items[7]) {
                        item8.setVisible(true);
                        litem8.setVisible(true);
                    }else {
                        item8.setVisible(false);
                        litem8.setVisible(false);
                    }
                    Prod_Data();
                    
                    prod_name1 = Prod_name[0];
                    prod_name2 = Prod_name[1];
                    prod_name3 = Prod_name[2];
                    prod_name4 = Prod_name[3];
                    prod_name5 = Prod_name[4];
                    prod_name6 = Prod_name[5];
                    prod_name7 = Prod_name[6];
                    prod_name8 = Prod_name[7];
                    
                    image1 = new ImageIcon(img[0]);
                    image2 = new ImageIcon(img[1]);
                    image3 = new ImageIcon(img[2]);
                    image4 = new ImageIcon(img[3]);
                    image5 = new ImageIcon(img[4]);
                    image6 = new ImageIcon(img[5]);
                    image7 = new ImageIcon(img[6]);
                    image8 = new ImageIcon(img[7]);
                    

                    litem8.setText(prod_name8);
                    item8.setIcon(image8);
                    litem7.setText(prod_name7);
                    item7.setIcon(image7);
                    litem6.setText(prod_name6);
                    item6.setIcon(image6);
                    litem5.setText(prod_name5);
                    item5.setIcon(image5);
                    litem4.setText(prod_name4);
                    item4.setIcon(image4);
                    litem3.setText(prod_name3);
                    item3.setIcon(image3);
                    litem2.setText(prod_name2);
                    item2.setIcon(image2);
                    litem1.setText(prod_name1);
                    item1.setIcon(image1);
                }
                
                else if(butn == src) {
                    Prod_Searched = search.getText();
                    Prod_Searched = Prod_Searched.toUpperCase();
                    
                    try {
                        Connection con = Create_Connection.Cret_conn();
                        
                        Statement stmt = con.createStatement();
                        String q = "select * from products where Prod_name = '"+Prod_Searched+"'";
                        ResultSet r =  stmt.executeQuery(q);
                        
                        while(r.next()) {
                            
                            prod_name = r.getString(2);
                            i1 = r.getString(3);
                            Aprice = r.getInt(4);
                            Fprice = r.getInt(5);
                            Cprice = r.getInt(6);
                            
                            
                        }
                        
                        new Comparison_page(prod_name, i1, Aprice, Fprice, Cprice);
                        
                    }catch(Exception ae){
                        ae.printStackTrace();
                    }
                }
                
                else if(butn == item1) {
                    
                    prod_name = litem1.getText();
                    
                    try {
                        Connection con = Create_Connection.Cret_conn();
                        
                        Statement stmt = con.createStatement();
                        String q = "select * from products where Prod_name = '"+prod_name+"'";
                        ResultSet r =  stmt.executeQuery(q);
                        
                        while(r.next()) {
                            
                            prod_name = r.getString(2);
                            i1 = r.getString(3);
                            Aprice = r.getInt(4);
                            Fprice = r.getInt(5);
                            Cprice = r.getInt(6);
                            
                            
                        }
                        
                        new Comparison_page(prod_name, i1, Aprice, Fprice, Cprice);
                        
                    }catch(Exception ae){
                        ae.printStackTrace();
                    }
                }
                
                else if(butn == item2) {
                    
                    prod_name = litem2.getText();
                    
                    try {
                        Connection con = Create_Connection.Cret_conn();
                        
                        Statement stmt = con.createStatement();
                        String q = "select * from products where Prod_name = '"+prod_name+"'";
                        ResultSet r =  stmt.executeQuery(q);
                        
                        while(r.next()) {
                            
                            prod_name = r.getString(2);
                            i1 = r.getString(3);
                            Aprice = r.getInt(4);
                            Fprice = r.getInt(5);
                            Cprice = r.getInt(6);
                            
                            
                        }
                        
                        new Comparison_page(prod_name, i1, Aprice, Fprice, Cprice);
                        
                    }catch(Exception ae){
                        ae.printStackTrace();
                    }
                }
                
                else if(butn == item3) {
                    
                    prod_name = litem3.getText();
                    
                    try {
                        Connection con = Create_Connection.Cret_conn();
                        
                        Statement stmt = con.createStatement();
                        String q = "select * from products where Prod_name = '"+prod_name+"'";
                        ResultSet r =  stmt.executeQuery(q);
                        
                        while(r.next()) {
                            
                            prod_name = r.getString(2);
                            i1 = r.getString(3);
                            Aprice = r.getInt(4);
                            Fprice = r.getInt(5);
                            Cprice = r.getInt(6);
                            
                            
                        }
                        
                        new Comparison_page(prod_name, i1, Aprice, Fprice, Cprice);
                        
                    }catch(Exception ae){
                        ae.printStackTrace();
                    }
                }
                
                else if(butn == item4) {
                    
                    prod_name = litem4.getText();
                    
                    try {
                        Connection con = Create_Connection.Cret_conn();
                        
                        Statement stmt = con.createStatement();
                        String q = "select * from products where Prod_name = '"+prod_name+"'";
                        ResultSet r =  stmt.executeQuery(q);
                        
                        while(r.next()) {
                            
                            prod_name = r.getString(2);
                            i1 = r.getString(3);
                            Aprice = r.getInt(4);
                            Fprice = r.getInt(5);
                            Cprice = r.getInt(6);
                            
                            
                        }
                        
                        new Comparison_page(prod_name, i1, Aprice, Fprice, Cprice);
                        
                    }catch(Exception ae){
                        ae.printStackTrace();
                    }
                }
                
                else if(butn == item5) {
                    
                    prod_name = litem5.getText();
                    
                    try {
                        Connection con = Create_Connection.Cret_conn();
                        
                        Statement stmt = con.createStatement();
                        String q = "select * from products where Prod_name = '"+prod_name+"'";
                        ResultSet r =  stmt.executeQuery(q);
                        
                        while(r.next()) {
                            
                            prod_name = r.getString(2);
                            i1 = r.getString(3);
                            Aprice = r.getInt(4);
                            Fprice = r.getInt(5);
                            Cprice = r.getInt(6);
                            
                            
                        }
                        
                        new Comparison_page(prod_name, i1, Aprice, Fprice, Cprice);
                        
                    }catch(Exception ae){
                        ae.printStackTrace();
                    }
                }
                
                else if(butn == item6) {
                    
                    prod_name = litem6.getText();
                    
                    try {
                        Connection con = Create_Connection.Cret_conn();
                        
                        Statement stmt = con.createStatement();
                        String q = "select * from products where Prod_name = '"+prod_name+"'";
                        ResultSet r =  stmt.executeQuery(q);
                        
                        while(r.next()) {
                            
                            prod_name = r.getString(2);
                            i1 = r.getString(3);
                            Aprice = r.getInt(4);
                            Fprice = r.getInt(5);
                            Cprice = r.getInt(6);
                            
                            
                        }
                        
                        new Comparison_page(prod_name, i1, Aprice, Fprice, Cprice);
                        
                    }catch(Exception ae){
                        ae.printStackTrace();
                    }
                }
                
                else if(butn == item7) {
                    
                    prod_name = litem7.getText();
                    
                    try {
                        Connection con = Create_Connection.Cret_conn();
                        
                        Statement stmt = con.createStatement();
                        String q = "select * from products where Prod_name = '"+prod_name+"'";
                        ResultSet r =  stmt.executeQuery(q);
                        
                        while(r.next()) {
                            
                            prod_name = r.getString(2);
                            i1 = r.getString(3);
                            Aprice = r.getInt(4);
                            Fprice = r.getInt(5);
                            Cprice = r.getInt(6);
                            
                            
                        }
                        
                        new Comparison_page(prod_name, i1, Aprice, Fprice, Cprice);
                        
                    }catch(Exception ae){
                        ae.printStackTrace();
                    }
                }
                
                else if(butn == item8) {
                    
                    prod_name = litem8.getText();
                    
                    try {
                        Connection con = Create_Connection.Cret_conn();
                        
                        Statement stmt = con.createStatement();
                        String q = "select * from products where Prod_name = '"+prod_name+"'";
                        ResultSet r =  stmt.executeQuery(q);
                        
                        while(r.next()) {
                            
                            prod_name = r.getString(2);
                            i1 = r.getString(3);
                            Aprice = r.getInt(4);
                            Fprice = r.getInt(5);
                            Cprice = r.getInt(6);
                            
                            
                        }
                        
                        new Comparison_page(prod_name, i1, Aprice, Fprice, Cprice);
                        
                    }catch(Exception ae){
                        ae.printStackTrace();
                    }
                }
                else if(butn == Logout) {
                    isLogin = false;
                    myframe.dispose();
                    First_page1(false);
                    setactions();
                }
                
            }
              
        };
        
        lgin.addActionListener(action);
        signup.addActionListener(action);
        fwd.addActionListener(action);
        bkwd.addActionListener(action);
        src.addActionListener(action);
        item1.addActionListener(action);
        item2.addActionListener(action);
        item3.addActionListener(action);
        item4.addActionListener(action);
        item5.addActionListener(action);
        item6.addActionListener(action);
        item7.addActionListener(action);
        item8.addActionListener(action);
        Logout.addActionListener(action);
//        new ActionListener()
    }
    
    public void prevpage() {
        myframe.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    
}
