package Abstract;

import Entities.GameRegister;;

public interface GameRegisterService {
	public void SignUp(GameRegister register);
	public void update(GameRegister register);
	public void delete(GameRegister register);
}
