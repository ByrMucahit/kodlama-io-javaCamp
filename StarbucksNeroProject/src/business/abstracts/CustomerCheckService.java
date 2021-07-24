package business.abstracts;

import java.rmi.RemoteException;

import entities.concretes.Customer;

public interface CustomerCheckService {
	boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;
}
