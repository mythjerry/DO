package tw.com.lccnet.model.bean;

/*
 * java bean
 * 1.提供屬性
 * 2.私有化屬性
 * 提供get set
 */

public class Student {
		private int id;
		private String name;
		private String email;
		
		//第6種方法 提供GET SET
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		
		
		
}
