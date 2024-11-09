package smart_deals;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login_page extends Smart_deals {
	/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;
	
	
	ImageIcon image = new ImageIcon("Smart_Deals_225.jpg");
	//Loginpage
	JFrame Log = new JFrame();
	JLabel username = new JLabel("User Name"); //user name label
    JLabel Pass = new JLabel("Password"); //password label 
    JLabel lbl = new JLabel("Username or Password is Incorrect"); //uncussesfull login 
    JTextField uid = new JTextField();
    JPasswordField pwd = new JPasswordField();
    JButton Login = new JButton("LOGIN");
    String id = uid.getText();
    String password = pwd.getText();
    
    public void Login() {
        
        
    	username.setBounds(150, 100, 200, 50);
        username.setFont(new Font("serif", Font.BOLD, 18));
        
        Pass.setBounds(150, 175, 200, 50);
        Pass.setFont(new Font("serif", Font.BOLD, 18));

        lbl.setBounds(200, 235, 2000, 50);
        lbl.setVisible(false);

        uid.setBounds(250, 100, 200, 50);
        uid.setFont(new Font("serif", Font.BOLD, 18));
        
        pwd.setBounds(250, 175, 200, 50);
        pwd.setFont(new Font("serif", Font.BOLD, 18));

        Login.setBounds(200, 300, 200, 50);
        Login.setBackground(new Color(0, 230, 180));
        Login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean bool;
                String id = uid.getText();
                String password = pwd.getText();
                
                if(id.isEmpty() || password.isEmpty()) {
                    lbl.setText("Fill all of above fields");
                    lbl.setBounds(250, 235, 2000, 50);
                    lbl.setVisible(true);
                }
                else {
                    bool = Database.login(id, password);
                    
                    if(bool) {
                        isLogin = true;
                        First_page fp = new First_page();
                        fp.user.setText(id);
//                        fp.user.setVisible(true);
//                        fp.Logout.setVisible(true);
//                        fp.lgin.setVisible(false);
//                      fp.signup.setVisible(false);
                        
                        fp.Prod_Data();
                        fp.First_page1(isLogin);
                        fp.setactions();
//                        system.out.println(id.isEmpty());
                        Log.dispose();
                    }
                    else {
                        lbl.setBounds(200, 235, 2000, 50);

                        lbl.setVisible(true);
                    }
                }
                
                uid.setText("");
                pwd.setText("");
  
            }
            
        });
        
       // Login.addActionListener(Log);
        Log.setIconImage(image.getImage());
        Log.add(Login);
        Log.add(username);
        Log.add(lbl);
        Log.add(Pass);
        Log.add(uid);
        Log.add(pwd);
        Log.setSize(600,500);
        Log.setResizable(false);
        Log.setAlwaysOnTop(true);
        Log.setTitle("LOGIN PAGE");
        Log.setLocationRelativeTo(null);
        Log.setLayout(null);
        Log.setVisible(true);
        Log.setDefaultCloseOperation(2);
    }
    
  
    
}
