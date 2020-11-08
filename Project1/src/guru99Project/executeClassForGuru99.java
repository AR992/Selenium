package guru99Project;

public class executeClassForGuru99 {

	public static void main(String[] args) {
		
		guru99Class execute = new guru99Class();
		
		execute.invokeBrowser();
		execute.login("mngr293551", "gUbasyt");
		execute.addCustomer();
		
		String customerID = execute.getCustomerId();
		System.out.println(customerID);
	}

}
