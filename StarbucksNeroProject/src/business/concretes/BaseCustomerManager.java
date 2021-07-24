package business.concretes;

import java.rmi.RemoteException;

import business.abstracts.CustomerService;
import entities.concretes.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void Save(Customer customer) throws NumberFormatException, RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Save to db : "+ customer.getFirstName());
	}

}
