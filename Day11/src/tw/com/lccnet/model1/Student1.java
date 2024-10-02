package tw.com.lccnet.model1;

public class Student1 extends Person{
	
		public void sMethod() {
			System.out.println("student1");
		}
		//同名方法
		public void pMethod() {
			System.out.println("student1");
		}
}
