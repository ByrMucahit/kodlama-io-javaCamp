package business.concretes;
import java.util.regex.Pattern;

import business.abstracts.CheckService;
import entities.concretes.User;

public class CheckManager implements CheckService {

	@Override
	public boolean passwordCheckService(String password) {
		// TODO Auto-generated method stub
		if(password.length() < 6)
		{
			System.out.println("Password can not be less then 6 characters at least");
			return false;
		}
		else {
			return true;
		}
		
	}

	
	
	@Override
	public boolean emailFormatCheckService(String eMail) {
		
		String doc = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(doc, Pattern.CASE_INSENSITIVE);
		if(eMail.isEmpty()) {
			System.out.println("You have leaved blanking field, Please Filling email");
			return false;
		}else {
			if(pattern.matcher(eMail).find() == false) {
				System.out.println("Email is not available format of email. (ex. user@user.com)");
				return false;
			}
		}
		return true;
		
	}



	@Override
	public boolean nameCheckService(String firstName) {
		if(firstName.isEmpty() == true) {
			System.out.println("You have leaved blanked field. Please filling firstname");
			return false;
		}else if(firstName.length() < 2) {
			System.out.println("Name must be two characters at least");
			return false;
		}else {
			return true;
		}
		
	}



	@Override
	public boolean lastNameCheckService(String lastName) {
		if(lastName.isEmpty() == true) {
			System.out.println("You have leaved blanked field. Please filling lastname");
			return false;
		}else if(lastName.length()<2) { 
			
			System.out.println("Lastname must be two characters at least");
			return false;
		}
		else {
			return true;
		}
	}



	@Override
	public boolean originEmailCheck(User user,String eMail) {
		if(user.getEmailList().isEmpty() == true) {
			return false;
		}
		else {
			
		
		for(String checkUnit: user.getEmailList()) {
			System.out.println(checkUnit);
			if(eMail == checkUnit) {
				System.out.println(eMail);
				System.out.println("Email You wanted is already used, try different");
				return true;
			}
		}
		}
		return false;
		
	}

}
