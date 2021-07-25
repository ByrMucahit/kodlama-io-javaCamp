package business.concretes;

import Adapter.GoogleServiceAdapter;
import business.abstracts.CheckService;
import business.abstracts.userService;
import entities.concretes.User;

public class userManager implements userService {

	@Override
	public void signUp(User user) {
		// 1-Check Session
				CheckService checking = new CheckManager();
				
				// 1.1-Name Checking
				boolean nameVariable;
				nameVariable = checking.nameCheckService(user.getFirstName());
				//System.out.println(nameVariable);
				
				//1.2-Lastname Checking
				boolean lastNameVariable;
				lastNameVariable = checking.lastNameCheckService(user.getLastName());
				//System.out.println(lastNameVariable);
				
				// 1.3- Password Check Session
				boolean passwordVariable;
				passwordVariable = checking.passwordCheckService(user.getPassword());
				/*System.out.println(variable);*/
				
				//1.4- Email format Check Session
				boolean emailVariable;
				emailVariable = checking.emailFormatCheckService(user.geteMail());
				//System.out.println(emailVariable);
				
				//1.5- Ýs email repeated?
				boolean repeatChecking;
				repeatChecking = checking.originEmailCheck(user,user.geteMail());
				if(repeatChecking == false) {
					System.out.println("Email is available");
					user.setEmailList(user.geteMail());
				}
				
				
				if(nameVariable == true && lastNameVariable==true && passwordVariable==true && emailVariable== true && repeatChecking == false) {
					System.out.println("Your account has been created");
					
				}
				

				
				
			 
	
	}

	@Override
	public void signIn(User user) {
		// TODO Auto-generated method stub
		CheckService checkUnit = new CheckManager();
		boolean mailFlag;
		mailFlag = checkUnit.emailFormatCheckService(user.geteMail());
		boolean passwordFlag;
		passwordFlag = checkUnit.passwordCheckService(user.getPassword());
		
		if(mailFlag == true && passwordFlag == true) {
			System.out.println("Successfully, Don't faced any error");
			
		}
		else {
			System.out.println("Something went wrong");
		}
	
	}
	
	

}
