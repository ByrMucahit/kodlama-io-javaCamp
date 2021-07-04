package Concrete;
import Abstract.*;
import Entities.Campaign;
import Entities.GameRegister;
import Entities.Register;
import Concrete.*;

public class ProductManager  implements ProductService{

	@Override
	public void selling(Register register, GameRegister gameRegister, Campaign campaign) {
		// TODO Auto-generated method stub
		CampaignManager campaignManager = new CampaignManager();
		float newPrice = 0;
		newPrice = campaignManager.Discount(gameRegister, campaign);
		if(newPrice == gameRegister.getPrice()) {
			System.out.println("This game is not campaing product");
			System.out.println("Name: "+gameRegister.getNameOfGame()+"\nPrice: "+gameRegister.getPrice());
		}else {
			System.out.println("This game is  campaing product");
			System.out.println("Name: "+gameRegister.getNameOfGame()+"\nNew Price: "+newPrice);
		}
		System.out.println(gameRegister.getNameOfGame()+" "+"has been selled to"+" "+register.getFirstName());
		System.out.println("Shopping Detail\n"+"Buyer: "+register.getFirstName()+"\nSeller:\n"+gameRegister.getProducedBy()+"\nPrice:\n"+gameRegister.getPrice()+"\nContent:\n"+gameRegister.getContent());
	}

	@Override
	public void refund(Register register, GameRegister gameRegister) {
		// TODO Auto-generated method stub
		System.out.println(gameRegister.getNameOfGame()+" "+"has been refunded");
		System.out.println("Shopping Detail\n"+"Buyer: "+register.getFirstName()+"\nSeller:\n"+gameRegister.getProducedBy()+"\nPrice:\n"+gameRegister.getPrice()+"\nContent:\n"+gameRegister.getContent());
		
	}
}
