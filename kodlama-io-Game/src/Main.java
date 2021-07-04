import Concrete.*;
import Entities.*;
public class Main {
	public static void main(String[] args) {
		Register register = new Register();
		RegisterManager registerManager = new RegisterManager();
		
		register.setFirstName("Muhammet Mücahit");
		register.setLastName("BAYAR");
		register.setTcNo("");
		register.setYearOfBith("08.01.1999");
		registerManager.SignUp(register);
		
		registerManager.delete(register);
		registerManager.update(register);
		
		GameRegister gameRegister = new GameRegister();
		gameRegister.setNameOfGame("FIFA 2020");
		gameRegister.setContent("It's Most Preffered a sport game");
		gameRegister.setPrice(155);
		String[] arr = new String[] {"Football","Game","Online","Muliplayer","Sport"};
		gameRegister.setLabels(arr);
		gameRegister.setProducedBy("EA");
		
		GameRegisterManager gameRegisterManager = new GameRegisterManager();
		gameRegisterManager.SignUp(gameRegister);
		gameRegisterManager.delete(gameRegister);
		gameRegisterManager.update(gameRegister);
		
		ProductManager productManager = new ProductManager();
		Campaign campaing = new Campaign();
		campaing.setRateOfDiscount(15);
		campaing.setWhatKindGame("SPort");
		
		productManager.selling(register, gameRegister,campaing);
		productManager.refund(register, gameRegister);
		
	}
}
