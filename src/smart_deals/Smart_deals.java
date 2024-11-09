package smart_deals;

public class Smart_deals {
    String button1 = "Login";
    String button2 = "Signup";
    static boolean isLogin = false;

	public static void main(String args[]) {
		
		Landing_page L = new Landing_page();
		First_page fp = new First_page();
        fp.First_page1(isLogin);
        fp.setactions();
//		Login_page L = new Login_page();
//		Regiration_page r = new Regiration_page();
//		new Comparison_page();
	}

}