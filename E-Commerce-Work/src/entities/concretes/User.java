package entities.concretes;

import java.util.ArrayList;
import java.util.List;

public class User {

		private String firstName;
		private String lastName;
		private String eMail;
		private String password;
		private List<String> emailList = new ArrayList<>();
		
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String geteMail() {
			return eMail;
		}
		public void seteMail(String eMail) {
			this.eMail = eMail;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
			
			
		}
		public void setEmailList(String eMail) {
			this.emailList.add(eMail);
		}
		
		public List<String> getEmailList(){
			return this.emailList;
		}
		
		
}
