package intefaceAbstractDemo;
import java.io.IOException;
import java.rmi.RemoteException;
import tr.gov.nvi.tckimlik.WS.*;
import java.util.*;

public class MernisServiceAdapter implements ICustomerCheckServices {
	@Override
	public boolean CustomerCheckService(Customer customer)  {
		// TODO Auto-generated method stub
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = true;
		try {
			
			result =  client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalIdentity()), customer.getFirstName().toUpperCase(new Locale("tr")), customer.getLastName().toUpperCase(new Locale("tr")), customer.getDateOfBirth());
			
		}catch(RemoteException e) {
			e.printStackTrace();
		}
		return result;	
	}
}
