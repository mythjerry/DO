package tw.com.lccnet.model;
//Student 實體
public class Student {
	//屬性
	private int sId;
	private String sName;
	private String sAddress;
	//建構子
	//Test01裡面的test05()
	public Student() {
		super();
	}
	//Test01裡面的test04()
	public Student(int sId, String sName, String sAddress) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sAddress = sAddress;
	}
	//get&set方法
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsAddress() {
		return sAddress;
	}
	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}
	
	//加上toString方法
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sAddress=" + sAddress + "]";
	}
	
	
	
}
