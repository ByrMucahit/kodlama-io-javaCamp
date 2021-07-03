package intefaceAbstractDemo;

public class Main {
	public static void main(String[] args) {
		
			Customer customer = new Customer();
			BaseCustomerManager customerNero = new NeroCustomerManager(new MernisServiceAdapter());
			
			
			
			BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
			customer.setDateOfBirth(1999);
			customer.setFirstName("Muhammet Mücahit");
			customer.setLastName("BAYAR");
			customer.setNationalIdentity("1");
			customerNero.Save(customer);
			//customerManager.Save(customer);
			
	}
}
