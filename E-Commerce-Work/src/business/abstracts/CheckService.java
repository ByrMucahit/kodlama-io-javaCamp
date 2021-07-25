package business.abstracts;

import entities.concretes.User;

public interface CheckService {
	
	boolean nameCheckService(String firstName);
	boolean lastNameCheckService(String lastName);
	boolean passwordCheckService(String password);
	boolean emailFormatCheckService(String eMail);
	boolean originEmailCheck(User user,String eMail);
}
