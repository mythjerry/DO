package tw.com.lccnet.window.bean;
/*
 * java bean
 */

public class Employee {
		private int eid;
		private String ename;
		private String eemail;
		private String epass;
		private String eaddress;
		
		public Employee() {
			super();
		}

		public Employee(int eid, String ename, String eemail, String epass, String eaddress) {
			super();
			this.eid = eid;
			this.ename = ename;
			this.eemail = eemail;
			this.epass = epass;
			this.eaddress = eaddress;
		}

		public int getEid() {
			return eid;
		}

		public void setEid(int eid) {
			this.eid = eid;
		}

		public String getEname() {
			return ename;
		}

		public void setEname(String ename) {
			this.ename = ename;
		}

		public String getEemail() {
			return eemail;
		}

		public void setEemail(String eemail) {
			this.eemail = eemail;
		}

		public String getEpass() {
			return epass;
		}

		public void setEpass(String epass) {
			this.epass = epass;
		}

		public String getEaddress() {
			return eaddress;
		}

		public void setEaddress(String eaddress) {
			this.eaddress = eaddress;
		}
		
		
		
		
}
