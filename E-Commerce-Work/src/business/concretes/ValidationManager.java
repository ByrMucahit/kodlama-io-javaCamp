package business.concretes;

import business.abstracts.ValidationService;
import entities.concretes.User;

public class ValidationManager implements ValidationService {

	@Override
	public void validationEmail(User user) {
		System.out.println("Dear "+user.getFirstName()+","+"Validation link has been senden by our site.");
		System.out.println("Validation is done!!!"+"Welcome to our family "+user.getFirstName()+" "+user.getLastName()+" "+user.geteMail());
		
	}
	
}
