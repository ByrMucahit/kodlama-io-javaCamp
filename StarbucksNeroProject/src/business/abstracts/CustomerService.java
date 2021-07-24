package business.abstracts;

import java.rmi.RemoteException;

import entities.concretes.Customer;

public interface CustomerService {
	
	void Save(Customer customer) throws NumberFormatException, RemoteException;
}
