import java.rmi.RemoteException;

import Adapter.MernisServiceAdapter;
import business.concretes.BaseCustomerManager;
import business.concretes.NeroCustomerManager;
import business.concretes.StarBucksCustomerManager;
import entities.concretes.Customer;

public class app {
	public static void main(String[] args) throws NumberFormatException, RemoteException {
		BaseCustomerManager customerManager = new StarBucksCustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Muhammet Mücahit");
		customer.setLastName("BAYAR");
		customer.setNationalIdentity("21158642706");
		customer.setYearOfBirth(1999);
		customerManager.Save(customer);
	}
}
