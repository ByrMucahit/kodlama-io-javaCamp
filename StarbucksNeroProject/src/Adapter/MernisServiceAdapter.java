package Adapter;

import java.rmi.RemoteException;

import business.abstracts.CustomerCheckService;
import entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		// TODO Auto-generated method stub
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalIdentity()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getYearOfBirth());
	}
	
}
