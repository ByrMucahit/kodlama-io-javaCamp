package Concrete;
import Abstract.GameRegisterService;
import Entities.GameRegister;;
public class GameRegisterManager implements GameRegisterService{

	@Override
	public void SignUp(GameRegister gameRegister) {
		// TODO Auto-generated method stub
		if(gameRegister.getContent().length()<=0 || gameRegister.getLabels().equals(0) || gameRegister.getNameOfGame().length() <= 0 || gameRegister.getProducedBy().length()<=0) {
			System.out.println("You have lefted blanked field. Please filling");
		}else {
			System.out.println("Game have been added to digital market place ."+" "+"Detail:\n"+"Name: "+gameRegister.getNameOfGame()+"\nPrice:\n"+gameRegister.getPrice()+"\nContent:\n"+gameRegister.getContent());
			for (String label: gameRegister.getLabels()) {
				System.out.println(label);
			}
			
		}
	}

	@Override
	public void update(GameRegister gameRegister) {
		// TODO Auto-generated method stub
		System.out.println("Game is updated "+gameRegister.getNameOfGame());
		
	}

	@Override
	public void delete(GameRegister gameRegister) {
		// TODO Auto-generated method stub
		System.out.println("Game is deleted "+gameRegister.getNameOfGame());
		
	}

	

}
