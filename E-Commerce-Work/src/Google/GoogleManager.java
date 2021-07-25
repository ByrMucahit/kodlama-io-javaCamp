package Google;



public class GoogleManager {
	public boolean gMailVerification(String mail, String password) {
		if(mail.isEmpty() == true && password.isEmpty() == true) {
			System.out.println("Please sure that you have filled all field"+"sended by Google");
			return false;
		}
		else {
			System.out.println("Verification mail has been sended by Google");
			verifyGmail(mail);
			return true;
		}
	}
	
	public boolean verifyGmail(String mail) {
		System.out.println("Your account has been activated"+","+"Welcome "+mail);
		return true;
	}
}
