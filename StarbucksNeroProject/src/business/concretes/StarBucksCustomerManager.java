package business.concretes;


import java.rmi.RemoteException;

import business.abstracts.CustomerCheckService;
import entities.concretes.Customer;

public class StarBucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;

	public StarBucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) throws NumberFormatException, RemoteException {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		}
		else {
			System.out.println("ERROR HAS BEEN OCCUP?ED");
		}
		
	}

}
