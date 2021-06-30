
public class userManager {
	public void add(User user) {
		System.out.println("User is added");
		System.out.println("Id:"+ user.getId()+"\nName: "+user.getFirstName());
	}
	public void update(User user) {
		System.out.println("User is updated");
		System.out.println("Id: "+user.getId()+"\nName: "+user.getFirstName());
	}
	public void remove(User user) {
		System.out.println("User is removed");
		System.out.println("Id: "+user.getId()+ "Name: "+user.getFirstName());
	}
	
}
