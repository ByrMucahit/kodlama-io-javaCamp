package business.abstracts;

import entities.concretes.User;

public interface userService {
	void signUp(User user);
	void signIn(User user);
}
