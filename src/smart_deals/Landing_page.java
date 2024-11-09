package smart_deals;
import java.awt.*;

import javax.swing.*;

public class Landing_page extends JFrame{
	/*
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	ImageIcon image = new ImageIcon("Smart_Deals_225.jpg");
	JPanel p = new JPanel();
	JLabel logo = new JLabel();
	
	Landing_page(){
		p.setBackground(Color.white);
        p.setBounds(0, 0, 600, 500);
        
        logo.setIcon(new ImageIcon("Smart_Deals_225.jpg"));
        logo.setBounds(190, 125, 225, 200);
        
        this.setIconImage(image.getImage());
        this.setTitle("SMART DEALS");
        this.add(logo);
        this.add(p);
        this.setSize(600,500);
        this.setLocationRelativeTo(null);
        this.setUndecorated(false);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(3);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.dispose();
        
	}
}
