package Concrete;
import Abstract.CampaignService;
import Entities.*;

public class CampaignManager implements CampaignService{

	@Override
	public float Discount(GameRegister gameRegister, Campaign campaign) {
		// TODO Auto-generated method stub
		float newPrice=0;
		for(String label : gameRegister.getLabels()) {
			if(label == "Sport") {
				newPrice= gameRegister.getPrice()*(campaign.getRateOfDiscount()/100);
				System.out.println("This is campaign");
			}else {
				newPrice= gameRegister.getPrice();
			}
		}
		return newPrice;
	}

	
}
