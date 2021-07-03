package intefaceAbstractDemo;

public class NeroCustomerManager extends BaseCustomerManager {
	private ICustomerCheckServices _customerCheckService;
	public NeroCustomerManager(ICustomerCheckServices customerCheck) {
		this._customerCheckService = customerCheck;
	}
	@Override
	public void Save(Customer customer) {
		if(_customerCheckService.CustomerCheckService(customer)) {
			System.out.println("It's saved");
			
		}
		else {
			System.out.println("Not a valid person");
		}
	}
}
