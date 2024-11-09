package smart_deals;

import java.awt.*;

import javax.swing.*;

public class Comparison_page extends First_page {
        
        ImageIcon image = new ImageIcon("Smart_Deals_225.jpg");
        ImageIcon AMAZON = new ImageIcon("Amazon.jpg");
        ImageIcon FLIPKART = new ImageIcon("Flipkart.jpg");
        ImageIcon CHROMA = new ImageIcon("Chroma.jpg");
        ImageIcon Prod_image = new ImageIcon(i1);
        
        JFrame Comp = new JFrame();
        JPanel main = new JPanel();

        JPanel PAmazon = new JPanel();
        JPanel PFlipkart = new JPanel();
        JPanel PChroma = new JPanel();
        
        JPanel BAmazon = new JPanel();
        JPanel BFlipkart = new JPanel();
        JPanel BChroma = new JPanel();
        
        JLabel ALogo = new JLabel(AMAZON);
        JLabel FLogo = new JLabel(FLIPKART);
        JLabel CLogo = new JLabel(CHROMA);
        
        JLabel ProdImage = new JLabel();
        
        JLabel APrice = new JLabel("RS."+Aprice);
        JLabel FPrice = new JLabel("RS."+Fprice);
        JLabel CPrice = new JLabel("RS."+Cprice);
        
        JLabel AOffer = new JLabel("10% off on SBI bank");
        JLabel FOffer = new JLabel("10% off on ICICI bank");
        JLabel COffer = new JLabel("10% off on HDFC bank");
        
        JLabel AOffer1 = new JLabel("credit or debit card");
        JLabel FOffer1= new JLabel("credit or debit card");
        JLabel COffer1 = new JLabel("credit or debit card");

        JLabel AProdImage = new JLabel(Prod_image);
        JLabel FProdImage = new JLabel(Prod_image);
        JLabel CProdImage = new JLabel(Prod_image);
        
        JLabel Prod_name = new JLabel(prod_name);
        
        public Comparison_page(String name, String i1, int aprice, int fprice,int cprice){
            Prod_name.setText(name);
            Prod_name.setBounds(55,5,400,50);
            Prod_name.setFont(new Font("plain", Font.PLAIN, 30));
            
            main.setBackground(new Color(200,255,255)); 
            main.setBounds(0, 0, 1015, 650);
            
            PAmazon.setBounds(25, 60, 300, 550);
            PAmazon.setBackground(new Color(127,255,212));
            
            PChroma.setBounds(350, 60, 300, 550);
            PChroma.setBackground(new Color(127,255,212));
            
            PFlipkart.setBounds(675, 60, 300, 550);
            PFlipkart.setBackground(new Color(127,255,212));
            
            
            BAmazon.setBounds(25, 60, 300, 80);
            BAmazon.setBackground(new Color(173,255,47));
            
            BChroma.setBounds(350, 60, 300, 80);
            BChroma.setBackground(new Color(173,255,47));
            
            BFlipkart.setBounds(675, 60, 300, 80);
            BFlipkart.setBackground(new Color(173,255,47));
            
            ALogo.setBounds(50, 70, 250, 60);
            CLogo.setBounds(375, 70, 250, 60);
            FLogo.setBounds(700, 70, 250, 60);
            
            APrice.setText("RS"+aprice);
            APrice.setBounds(100, 400, 300, 100);
            APrice.setFont(new Font("serif", Font.BOLD, 30));
            
            CPrice.setText("RS"+cprice);
            CPrice.setBounds(425, 400, 300, 100);
            CPrice.setFont(new Font("serif", Font.BOLD, 30));
            
            FPrice.setText("RS"+fprice);
            FPrice.setBounds(750, 400, 300, 100);
            FPrice.setFont(new Font("serif", Font.BOLD, 30));
            
            AOffer.setFont(new Font("serif", Font.BOLD, 20));
            AOffer.setBounds(88 , 450, 200, 100);
            
            AOffer1.setFont(new Font("serif", Font.BOLD, 20));
            AOffer1.setBounds(93 , 480, 200, 100);
            
            FOffer.setFont(new Font("serif", Font.BOLD, 20));
            FOffer.setBounds(402+325 , 450, 200, 100);
            
            FOffer1.setFont(new Font("serif", Font.BOLD, 20));
            FOffer1.setBounds(93+325+325 , 480, 200, 100);
            
            COffer.setFont(new Font("serif", Font.BOLD, 20));
            COffer.setBounds(400 , 450, 250, 100);
            
            COffer1.setFont(new Font("serif", Font.BOLD, 20));
            COffer1.setBounds(95+325 , 480, 200, 100);
            
            AProdImage.setBounds(75, 130, 200, 275);
            CProdImage.setBounds(400, 130, 200, 275);
            FProdImage.setBounds(725, 130, 200, 275);
            
            Prod_image = new ImageIcon(i1);
            AProdImage.setIcon(Prod_image);
            CProdImage.setIcon(Prod_image);
            FProdImage.setIcon(Prod_image);
            
            Comp.add(Prod_name);
            
            Comp.add(AProdImage);
            Comp.add(FProdImage);
            Comp.add(CProdImage);
            
            Comp.add(AOffer);
            Comp.add(AOffer1);
            
            Comp.add(FOffer);
            Comp.add(FOffer1);
            
            Comp.add(COffer);
            Comp.add(COffer1);
            
            Comp.add(APrice);
            Comp.add(CPrice);
            Comp.add(FPrice);
            
            
            Comp.add(ALogo);
            Comp.add(FLogo);
            Comp.add(CLogo);
            
            
            Comp.add(BAmazon);
            Comp.add(BFlipkart);
            Comp.add(BChroma);
            
            
            Comp.add(PAmazon);
            Comp.add(PFlipkart);
            Comp.add(PChroma);
            
            
            Comp.add(main);
            Comp.setIconImage(image.getImage());
            Comp.setTitle("SMART DEALS");
            Comp.setSize(1015, 680);
            Comp.setLocationRelativeTo(null);
            Comp.setLayout(null);
            Comp.setVisible(true);
            Comp.setDefaultCloseOperation(2);
            
        }
        
}
