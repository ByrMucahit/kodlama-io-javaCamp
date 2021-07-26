package core;

import Google.GoogleManager;
import business.abstracts.CheckService;
import business.abstracts.userService;
import business.concretes.CheckManager;
import entities.concretes.User;

public class GoogleServiceAdapter implements userService {

	@Override
	public void signUp(User user) {
		GoogleManager gManager = new GoogleManager();
		gManager.gMailVerification(user.geteMail(), user.getPassword());
		
	}

	@Override
	public void signIn(User user) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				CheckService checkUnit = new CheckManager();
				boolean mailFlag;
				mailFlag = checkUnit.emailFormatCheckService(user.geteMail());
				boolean passwordFlag;
				passwordFlag = checkUnit.passwordCheckService(user.getPassword());
				
				if(mailFlag == true && passwordFlag == true) {
					System.out.println("Successfully, Don't faced any error"+",Welcome to Google");
					
				}
				else {
					System.out.println("Something went wrong"+",By Google");
				}
	}

}
