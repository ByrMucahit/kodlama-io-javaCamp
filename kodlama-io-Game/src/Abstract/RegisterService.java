package Abstract;
import Entities.Register;

public interface RegisterService {
	public boolean SignUp(Register register);
	public void update(Register register);
	public void delete(Register register);
}
