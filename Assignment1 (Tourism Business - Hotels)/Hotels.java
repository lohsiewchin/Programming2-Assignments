package Assignment1;
import java.util.*;
public class Hotels {

	Scanner in = new Scanner(System.in);
	String username;
	String password;
	
	public void UserLogin() {
		System.out.print("User Name\t: ");
		username=in.next();
		System.out.print("Password\t: ");
		password=in.next();
		
		if(username.equals("loh") && password.equals("abc123")) {
			System.out.println("\nLOGIN SSUCCESSFULLY!\n");
		}
		else
			System.out.println("\nLOGIN UNSSUCCESSFULLY!"
					+ "\nPlease enter valid User Name and Password!\n");
	}
}
