package tw.com.lccnet.model.bean;

public class Student {
			private Integer sId;
			private String sName;
			private String sPass;
			private String sEmail;
			private String sAddress;
			//建立空參數建構子
			public Student() {
				super();
			}
			//建立get/set
			public Integer getsId() {
				return sId;
			}
			public void setsId(Integer sId) {
				this.sId = sId;
			}
			public String getsName() {
				return sName;
			}
			public void setsName(String sName) {
				this.sName = sName;
			}
			public String getsPass() {
				return sPass;
			}
			public void setsPass(String sPass) {
				this.sPass = sPass;
			}
			public String getsEmail() {
				return sEmail;
			}
			public void setsEmail(String sEmail) {
				this.sEmail = sEmail;
			}
			public String getsAddress() {
				return sAddress;
			}
			public void setsAddress(String sAddress) {
				this.sAddress = sAddress;
			}
			//建立toString()
			@Override
			public String toString() {
				return "Student [sId=" + sId + ", sName=" + sName + ", sPass=" + sPass + ", sEmail=" + sEmail
						+ ", sAddress=" + sAddress + "]";
			}		
			
}
