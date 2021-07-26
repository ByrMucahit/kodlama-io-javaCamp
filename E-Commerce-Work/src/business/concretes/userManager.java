package business.concretes;

import business.abstracts.CheckService;
import business.abstracts.ValidationService;
import business.abstracts.userService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class userManager implements userService {
	
	private CheckService checkManager;
	private UserDao userDao;
	private ValidationService verifyService;
	public userManager(CheckService checkManager, UserDao userDao, ValidationService verifyService) {
		this.checkManager = checkManager;
		this.userDao = userDao;
		this.verifyService = verifyService;
	}
	
	@Override
	public void signUp(User user) {
		// 1-Check Session
			
				
				// 1.1-Name Checking
				boolean nameVariable;
				nameVariable = checkManager.nameCheckService(user.getFirstName());
				//System.out.println(nameVariable);
				
				//1.2-Lastname Checking
				boolean lastNameVariable;
				lastNameVariable = checkManager.lastNameCheckService(user.getLastName());
				//System.out.println(lastNameVariable);
				
				// 1.3- Password Check Session
				boolean passwordVariable;
				passwordVariable = checkManager.passwordCheckService(user.getPassword());
				/*System.out.println(variable);*/
				
				//1.4- Email format Check Session
				boolean emailVariable;
				emailVariable = checkManager.emailFormatCheckService(user.geteMail());
				//System.out.println(emailVariable);
				
				//1.5- Ýs email repeated?
				boolean repeatChecking;
				repeatChecking = checkManager.originEmailCheck(user,user.geteMail());
				if(repeatChecking == false) {
					System.out.println("Email is available");
					user.setEmailList(user.geteMail());
				}
				
				
				if(nameVariable == true && lastNameVariable==true && passwordVariable==true && emailVariable== true && repeatChecking == false) {
					
					userDao.add(user);
					verifyService.validationEmail(user);
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
