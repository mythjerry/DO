package tw.com.lccnet.model;

public class Student {
		//屬性
		private int id;
		private String name;
		private int age;
		private String address;
		
		//空參數建構子
		public Student() {
			super();
		}

		//完整參數建構子
		public Student(int id, String name, int age, String address) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
			this.address = address;
		}

		//get & set 方法
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

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
		
		
}
