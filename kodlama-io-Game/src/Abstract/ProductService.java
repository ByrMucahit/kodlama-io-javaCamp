package Abstract;
import Entities.*;
public interface ProductService {
	public void selling(Register register, GameRegister gameRegister, Campaign Campaign);
	public void refund(Register register, GameRegister gameRegister);
}
