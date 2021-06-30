
public class Main {
	public static void main(String[] args) {
		// Identify
		User user1 = new User();
		Student student = new Student();
		
		user1.setId(1);
		user1.setAge(22);
		user1.setFirstName("Mucahit");
		user1.setSurname("Bayar");
		user1.setmaleOrFemale("Male");
		user1.setNationalIdentity("879876546546897");
		
		student.setId(2);
		student.setAge(23);
		student.setFirstName("Muhammet");
		student.setSurname("BAYAR");
		student.setmaleOrFemale("Male");
		student.setNationalIdentity("4564654654654");
		student.setDepartmentInfo("ComputerEngineering");
		student.setEducationInfo("Konya Technical University");
		student.setEducationMailAdress("f181213168@ktun.edu.tr");
		student.setWhatCountryUserIsStudent("Turkey");
		student.setWhatStudentsGettingThisTutorialFor("To Be better than current");
		
		User[] personel = new User [] {user1,student};
		
		for(User who : personel) {
			System.out.println(who.getFirstName());
		}
		
		// Functional
		userManager usermanage = new userManager();
		usermanage.add(user1);
		usermanage.update(user1);
		usermanage.remove(user1);
		
		usermanage.add(student);
		usermanage.update(student);
		usermanage.remove(student);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(user1);
		studentManager.remove(user1);
		studentManager.update(user1);
		
		studentManager.add(student);
		studentManager.remove(student);
		studentManager.update(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(user1);
		instructorManager.update(user1);
		instructorManager.remove(user1);
		
		instructorManager.add(student);
		instructorManager.update(student);
		instructorManager.remove(student);
	}
}
