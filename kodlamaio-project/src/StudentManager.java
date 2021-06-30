
public class StudentManager extends userManager {
	@Override
	public void add(User user) {
		System.out.println("Student is added");
		System.out.println("Id:"+ user.getId()+" Name: "+user.getFirstName());
	}
	@Override
	public void remove(User user) {
		System.out.println("Student is added");
		System.out.println("Id: "+user.getId()+" Name:"+user.getFirstName());	
	}
	@Override
	public void update(User user) {
		System.out.println("Student is updated");
		System.out.println("Id: "+user.getId()+" Name:"+user.getId());
	}
}
