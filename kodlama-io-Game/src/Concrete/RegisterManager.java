package Concrete;

import Abstract.RegisterService;
import Entities.Register;

public class RegisterManager implements RegisterService {

	@Override
	public boolean SignUp(Register register) {
		// TODO Auto-generated method stub
		
		if(register.getFirstName().length()<= 0 || register.getLastName().length() <= 0 || register.getTcNo().length() <= 0 || register.getYearOfBirth().length() <= 0) {
			System.out.println("You have lefted blanking field. Please filling.");
			return false;
		}
		else {
			System.out.println("User who named"+" " + register.getFirstName() +" "+"is registered");
			System.out.println(register.getFirstName().length());
			return true;
		}
		
	}

	@Override
	public void update(Register register) {
		// TODO Auto-generated method stub
		System.out.println("Register is updated"+" "+register.getTcNo());
		
	}

	@Override
	public void delete(Register register) {
		// TODO Auto-generated method stub
		System.out.println("Register is deleted"+ register.getTcNo());
		
	}
	
	
	
	
}
