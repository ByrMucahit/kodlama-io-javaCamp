import Adapter.GoogleServiceAdapter;
import business.abstracts.userService;
import business.concretes.userManager;
import entities.concretes.User;

public class app {
	public static void main(String[] args) {
		// 1. Sign Up - SignIn
		User user = new User();
		user.setFirstName("Muhammet Mücahit");
		user.setLastName("BAYAR");
		user.setPassword("564546565");
		user.seteMail("m.mucahitbayar@gmail.com");
		
		userService userManager = new userManager();
		userManager.signUp(user);
		userManager.signIn(user);
		
		// 2. Google 
		
		userService googleManager = new GoogleServiceAdapter();
		googleManager.signUp(user);
		googleManager.signIn(user);
		
	
	}
}
