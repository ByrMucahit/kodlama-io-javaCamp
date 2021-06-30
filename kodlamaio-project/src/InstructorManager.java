
public class InstructorManager extends userManager {
	
	@Override
	public void add(User user) {
		System.out.println("Instrucot is added");
		System.out.println("Id: "+user.getId()+" Name: "+user.getFirstName());
	}
	@Override
	public void update(User user) {
		System.out.println("Instructor is updated");
		System.out.println("Id: "+user.getId()+" Name:"+user.getFirstName());
	}
	@Override
	public void remove(User user) {
		System.out.println("Instructor is removed");
		System.out.println("Id: "+user.getId()+"Name: "+user.getFirstName());
	}	
}
