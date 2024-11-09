package smart_deals;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {
    public Boolean add_data(String uid, String pass, String name, String mbl, String e_mail) {
        boolean is_added = false;
        try {
            
            Connection con = Create_Connection.Cret_conn();
            
            Statement stmt = con.createStatement();
            
            String q = "insert into users(user_id,password,name,mbl_no,e_mail) values('"+uid+"','"+pass+"','"+name+"','"+mbl+"','"+e_mail+"');";
            stmt.executeUpdate(q);
            
            is_added=true;
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return is_added;
    }
    
    public static boolean login(String id, String password) {
        boolean bol = false;
        
        try {
            Connection con = Create_Connection.Cret_conn();
            
            Statement stmt = con.createStatement();
            String q = "select * from users where user_id = '"+id+"' and password = '"+password+"'";
            ResultSet r =  stmt.executeQuery(q);
            
            while(r.next()) {
                
                bol = true;                
                
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return bol;
    }
    
    public static int count() {
        int count = 0;
        
        try {
            Connection con = Create_Connection.Cret_conn();
            
            Statement stmt = con.createStatement();
            String q = "select count(*) from products";
            ResultSet r =  stmt.executeQuery(q);
            
            r.next();
            count = r.getInt(1);
            
//            System.out.println(count);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return count;
    }
    
    
}
